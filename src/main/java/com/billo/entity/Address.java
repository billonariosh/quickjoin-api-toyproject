package com.billo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Embeddable
public class Address {

   @Column(name = "street")
   private String street;

   @Column(name = "city", length = 50, unique = true)
   private String city;

   @Column(name = "state", length = 100)
   private String state;

   @Column(name = "zipCode", length = 50)
   private String zipCode;


}
