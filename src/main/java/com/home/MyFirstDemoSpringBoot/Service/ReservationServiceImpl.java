package com.home.MyFirstDemoSpringBoot.Service;

import com.home.MyFirstDemoSpringBoot.DTO.ReservationRequest;
import com.home.MyFirstDemoSpringBoot.Entity.Reservation;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService {
    @Override
    public Reservation bookFlight(ReservationRequest reservationRequest) {
        return null;
    }
}
