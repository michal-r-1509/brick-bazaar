package com.michal.inventoryservice.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "items")
public class Item implements Serializable {
    @Id
    private Long id;
    private String prodNo;
    private String title;
}
