package canal;

import canal.values.Contraseña;
import canal.values.Correo;
import canal.values.CuentaID;
import canal.values.Usuario;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Cuenta extends Entity<CuentaID> {
    private Usuario usuario;
    private Correo correo;
    private Contraseña contraseña;
    public Cuenta(CuentaID entityId, Usuario usuario, Correo correo, Contraseña contraseña) {
        super(entityId);
        this.usuario = usuario;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    //Comportamientos
    public void actualizarContraseña(Contraseña contraseña){
        //Validar objeto que no sea nulo
        this.contraseña = Objects.requireNonNull(contraseña);
    }


    public void actualizarCorreo(Correo correo){
        //Validar objeto que no sea nulo
        this.correo = Objects.requireNonNull(correo);
    }

    public void actualizarUsuario(Usuario usuario){
        //Validar objeto que no sea nulo
        this.usuario = Objects.requireNonNull(usuario);
    }

    //Getters
    public Usuario usuario() {
        return usuario;
    }

    public Correo correo() {
        return correo;
    }

    public Contraseña contraseña() {
        return contraseña;
    }
}
