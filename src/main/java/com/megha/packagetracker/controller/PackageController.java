package com.megha.packagetracker.controller;

import com.megha.packagetracker.entity.PackageEntity;
import com.megha.packagetracker.service.PackageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class PackageController {
	private final PackageService packageService;
	
	public PackageController(PackageService packageService) {
		this.packageService=packageService;
	}
	@GetMapping("/packages/{id}")
	public PackageEntity getPackageById(@PathVariable Long id) {
		return packageService.getPackageById(id);
	}
}
