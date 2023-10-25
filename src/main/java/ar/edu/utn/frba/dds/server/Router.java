package ar.edu.utn.frba.dds.server;

import ar.edu.utn.frba.dds.controllers.*;
import javassist.NotFoundException;

import static io.javalin.apibuilder.ApiBuilder.*;

public class Router {

  public static void init() {

    Server.app().get("/", ctx -> {

      ctx.result("pagina de bienvenida, deberia tener links para login y explicacion de la app");
      ctx.render("public/home.hbs");
    });

    Server.app().routes(() -> {


      /*---------------------------AUTHENTIFICACIÓN-------------------------------*/
      get("/login",((AuthenticateController) FactoryController.controller("Authenticate"))::showLogin);  // TODO Nacho agregar /home adelante del /login para que venga por default con javascript
      post("/login",((AuthenticateController) FactoryController.controller("Authenticate"))::session);

      get("sign-in",((AuthenticateController) FactoryController.controller("Authenticate"))::showSignIn);
      post("sign-in",((AuthenticateController) FactoryController.controller("Authenticate"))::create);



    });
  }
}