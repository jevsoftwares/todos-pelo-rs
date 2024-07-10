package br.com.jevsoftwares.todos.pelo.rs.domain.model.entity;

import br.com.jevsoftwares.todos.pelo.rs.domain.model.enums.HouseType;
import br.com.jevsoftwares.todos.pelo.rs.domain.model.enums.SpecializationType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false, unique = true, nullable = false)
    private UUID id;
    private String name;
    private String cpf;
    private String email;
    private String cellPhone;
    @Enumerated(EnumType.STRING)
    private SpecializationType specialization;
    @Enumerated(EnumType.STRING)
    private HouseType house;
}
