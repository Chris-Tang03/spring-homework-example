package com.christang;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
public class SheldonController {

    @RequestMapping ("/BigBang")
    public String allTheGifs(Model model){
        model.addAttribute("time", LocalDateTime.now());
        return "bigbangtheory";
    }
}
