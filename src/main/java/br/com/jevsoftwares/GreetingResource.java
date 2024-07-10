package br.com.jevsoftwares;

import br.com.jevsoftwares.todos.pelo.rs.domain.model.entity.UserEntity;
import br.com.jevsoftwares.todos.pelo.rs.service.impl.IUserServiceImpl;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.UUID;
import java.util.concurrent.ExecutionException;

@Path("/hello")
public class GreetingResource {

    @Inject
    private IUserServiceImpl userService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public UserEntity user(UUID uuid) throws ExecutionException, InterruptedException {
        return userService.getUser(uuid);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String get() {
        return "Consulta";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public String insert() {
        return "Hello RESTEasy";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public String delete() {
        return "Hello RESTEasy";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String update() {
        return "Hello RESTEasy";
    }
}
