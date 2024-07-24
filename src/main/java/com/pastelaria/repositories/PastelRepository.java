package com.pastelaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pastelaria.entities.Pastel;

public interface PastelRepository extends JpaRepository<Pastel, Long> {

}
