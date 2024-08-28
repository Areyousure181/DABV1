package com.poly.Recruitment.entity;

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

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DonUngTuyen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long applicationID;

    @ManyToOne
    @JoinColumn(name = "JobID", nullable = false)
    private TinTuyenDung job;

    @ManyToOne
    @JoinColumn(name = "JobseekerID", nullable = false)
    private NguoiTimViec jobseeker;

    @Column(nullable = false)
    private String status;

    // Getters and setters (omitted for brevity)
}
