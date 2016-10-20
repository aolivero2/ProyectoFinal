/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author SERVIDOR
 */
public class LLamadas implements java.io.Serializable {

    private String operador;
    private String cantidadm;
    private String valor;

    public LLamadas(String operador, String cantidadm, String valor) {
        this.operador = operador;
        this.cantidadm = cantidadm;
        this.valor = valor;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getCantidadm() {
        return cantidadm;
    }

    public void setCantidadm(String cantidadm) {
        this.cantidadm = cantidadm;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void guardar(ObjectOutputStream salida) throws IOException {
        salida.writeObject(this);
    }

}
