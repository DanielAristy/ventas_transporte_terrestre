package canal.events;

import canal.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreCambiado extends DomainEvent {
    private final Nombre nombre;
    public NombreCambiado(Nombre nombre) {
        super("serviciocliente.canal.nombrecambiado");
        this.nombre = nombre;
    }
}
