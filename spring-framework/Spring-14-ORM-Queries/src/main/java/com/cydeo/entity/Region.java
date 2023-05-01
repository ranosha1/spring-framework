package com.cydeo.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="regions")
@Getter
@Setter
@NoArgsConstructor
public class Region extends BaseEntity {

    private String region;
    private String country;

}
