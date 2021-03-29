package com.Malhi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {

       /** SimpleDateFormat dateFormat =  new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String dob = "1996-11-20";
        Date parsed = dateFormat.parse(dob);
        System.out.println(parsed);
        StudyOfDate guest = new StudyOfDate("Lovepreet",new Date());
        System.out.println(guest);**/

        System.out.println(LocalDate.now().getDayOfWeek());
        System.out.println(LocalDate.now().getMonth());
        Instant inst = Instant.ofEpochSecond(180);
        System.out.println(inst);

        System.out.println(Period.ofDays(60));
        System.out.println(Duration.ofDays(90));
    }
}
