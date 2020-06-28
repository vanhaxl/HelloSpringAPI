package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@Service
public class HelloService {

    public void saveFile(){
        ZoneId zoneId = ZoneId.of("America/Chicago");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
        System.out.println(zonedDateTime);
    }


}
