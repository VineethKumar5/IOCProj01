//WishMessageGenerator
package com.nt.sbeans;

import java.time. LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator { 
   @Autowired // Filed Injection
   private LocalDateTime dateTime; //HAS-A property/Filed
   
      public WishMessageGenerator() {
    	  System.out.println("WishMessageGenerator::0-param constructor");
      }

//b.method having b.logic
public String showWishMessage(String user) {
//get current hour of the day
int hour=dateTime.getHour(); //24 hours format
//generate the wish message
       if(hour<12)
             return "Good Morning:"+user;
     else if(hour<16)
            return "Good Afternoon:"+user;
    else if(hour<20)
          return "Good Evening::"+user;
    else
        return "Good Night :"+user;
   }
}