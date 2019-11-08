/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trks.dacndoisweb.domain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author carlos
 */
public class Main {
    
    public static void main(String args[]){
        
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistir_dacnovodois");
        EntityManager em = emf.createEntityManager();
        
        
        Participante carlos = new Participante("carlos", "carlos.com","IFPB","88844488800","aluno","estudante");
        
        em.getTransaction().begin();
        em.persist(carlos);
        em.getTransaction().commit();
        
        Artigo artigo1 = new Artigo();
        Artigo artigo2 = new Artigo();
        Artigo artigo3 = new Artigo();
        em.getTransaction().begin();
        em.persist(artigo3);
        em.persist(artigo2);
        em.persist(artigo1);
        em.getTransaction().commit();
    
    }
    
}
