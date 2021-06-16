package canal.events;

import canal.values.Certificado;
import co.com.sofka.domain.generic.DomainEvent;

public class CertificadoCambiado extends DomainEvent {
    private Certificado certificado;

    public CertificadoCambiado(Certificado certificado) {
        super("serviciocliente.canal.certificadocambiado");
        this.certificado = certificado;
    }
}
