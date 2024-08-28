package com.main.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "viec_lam")
public class TimViec implements Serializable{
	@Id
    @Column(name = "title", columnDefinition = "nvarchar(255)")
    private String title;
    
    @Column(name = "company", columnDefinition = "nvarchar(255)")
    private String company;

    @Column(name = "location", columnDefinition = "nvarchar(255)")
    private String location;

    @Column(name = "salary")
    private Float salary;

    @Column(name = "img")
    private String img;
}