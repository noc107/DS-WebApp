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
public class ConexionHTTP {
    public String puerto;
    public String ip;

    public ConexionHTTP(String puerto, String ip) {
        this.puerto = puerto;
        this.ip = ip;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    
    public boolean conectar(){
        
        return true;
    }
}
