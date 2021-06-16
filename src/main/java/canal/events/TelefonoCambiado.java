package canal.events;

import canal.values.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class TelefonoCambiado extends DomainEvent {
    private Telefono telefono;
    public TelefonoCambiado(Telefono telefono) {
        super("serviciocliente.canal.telefonocambiado");
        this.telefono = telefono;
    }
}
