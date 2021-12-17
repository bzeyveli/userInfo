package com.zeyveli.userInfo.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@EqualsAndHashCode()
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table (name = "geo")
public class Geo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "lat")
    private String lat;

    @Column (name = "lmg")
    private String lmg;
}
