package com.example.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.microservices.model.MyIntroduction;
import com.example.microservices.model.VehicleDTO;
import com.example.microservices.service.ParkingService;

@RestController
@RequestMapping("/parkinglot")
public class ParkingLotController {
	
	@Autowired
	ParkingService parkingService;
	
	@GetMapping("/aboutMe")
	public MyIntroduction aboutMe() {
		return MyIntroduction.builder().name("carlos").age(31).skills("java").build();
		
	}
	
	@PostMapping("/infoAboutMeSomeOne")
	public MyIntroduction infoAboutMeSomeOne(String name, int age, String skills) {
		return MyIntroduction.builder().name(name).age(age).skills(skills).build();
		
	}
	
	@GetMapping("/parkingInfo")
	public List<VehicleDTO> getAllVehicles(){
		return parkingService.getAllVehicles();
	}
	
	@PostMapping("/park")
	public String park(VehicleDTO vehicleDTO) {
		return parkingService.park(vehicleDTO);
	}

	@DeleteMapping("/unpark")
	public String unpark(Long id) {
		return parkingService.unpark(id);
	}
	
	
}
