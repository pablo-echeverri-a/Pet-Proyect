package co.com.sofkau.training.ddd.persona.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.training.ddd.persona.identities.UsuarioId;

public class Usuario extends Entity<UsuarioId> {



    public Usuario(UsuarioId entityId) {
        super(entityId);
    }
}
