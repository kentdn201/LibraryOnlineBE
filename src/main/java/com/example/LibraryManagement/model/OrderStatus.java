package com.example.LibraryManagement.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@JsonIgnoreProperties
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "order_status")
public class OrderStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ROLE_CODE")
    private String roleCode;

    @Column(name = "ROLE_NAME")
    private String roleName;
}
