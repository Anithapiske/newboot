package com.example.date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MyController {
    @GetMapping("/")
    public String getDate(){
        LocalDate todaydate=LocalDate.now();
        DateTimeFormatter fomatedate= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String result= todaydate.format(fomatedate);
        return result;
    }
}
