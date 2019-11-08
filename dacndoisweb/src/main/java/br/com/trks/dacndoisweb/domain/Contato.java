/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trks.dacndoisweb.domain;


import java.io.Serializable;
import javax.persistence.Embeddable;


/**
 *
 * @author carlos
 */

@Embeddable
public class Contato implements Serializable{
    
    private String telefoneResidencial;
    private String telefoneComercial;
    private String telefoneCelular;

    public Contato() {
    }

    public Contato(String telefoneResidencial, String telefoneComercial, String telefoneCelular) {
        this.telefoneResidencial = telefoneResidencial;
        this.telefoneComercial = telefoneComercial;
        this.telefoneCelular = telefoneCelular;
    }

    public String getTelefoneResidencial() {
        return telefoneResidencial;
    }

    public void setTelefoneResidencial(String telefoneResidencial) {
        this.telefoneResidencial = telefoneResidencial;
    }

    public String getTelefoneComercial() {
        return telefoneComercial;
    }

    public void setTelefoneComercial(String telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }
    
    
    
    
    
}
