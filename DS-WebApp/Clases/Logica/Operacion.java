/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import Entidades.Publicacion;

/**
 *
 * @author Oswaldo
 */
public abstract class Operacion {
    public abstract boolean publicar(Publicacion publicacion);
    public abstract boolean eliminarPublicacion(Publicacion publicacion);
}
