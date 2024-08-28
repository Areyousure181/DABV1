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
public class Cart {

	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long cartID;

	    @ManyToOne
	    @JoinColumn(name = "UserID", nullable = false)
	    private User user;

	    @ManyToOne
	    @JoinColumn(name = "CVID", nullable = false)
	    private CV cv;
    @Column(nullable = false, length = 5)
    private String quantity;

    // Getters and setters (omitted for brevity)
}
