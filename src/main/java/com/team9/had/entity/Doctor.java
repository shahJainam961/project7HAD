package com.team9.had.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Doctor{


    @Id
    private String loginId;

    @OneToOne
    @JoinColumn(name = "citizen_id", unique = true, nullable = false)
    private Citizen citizen;

    @Column(unique = true, nullable = false)
    private String licenseId;

    @Column(nullable = false)
    private String password;

    @ManyToOne
    @JoinColumn(name = "hospital_id", nullable = false)
    private Hospital hospital;
}
