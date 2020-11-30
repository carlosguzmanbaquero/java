package com.example.microservices.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.microservices.model.VehicleDTO;
import com.example.microservices.repository.ParkingRepository;
import com.example.microservices.service.ParkingService;

@Service
public class ParkingServiceImpl implements ParkingService {
	
	@Autowired
	ParkingRepository parkingRepository;
	
	public List<VehicleDTO> getAllVehicles(){
		return parkingRepository.findAll();
	}
	
	@Override
	public String park(VehicleDTO vehicleDTO) {
		if(vehicleDTO.getId()>0 && vehicleDTO.getId()<=10) {
			List<VehicleDTO> dtos = parkingRepository.findAll();
			for(VehicleDTO dto: dtos) {
				if(dto.getId() != vehicleDTO.getId()) {
					parkingRepository.save(vehicleDTO);
				}else {
					throw new RuntimeException(vehicleDTO.getId()+" slot is not vacant");
				}
			}
		}else {
			throw new RuntimeException("Kindly provide a id between 1 to 10");
		}
		return "Parked";
	}

	@Override
	public String unpark(Long id) {
		if(id >0 && id <=10){
			parkingRepository.deleteById(id);
		}else {
			throw new RuntimeException("Kindly provide a id between 1 to 10");
		}
		return "unparked vehicle at slot number "+id;
	}

}
