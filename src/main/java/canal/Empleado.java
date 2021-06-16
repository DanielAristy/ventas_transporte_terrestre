package canal;

import canal.values.EmpleadoId;
import co.com.sofka.domain.generic.Entity;

public class Empleado extends Entity<EmpleadoId> {
    public Empleado(EmpleadoId entityId) {
        super(entityId);
    }
}
