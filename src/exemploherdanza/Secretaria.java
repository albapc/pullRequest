/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploherdanza;

import java.sql.Time;
import java.util.Date;

public class Secretaria extends Empregado {

    private String telefonoMovil;

    public Secretaria() {
        super();
    }

    public Secretaria(String nome, Date inicioTraballo, Time dataNacemento, String titulacion) {
        super(nome, inicioTraballo, dataNacemento, titulacion);

        this.telefonoMovil = telefonoMovil;
    }

    @Override
    public String toString() {
        return "Secretaria{" + "telefonoMovil=" + telefonoMovil + '}';
    }

}
