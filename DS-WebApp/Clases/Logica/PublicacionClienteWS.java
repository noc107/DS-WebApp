/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import Entidades.Comentario;
import Entidades.Publicacion;
import Entidades.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Oswaldo
 */
public class PublicacionClienteWS extends Operacion implements IPublicacion{
    public ArrayList<Comentario> obtenerComentarioPublicacion(Publicacion publicacion){
        
        return null;
    }
    
    public ArrayList<Publicacion> obtenerPublicacionesUsuario(Usuario usuario){
        return null;
    }

    @Override
    public boolean publicar() {
        return true;
    }

    @Override
    public boolean eliminarPublicacion() {
        return true;
    }

    @Override
    public boolean meGusta() {
        return true;
    }

    @Override
    public boolean noMeGusta() {
        return true;
    }
}
