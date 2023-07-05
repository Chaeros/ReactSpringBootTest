package com.test.transport;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
import java.util.Date;
 
@RestController
public class TransportData {
	@GetMapping("/api/hello3")
    public String hello(){
        return "eeeee\n";
    }
}
