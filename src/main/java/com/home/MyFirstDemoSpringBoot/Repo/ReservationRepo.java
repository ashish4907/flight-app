package com.home.MyFirstDemoSpringBoot.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.home.MyFirstDemoSpringBoot.DTO.Passenger;

@Repository
public interface ReservationRepo extends JpaRepository<Passenger, Long> {

}
