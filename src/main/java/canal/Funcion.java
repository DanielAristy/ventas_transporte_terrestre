package canal;

import canal.values.Caracteristica;
import canal.values.Descripcion;
import canal.values.FuncionID;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Funcion extends Entity<FuncionID> {
    private Caracteristica caracteristica;
    private Descripcion descripcion;
    public Funcion(FuncionID entityId, Caracteristica caracteristica, Descripcion descripcion) {
        super(entityId);
        this.caracteristica = caracteristica;
        this.descripcion = descripcion;
    }

    public void actualizarCaracteristica(Caracteristica caracteristica){
        this.caracteristica = Objects.requireNonNull(caracteristica);
    }

    public void actualizarDescripcion(Descripcion descripcion){
        this.descripcion = Objects.requireNonNull(descripcion);
    }

    public Caracteristica caracteristica() {
        return caracteristica;
    }

    public Descripcion descripcion() {
        return descripcion;
    }
}
