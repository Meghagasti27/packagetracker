package com.megha.packagetracker.service;

import com.megha.packagetracker.entity.PackageEntity;
import com.megha.packagetracker.repository.PackageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PackageService {
	private final PackageRepository packageRepository;
	
	public PackageService(PackageRepository packageRepository) {
		this.packageRepository=packageRepository;
	}
	
	public PackageEntity savePackage(PackageEntity packageEntity) {
		return packageRepository.save(packageEntity);
	}
	
	public List<PackageEntity> getAllPackages() {
        return packageRepository.findAll();
    }

    public PackageEntity getPackageById(Long id) {
        return packageRepository.findById(id).orElse(null);
    }
    

}