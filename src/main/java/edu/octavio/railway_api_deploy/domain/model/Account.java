package edu.octavio.railway_api_deploy.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity(name = "tb_account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    private String agency;

    @Column(precision = 2, scale = 13)
    private BigDecimal balance;

    @Column(name = "additional_limit", precision = 2, scale = 13)
    private BigDecimal limit;
}
