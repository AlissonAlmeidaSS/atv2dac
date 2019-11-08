/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trks.dacndoisweb.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author carlos
 */


@Entity
@Table(name="artigos")
public class Artigo implements Serializable{
    
    @Id
    @SequenceGenerator(name="ARTIGO_ID", sequenceName="ARTIGO_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="ARTIGO_ID")
    private Integer id;
    private String titulo;
    private String orientador;
    private String coorientadores;
    private String modalidade;
    @Temporal(TemporalType.DATE)
    private Date dataSubmissao;
    private String urlDownload;

    public Artigo() {
    }
    

    public Artigo(int id, String titulo, String orientador, String coorientadores, String modalidade, Date dataSubmissao, String urlDownload) {
        this.id = id;
        this.titulo = titulo;
        this.orientador = orientador;
        this.coorientadores = coorientadores;
        this.modalidade = modalidade;
        this.dataSubmissao = dataSubmissao;
        this.urlDownload = urlDownload;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }

    public String getCoorientadores() {
        return coorientadores;
    }

    public void setCoorientadores(String coorientadores) {
        this.coorientadores = coorientadores;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public Date getDataSubmissao() {
        return dataSubmissao;
    }

    public void setDataSubmissao(Date dataSubmissao) {
        this.dataSubmissao = dataSubmissao;
    }

    public String getUrlDownload() {
        return urlDownload;
    }

    public void setUrlDownload(String urlDownload) {
        this.urlDownload = urlDownload;
    }
    
    
    
}
