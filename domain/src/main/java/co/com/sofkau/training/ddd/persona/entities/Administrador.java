package co.com.sofkau.training.ddd.persona.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.training.ddd.persona.identities.AdministradorId;
import co.com.sofkau.training.ddd.persona.identities.UsuarioId;

public class Administrador extends Entity<AdministradorId> {
    public Administrador(AdministradorId entityId) {
        super(entityId);
    }
}
