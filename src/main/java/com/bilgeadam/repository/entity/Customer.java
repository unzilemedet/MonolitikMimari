package com.bilgeadam.repository.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tblcustomer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;
    String firstname;
    String lastname;
    String email;


}
