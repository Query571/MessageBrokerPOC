package com.xoriant.repo;

import lombok.*;

import java.util.Date;
import javax.persistence.*;
@Setter
@Getter
@Entity
@Table(name = "Product")
public class ProductRepo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pId;
    private String pName;
    private String pCode;
    private Double pCost;
    private String address;
    private Date date;

}
