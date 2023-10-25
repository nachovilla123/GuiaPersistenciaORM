package ar.edu.utn.frba.dds.controllers;

import ar.edu.utn.frba.dds.repositories.entities.UserRepository;

public class FactoryController {
  public static Object controller(String nombre) {
    Object controller = null;
    switch (nombre) {
      case "Authenticate": controller = new AuthenticateController(UserRepository.getInstance()); break;
      //case "Tareas": controller = new TareasController(new RepositorioDeServicios()); break;
    }
    return controller;
  }

}
