package canal;

import canal.events.CanalCreado;
import canal.values.CanalId;
import canal.values.Certificado;
import canal.values.Nombre;
import canal.values.Telefono;
import co.com.sofka.domain.generic.AggregateEvent;

public class Canal extends AggregateEvent<CanalId> {
    protected Nombre nombre;
    protected Certificado certificado;
    protected Telefono telefono;
    public Canal(CanalId entityId, Nombre nombre, Certificado certificado, Telefono telefono) {
        super(entityId);
        //Evento de dominio
        appendChange(new CanalCreado(nombre,certificado,telefono)).apply();
    }
}
