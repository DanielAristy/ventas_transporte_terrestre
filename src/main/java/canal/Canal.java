package canal;

import canal.events.CanalCreado;
import canal.events.CertificadoCambiado;
import canal.events.NombreCambiado;
import canal.events.TelefonoCambiado;
import canal.values.CanalId;
import canal.values.Certificado;
import canal.values.Nombre;
import canal.values.Telefono;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;

public class Canal extends AggregateEvent<CanalId> {
    protected Nombre nombre;
    protected Certificado certificado;
    protected Telefono telefono;
    public Canal(CanalId entityId, Nombre nombre, Certificado certificado, Telefono telefono) {
        super(entityId);
        //Evento de dominio
        appendChange(new CanalCreado(nombre,certificado,telefono)).apply();
    }

    public void cambiarNombre(Nombre nombre){
        Objects.requireNonNull(nombre);
        appendChange(new NombreCambiado(nombre)).apply();
    }

    public void cambiarTelefono(Telefono telefono){
        Objects.requireNonNull(telefono);
        appendChange(new TelefonoCambiado(telefono)).apply();
    }
    public void cambiarCertificado(Certificado certificado){
        Objects.requireNonNull(certificado);
        appendChange(new CertificadoCambiado(certificado)).apply();
    }

    public Nombre nombre() {
        return nombre;
    }

    public Certificado certificado() {
        return certificado;
    }

    public Telefono telefono() {
        return telefono;
    }
}
