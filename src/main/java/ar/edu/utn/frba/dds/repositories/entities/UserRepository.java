package ar.edu.utn.frba.dds.repositories.entities;

import ar.edu.utn.frba.dds.models.users.User;
import ar.edu.utn.frba.dds.repositories.GenericRepositoryJPA;

public class UserRepository extends GenericRepositoryJPA<User> {

    private static UserRepository instance;

    public static synchronized UserRepository getInstance() {
        if (instance == null) {
            instance = new UserRepository();
        }
        instance.setEntities();
        return instance;
    }

}

