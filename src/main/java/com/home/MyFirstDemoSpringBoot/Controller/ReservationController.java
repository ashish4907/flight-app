package com.home.MyFirstDemoSpringBoot.Controller;

import com.home.MyFirstDemoSpringBoot.DTO.ReservationRequest;
import com.home.MyFirstDemoSpringBoot.Service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReservationController {
@Autowired
    private ReservationService reservationService;
    @RequestMapping("/completeReservation")
    public String completeReservation(ReservationRequest reservationRequest) {

        System.out.println(reservationRequest);

        reservationService.bookFlight(reservationRequest);    

        return "";
    }

}
