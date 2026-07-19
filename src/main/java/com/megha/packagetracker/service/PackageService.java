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
//		return packageRepository.save(packageEntity);
		System.out.println("Before Save");

	    PackageEntity savedPackage = packageRepository.save(packageEntity);

	    System.out.println("After Save");

	    return savedPackage;
		
	}
	
	public PackageEntity updatePackage(Long id, PackageEntity updatedPackage) {
		PackageEntity existingPackage = packageRepository.findById(id).orElse(null);
		if(existingPackage==null) {
			return null;
		}
		existingPackage.setTrackingId(updatedPackage.getTrackingId());
		existingPackage.setCourierName(updatedPackage.getCourierName());
		existingPackage.setSender(updatedPackage.getSender());
	    existingPackage.setReceiver(updatedPackage.getReceiver());
	    existingPackage.setStatus(updatedPackage.getStatus());
	    
	    return packageRepository.save(existingPackage);
	}
	
	public boolean deletePackage(Long id) {
		if(!packageRepository.existsById(id)) {
			
			return false;
		}
		packageRepository.deleteById(id);
		return true;
	}
	
	public List<PackageEntity> getAllPackages() {
        return packageRepository.findAll();
    }

    public PackageEntity getPackageById(Long id) {
        return packageRepository.findById(id).orElse(null);
    }
    

}