/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 *
 * @author Oswaldo
 */
public class Fabrica {
    
    public ConexionHTTP crearConexionHTTP(String puerto, String ip){
        ConexionHTTP conexion = new ConexionHTTP(puerto,ip);
        return conexion;
    }
    
    public UsuarioClienteWS crearUsuarioClienteWS(){
        UsuarioClienteWS usuarioClienteWS = new UsuarioClienteWS();
        return usuarioClienteWS;
    }
    
    public PublicacionClienteWS crearPublicacionClienteWS(){
        PublicacionClienteWS publicacionClienteWS = new PublicacionClienteWS();
        return publicacionClienteWS;
    }
    
    public ComentarioClienteWS crearComentarioClienteWS(){
        ComentarioClienteWS comentarioClienteWS = new ComentarioClienteWS();
        return comentarioClienteWS;
    }
}
