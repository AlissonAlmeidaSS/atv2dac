/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trks.dacndoisweb.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author carlos
 */
@Entity
@Table(name="participantes") 
public class Participante implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Integer id;
    private String nome;
    private String email;
    private String instituicao;
    private String cpf;
    private String tipoUsuario;
    private String profissao;
           
    @Embedded
    private Contato contato;
        
    @OneToOne(cascade={CascadeType.ALL})
    @JoinColumn(name="ENDERECO_ID")    
    private Endereco endereco;
    
    @OneToMany(cascade={CascadeType.ALL})
    private List<Artigo> artigos = new ArrayList<>();
    
    @OneToMany(cascade={CascadeType.ALL})
    private List<Inscricao> inscricoes = new ArrayList<>();


    public Participante() {
    }

    public Participante(String nome, String email, String instituicao, String cpf, String tipoUsuario, String profissao) {
        this.nome = nome;
        this.email = email;
        this.instituicao = instituicao;
        this.cpf = cpf;
        this.tipoUsuario = tipoUsuario;
        this.profissao = profissao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
 
}
