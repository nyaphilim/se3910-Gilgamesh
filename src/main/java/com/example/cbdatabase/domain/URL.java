package com.example.cbdatabase.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class URL {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long urlId;
    private String name;
    private String url;

    @ManyToOne
    @JoinColumn(name = "accountId")
    private Account account;
}
