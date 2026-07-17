package com.megha.packagetracker.service;

import com.megha.packagetracker.entity.PackageEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
@Service

public class PackageService {
	public List<PackageEntity> getAllPackages(){
		return List.of(
				new PackageEntity(
                        1L,
                        "DTDC123",
                        "DTDC",
                        "Amazon",
                        "Megha",
                        "In Transit"
                ),
                new PackageEntity(
                        2L,
                        "BD456",
                        "Blue Dart",
                        "Flipkart",
                        "Megha",
                        "Delivered"
                )
                );
	}
	
}
