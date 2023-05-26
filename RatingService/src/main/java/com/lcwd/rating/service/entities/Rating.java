package com.lcwd.rating.service.entities;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "user_ratings")
public class Rating {

    @Id
    @Column(name = "RATINGid")
    private String ratingId;
    @Column(name = "USERID")
    private String userId;
    @Column(name = "HOTELID")
    private String hotelId;
    @Column(name = "RATING")
    private int rating;
    @Column(name = "FEEDBACK")
    private String feedback;
}
