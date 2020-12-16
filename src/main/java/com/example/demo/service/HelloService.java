package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@Service
public class HelloService {

    private static final String OUTPUT_FILE = "/var/log/requests.txt";

    public void saveFile() {
        ZoneId zoneId = ZoneId.of("America/Chicago");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
        writeToFile(zonedDateTime + "\n");
    }

    private static void writeToFile(String content) {
        try {
            FileWriter fw = new FileWriter(OUTPUT_FILE, true); //the true will append the new data
            fw.write(content);//appends the string to the file
            fw.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

}
