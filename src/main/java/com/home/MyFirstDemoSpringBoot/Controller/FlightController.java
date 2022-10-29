package com.home.MyFirstDemoSpringBoot.Controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.home.MyFirstDemoSpringBoot.Entity.Flight;
import com.home.MyFirstDemoSpringBoot.Repo.FlightRepo;

@Controller
public class FlightController {

    @Autowired
    private FlightRepo flightRepo;

    @RequestMapping("/findFlights")
    public String findFlights(@RequestParam("from") String from, @RequestParam("to") String to,
            @RequestParam("departureDate") @DateTimeFormat(pattern = "MM-dd-yyyy") Date departureDate, ModelMap map) {
        List<Flight> findFlights = flightRepo.findFlights(from, to, departureDate);
        System.out.println(findFlights);
        map.addAttribute("findFlights",findFlights);
        return "displayFlights";
    }
    @RequestMapping("/showCompleteReservation/{id}")
    public String showCompleteReservation(@PathVariable(name = "id") Long id,ModelMap modelMap){
        System.out.println(id);
        Optional<Flight> byId = flightRepo.findById(id);
        Flight flight = byId.get();
       modelMap.addAttribute("flight",flight);
        return "showReservation";
    }

}
