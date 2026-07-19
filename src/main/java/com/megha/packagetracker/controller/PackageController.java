package com.megha.packagetracker.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.megha.packagetracker.entity.PackageEntity;
import com.megha.packagetracker.service.PackageService;

@RestController
@RequestMapping("/packages")
public class PackageController {

    private final PackageService packageService;

    public PackageController(PackageService packageService) {
        this.packageService = packageService;
    }

    @GetMapping
    public List<PackageEntity> getPackages() {
        return packageService.getAllPackages();
    }

    @GetMapping("/{id}")
    public PackageEntity getPackageById(@PathVariable Long id) {
        return packageService.getPackageById(id);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<PackageEntity> updatePackage(
    	@PathVariable Long id,
    	@RequestBody PackageEntity packageEntity) {
    	
    	PackageEntity updated=packageService.updatePackage(id, packageEntity);
    	if(updated==null) {
    		return ResponseEntity.notFound().build();
    	}
    	return ResponseEntity.ok(updated);
    	}
    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePackage(@PathVariable Long id) {
    	boolean deleted = packageService.deletePackage(id);
    	if(deleted) {
    		return ResponseEntity.ok("Package deleted successfully");
    	}
    	return ResponseEntity.notFound().build();
    	}
    
    

    @PostMapping
    public PackageEntity createPackage(@RequestBody PackageEntity packageEntity) {
        return packageService.savePackage(packageEntity);
    }
    @PostMapping("/test")
    public String testPost() {
        return "POST WORKING";
    }
    @PostMapping("/echo")
    public PackageEntity echo(@RequestBody PackageEntity packageEntity) {
        return packageEntity;
    }
}