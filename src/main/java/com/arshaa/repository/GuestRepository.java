package com.arshaa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arshaa.entity.Guest;
@Repository
public interface GuestRepository extends JpaRepository<Guest, Integer> {

}