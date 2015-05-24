/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import Entidades.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Oswaldo
 */
public class UsuarioClienteWS implements IUsuario {

    public ArrayList<Usuario> obtenerContactos(Usuario usuario){
        ArrayList<Usuario> contactos = new ArrayList<Usuario>();
        Usuario contacto = new Usuario("Nombre","Apellido","Foto","Correo");
        contactos.add(contacto);
        return contactos;
    }

    @Override
    public boolean eliminarCuenta(Usuario usuario) {
        return true;
    }
    
}
