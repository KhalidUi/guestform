package com.arshaa.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arshaa.entity.Guest;
import com.arshaa.repository.GuestRepository;

@Service
public class GuestService {

	@Autowired
	private GuestRepository repository;

	public List<Guest> findGuest() {
		return repository.findAll();
	}

	public void save(Guest guest) {
		repository.save(guest);
	}
}