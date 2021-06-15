package canal;

import canal.values.CanalId;
import canal.values.Certificado;
import co.com.sofka.domain.generic.AggregateEvent;

public class Canal extends AggregateEvent<CanalId> {
    public Canal(CanalId entityId, Certificado certificado) {
        super(entityId);
    }
}
