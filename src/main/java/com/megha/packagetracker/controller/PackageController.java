package com.megha.packagetracker.controller;
import com.megha.packagetracker.entity.PackageEntity;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PackageController {
	
	@GetMapping("/packages")
	
	public List<PackageEntity> getPackages() {
		return List.of(new PackageEntity(1L,
                "DTDC123",
                "DTDC",
                "Amazon",
                "Megha",
                "In Transit"
        ),new PackageEntity(2L,
                "BD456",
                "Blue Dart",
                "Flipkart",
                "Megha",
                "Delivered"
		)
	);
	}
}
