package com.fileupload.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fileupload.entity.ImageData;
import java.util.Optional;


public interface StorageRepository extends JpaRepository<ImageData, Long>{
	
	Optional<ImageData> findByName(String fileName);

}
