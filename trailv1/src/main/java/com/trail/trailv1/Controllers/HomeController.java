package com.trail.trailv1.Controllers;

import com.trail.trailv1.Entity.Bid;
import com.trail.trailv1.Entity.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@EnableAutoConfiguration
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    public String home(){
    return "hi";
}


    @RequestMapping(value = "/registerUser", method = RequestMethod.GET, produces = "application/json",consumes = "application/json")
    public Map<String,String> submitBid(HttpServletRequest request, @RequestBody User user){
        Map<String, String> response = new HashMap<>();

        return response;

    }

    @RequestMapping(value = "/checkItem", method = RequestMethod.GET, produces = "application/json",consumes = "application/json")
    public Map<String,String> submitBid(HttpServletRequest request){
        Map<String, String> response = new HashMap<>();

        return response;

    }

    @RequestMapping(value = "/submitBid", method = RequestMethod.GET, produces = "application/json",consumes = "application/json")
    public Map<String,String> submitBid(HttpServletRequest request, @RequestBody Bid bid){
        Map<String, String> response = new HashMap<>();

        return response;

    }
    @RequestMapping(value = "/acceptBid", method = RequestMethod.GET, produces = "application/json",consumes = "application/json")
    public Map<String,String> acceptBid(HttpServletRequest request, @RequestBody Bid bid){
        Map<String, String> response = new HashMap<>();

        return response;

    }

    @RequestMapping(value = "/checkSold", method = RequestMethod.GET, produces = "application/json",consumes = "application/json")
    public Map<String,String> checkSold(HttpServletRequest request, @RequestBody Bid bid){
        Map<String, String> response = new HashMap<>();

        return response;

    }



}
