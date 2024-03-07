package com.capstone.RateService.Repositories;

import com.capstone.RateService.DTOs.RateListDTOs;
import com.capstone.RateService.Entities.Rate;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface RateRepository extends JpaRepository<Rate,Long> {
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO Rate(hotel_id, user_id, content, star_rating, rate_date) VALUES(?1,?2,?3,?4,?5)", nativeQuery = true)
    void postRating(Integer hotelId, Integer userId, String content, Float starRating, LocalDate rateDate);

    @Query("SELECT new com.capstone.RateService.DTOs.RateListDTOs(u.fullName, r.rateDate, r.content, r.starRating, u.avatar) FROM Rate r \n" +
            "INNER JOIN Users u ON u.userId = r.userId \n" +
            "INNER JOIN Hotels h ON h.hotelId = r.hotelId\n" +
            "WHERE h.hotelId = ?1")
    List<RateListDTOs> listRating(Integer hotelId);
}
