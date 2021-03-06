package app.admin;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Vicky on 03/07/2016.
 */
public class AdminModel {
    @Setter
    @Getter
    private int id;
    @Setter @Getter private String nombre;
    @Setter @Getter private String apellido;
    @Setter @Getter private String usuario;
    @Setter @Getter private String password;

    public AdminModel(String nombre, String apellido, String usuario, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.password = password;
    }

}
