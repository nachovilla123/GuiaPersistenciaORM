package ar.edu.utn.frba.dds.controllers;

import ar.edu.utn.frba.dds.models.users.User;
import ar.edu.utn.frba.dds.repositories.entities.UserRepository;
import ar.edu.utn.frba.dds.server.utils.ICrudViewsHandler;
import io.javalin.http.Context;
import io.javalin.http.HttpStatus;


import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AuthenticateController implements ICrudViewsHandler {

    private UserRepository userRepository;

    public AuthenticateController(UserRepository repositorioDeUsuarios) {
        this.userRepository = repositorioDeUsuarios;
    }

    @Override
    public void index(Context context) {
        Map<String, Object> model = new HashMap<>();
        List<User> users  = this.userRepository.readAll();
        model.put("users", users);
        context.render("public/sign-in.hbs", model);
    }

    @Override
    public void show(Context context) {

    }

    public void session(Context context) {
        Map<String, Object> model = new HashMap<>();
        //todo logica para validar el usuario y iniciar sesion
        context.render("public/login.hbs", model);
    }

    public void showLogin(Context context) {
        Map<String, Object> model = new HashMap<>();
        //User user = this.userRepository.read(1);
        //model.put("user", user);
        context.render("public/login.hbs", model);
    }

    public void showSignIn(Context context) {
        //User user = this.userRepository.read(1); TODO ver como hacer para que funcione esto
        Map<String, Object> model = new HashMap<>();
        //model.put("user", user);
        context.render("public/sign-in.hbs", model);
    }

    @Override
    public void create(Context context) {
        //User user = context.bodyAsClass(User.class);  TODO Problemas para detectar el body como clase
        //this.userRepository.create(user);
        context.status(HttpStatus.CREATED);
        String nombre = context.formParam("nombre");
        String email = context.formParam("email");
        String contrasena = context.formParam("contrasena");

        // Aquí deberías agregar la lógica para guardar el usuario en la base de datos
        // Por ejemplo, puedes usar JPA o algún otro ORM para interactuar con la base de datos

        // Redirecciona al usuario a una página de éxito o realiza alguna otra acción
        context.result("Registro exitoso. ¡Bienvenido, " + nombre + email + contrasena + "!");
        context.redirect("/login");
    }

    @Override
    public void save(Context context) {

    }

    @Override
    public void edit(Context context) {

    }

    @Override
    public void update(Context context) {

    }

    @Override
    public void delete(Context context) {

    }
}
