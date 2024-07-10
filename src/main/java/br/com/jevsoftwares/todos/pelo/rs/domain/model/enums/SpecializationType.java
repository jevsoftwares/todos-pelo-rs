package br.com.jevsoftwares.todos.pelo.rs.domain.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SpecializationType {
    TEACHER("Professor"),
    TECHNICAL("Técnico"),
    ENGINEER("Engenheiro");

    private String description;
}
