package com.megha.packagetracker.service;

import com.megha.packagetracker.entity.PackageEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PackageService {

    public List<PackageEntity> getAllPackages() {
        return List.of(
                new PackageEntity(
                        1L,
                        "DTDC123",
                        "DTDC",
                        "Amazon",
                        "Megha",
                        "In Transit"
                )
        );
    }

    public PackageEntity getPackageById(Long id) {

        return new PackageEntity(
                id,
                "DTDC123",
                "DTDC",
                "Amazon",
                "Megha",
                "In Transit"
        );
    }
}