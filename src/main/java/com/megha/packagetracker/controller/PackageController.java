package com.megha.packagetracker.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

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