package com.example.demodockerv1.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Where;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "roles")
@Where(clause = "is_deleted = false")
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @JsonIgnore
    @ManyToMany(mappedBy = "roles")
    private Set<Account> accounts;

    public Role(String s) {
        this.name = s;
    }
}
