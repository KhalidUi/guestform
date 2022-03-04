
package com.arshaa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.arshaa.entity.Guest;
import com.arshaa.repository.GuestRepository;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class GuestController {
	
	@Autowired
	private GuestRepository eRepo;
	
	@GetMapping("/guest")
	public List<Guest> getAllGuest() {
		return eRepo.findAll();
	}
	
	@GetMapping("/guest/{id}")
	public Guest getGuestById(@PathVariable Integer id) {
		return eRepo.findById(id).get();
	}
	
	@PostMapping("/guest")
	public Guest saveGuestDetails(@RequestBody Guest guest) {
		return eRepo.save(guest);
	}
	
	@PutMapping("/guest")
	public Guest updateGuest(@RequestBody Guest guest) {
		return eRepo.save(guest);
	}
	
	@DeleteMapping("/guest/{id}")
	public ResponseEntity<HttpStatus> deleteById(@PathVariable Integer id) {
		eRepo.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
