package canal.events;

import canal.values.Certificado;
import canal.values.Nombre;
import canal.values.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class CanalCreado extends DomainEvent {
    private final Nombre nombre;
    private final Certificado certificado;
    private final Telefono telefono;
    public CanalCreado(Nombre nombre, Certificado certificado, Telefono telefono) {
        super("serviciocliente.canalcreado");
        this.nombre = nombre;
        this.certificado = certificado;
        this.telefono = telefono;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
