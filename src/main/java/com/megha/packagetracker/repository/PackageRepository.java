package com.megha.packagetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.megha.packagetracker.entity.PackageEntity;

public interface PackageRepository
        extends JpaRepository<PackageEntity, Long> {

}