package ru.voin.sia.tacos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * так как этот контролер не делает ничего, только возвращает страницу, то его можно заменить кодом в классе WebConfig
 */
@Deprecated
//@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
