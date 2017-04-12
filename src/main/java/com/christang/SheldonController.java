package com.christang;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SheldonController {

    @RequestMapping ("/BigBang")
    public String allTheGifs(){
        return "bigbangtheory";
    }
}
