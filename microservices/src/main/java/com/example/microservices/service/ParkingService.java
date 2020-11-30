package com.example.microservices.service;

import java.util.List;

import com.example.microservices.model.VehicleDTO;

public interface ParkingService {
	
	List<VehicleDTO> getAllVehicles();
	String park(VehicleDTO vehicleDTO);
	String unpark(Long id);
}
