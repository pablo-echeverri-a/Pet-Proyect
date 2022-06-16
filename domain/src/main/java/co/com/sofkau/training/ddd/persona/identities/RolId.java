package co.com.sofkau.training.ddd.persona.identities;

import co.com.sofka.domain.generic.Identity;

public class RolId extends Identity {
    public RolId(String id){
        super(id);
    }

    public static RolId of(String id){
        return new RolId(id);
    }
}
