package br.com.jevsoftwares.todos.pelo.rs.service.impl;

import br.com.jevsoftwares.todos.pelo.rs.domain.model.UserEntityRepository;
import br.com.jevsoftwares.todos.pelo.rs.domain.model.entity.UserEntity;
import br.com.jevsoftwares.todos.pelo.rs.service.IUserService;
import io.quarkus.hibernate.reactive.panache.PanacheQuery;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

@ApplicationScoped
public class IUserServiceImpl implements IUserService {

    @Inject
    UserEntityRepository userEntityRepository;

    @Override
    public void createUser(UserEntity userEntity) {
        userEntityRepository.persist(userEntity);
    }

    @Override
    public void updateUser(UserEntity userEntity) {
        userEntityRepository.persist(userEntity);
    }

    @Override
    public Uni<List<UserEntity>> getUsers() {
        PanacheQuery<UserEntity> all = userEntityRepository.findAll();
        return all.list();
    }

    @Override
    public UserEntity getUser(UUID uuid) throws ExecutionException, InterruptedException {
        Uni<UserEntity> user = userEntityRepository.findById(uuid);
        return user.subscribeAsCompletionStage().get();
    }

    @Override
    public void deleteUser(UserEntity userEntity) {
        userEntityRepository.delete(userEntity);
    }
}
