package com.example.demo.service.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "order_contact")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderContractEntity {

    @Id
    private Long id;

    @Column(updatable = false)
    private LocalDateTime signDateTime= LocalDateTime.now();

    private LocalDateTime updateDateTime = LocalDateTime.now();
    private String signer;
    private String createUser;

    private String from;
    private String to;
    private String trainNo;
    private LocalDateTime time;
}
