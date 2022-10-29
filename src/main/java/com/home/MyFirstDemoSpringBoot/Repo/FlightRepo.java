package com.home.MyFirstDemoSpringBoot.Repo;

import com.home.MyFirstDemoSpringBoot.Entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface FlightRepo extends JpaRepository<Flight, Long> {

    @Query("select f from Flight f where f.departureCity= :departureCity and f.arrivalCity= :arrivalCity and f.dateOfDeparture=:dateOfDeparture")
    List<Flight> findFlights(@Param("departureCity") String from,
                             @Param("arrivalCity") String to,
                             @Param("dateOfDeparture") Date departureDate);

}
