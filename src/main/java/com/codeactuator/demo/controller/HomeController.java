package com.codeactuator.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping(value = "/home")
public class HomeController {

    @GetMapping
    public String machineName(){
        try {
            String machineName = InetAddress.getLocalHost().getHostName();
            String userName = System.getProperty("user.name");
            return "User <b>" + userName + "</b> logged on machine <b>" + machineName + "</b>";
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return "Could not found machine name! Got some exception!";
    }
}
