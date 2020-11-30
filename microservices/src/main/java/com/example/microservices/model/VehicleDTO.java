package com.example.microservices.model;

import javax.persistence.Entity; 
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class VehicleDTO {
	
	@Id
	private Long id;
	private String vehicleNumber;
	private String ownerName;

}
