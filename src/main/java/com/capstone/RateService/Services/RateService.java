package com.capstone.RateService.Services;

import com.capstone.RateService.DTOs.RateListDTOs;
import com.capstone.RateService.DTOs.RequestRating;
import com.capstone.RateService.Repositories.RateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class RateService {
    @Autowired
    private RateRepository rateRepository;

    public RateService(RateRepository rateRepository) {
        this.rateRepository = rateRepository;
    }

    public void rateStar(RequestRating requestRating){
        Integer hotelId = requestRating.getHotelId();
        Integer userId = requestRating.getUserId();
        String content = requestRating.getContent();
        Float starRating = requestRating.getStarRate();

        rateRepository.postRating(hotelId, userId, content, starRating, LocalDate.now());
    }

    public List<RateListDTOs> listStar(Integer hotelId){
        return rateRepository.listRating(hotelId);
    }
}
