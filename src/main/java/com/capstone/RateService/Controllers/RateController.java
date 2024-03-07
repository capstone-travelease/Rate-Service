package com.capstone.RateService.Controllers;

import com.capstone.RateService.DTOs.RequestRating;
import com.capstone.RateService.DTOs.ResponseData;
import com.capstone.RateService.DTOs.ResponseStatus;
import com.capstone.RateService.Services.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class RateController {
    @Autowired
    private RateService rateService;

    public RateController(RateService rateService) {
        this.rateService = rateService;
    }

    @PostMapping("/rating")
    public ResponseStatus Rating(@RequestBody RequestRating requestRating){
        try{
            rateService.rateStar(requestRating);
            return new ResponseStatus(
                    200,
                    "Post Rating Successful",
                    "Successful"
            );
        } catch (Exception e){
            return new ResponseStatus(
                    500,
                    "Error from Server",
                    "Failure"
            );
        }
    }

    @GetMapping("/list-rating")
    public ResponseData ListRating(@RequestParam(name = "hotelId", required = true) Integer hotelId){
        rateService.listStar(hotelId);
        try {
            return new ResponseData(
                    200,
                    rateService.listStar(hotelId),
                    "Successful"
            );
        } catch (Exception e){
            return  new ResponseData(
                    500,
                    List.of(),
                    "Failure"
            );
        }
    }
}
