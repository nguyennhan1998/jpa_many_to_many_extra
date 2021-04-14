package com.example.jpamanytomanypkextra.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "publisher")
    private Set<BookPublisher> bookPublishers = new HashSet<>();
    public Publisher(String name) {
        this.name = name;
    }

}
