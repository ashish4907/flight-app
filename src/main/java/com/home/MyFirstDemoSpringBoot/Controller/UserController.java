package com.home.MyFirstDemoSpringBoot.Controller;

import com.home.MyFirstDemoSpringBoot.Entity.User;
import com.home.MyFirstDemoSpringBoot.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @RequestMapping("/Registration")
    public String showReg() {
        return "Register";
    }

    @RequestMapping("/showLoginPage")
    public String showLoginPage() {

        return "Login";
    }

    @RequestMapping("/saveReg")
    public String saveReg(@ModelAttribute("user") User user) {
        userRepo.save(user);
        return "Login";

    }

    @RequestMapping("/verifyLogin")
    public String verifyLogin(@RequestParam("emailId") String emailId, @RequestParam("password") String password,
            ModelMap modelMap) {

        System.out.println(emailId);
        System.out.println(password);

        User user = userRepo.findByEmail(emailId);

        if (user != null) {
            if (user.getEmail().equals(emailId) && user.getPassword().equals(password)) {
                return "findFlights";
            } else {
                modelMap.addAttribute("error", "invalid username/password");
                return "Login";
            }
        } else {
            modelMap.addAttribute("error", "invalid username/password");
            return "Login";
        }
    }

}
