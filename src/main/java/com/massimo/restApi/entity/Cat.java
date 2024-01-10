package com.massimo.restApi.entity;


import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@Entity
@Table(name="cats")
@AllArgsConstructor
@NoArgsConstructor
public class Cat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    @Column(unique = true)
    private String name;
    private int age;
    private int weight;
}
