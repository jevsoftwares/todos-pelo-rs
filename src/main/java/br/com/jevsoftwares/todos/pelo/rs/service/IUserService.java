package br.com.jevsoftwares.todos.pelo.rs.service;

import br.com.jevsoftwares.todos.pelo.rs.domain.model.entity.UserEntity;
import io.smallrye.mutiny.Uni;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

public interface IUserService {
    void createUser(UserEntity userEntity);
    void updateUser(UserEntity userEntity);
    Uni<List<UserEntity>> getUsers();
    UserEntity getUser(UUID uuid) throws ExecutionException, InterruptedException;
    void deleteUser(UserEntity userEntity);
}
