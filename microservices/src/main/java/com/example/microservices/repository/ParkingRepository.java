package com.example.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.microservices.model.VehicleDTO;

@Repository
public interface ParkingRepository extends JpaRepository<VehicleDTO, Long>{
	
}
