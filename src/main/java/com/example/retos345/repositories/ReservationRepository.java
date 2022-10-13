package com.example.retos345.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.retos345.entities.Reservation;

public interface ReservationRepository  extends JpaRepository<Reservation, Integer>{
}
