package br.com.jevsoftwares.todos.pelo.rs.domain.model;

import br.com.jevsoftwares.todos.pelo.rs.domain.model.entity.UserEntity;
import io.quarkus.hibernate.reactive.panache.PanacheRepository;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.UUID;

@ApplicationScoped
public interface UserEntityRepository extends PanacheRepository<UserEntity> {
    Uni<UserEntity> findById(UUID uuid);
}
