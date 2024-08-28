package com.poly.Recruitment.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewID;

    @ManyToOne
    @JoinColumn(name = "JobID", nullable = false)
    private TinTuyenDung job;

    @ManyToOne
    @JoinColumn(name = "ReviewerID", nullable = false)
    private NguoiTimViec reviewer;

    @Column(nullable = false)
    private Integer rating;

    @Column(length = 100)
    private String comment;

    // Getters and setters (omitted for brevity)
}
