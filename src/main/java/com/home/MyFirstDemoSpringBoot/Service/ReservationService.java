package com.home.MyFirstDemoSpringBoot.Service;

import com.home.MyFirstDemoSpringBoot.DTO.ReservationRequest;
import com.home.MyFirstDemoSpringBoot.Entity.Reservation;

public interface ReservationService {
    Reservation bookFlight(ReservationRequest reservationRequest);

}
