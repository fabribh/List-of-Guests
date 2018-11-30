package com.fabribh.party.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabribh.party.model.Guest;

public interface Guests extends JpaRepository<Guest, Long>{

}
