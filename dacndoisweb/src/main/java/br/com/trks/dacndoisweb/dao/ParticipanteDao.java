/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trks.dacndoisweb.dao;

import br.com.trks.dacndoisweb.domain.Participante;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author carlos
 */
@Stateless
public class ParticipanteDao {

	@PersistenceContext(unitName = "persistedois")
	EntityManager em;    
        
	public void salvar(Participante p) {
		em.persist(p);
	}

	public void atualizar(Participante p) {
		em.merge(p);
	}

	public Participante buscar(Integer id) {
		return em.find(Participante.class, id);
	}

	public List<Participante> buscarTodas() {
		return em.createQuery("SELECT p FROM Participante p", Participante.class).getResultList();
	}        
}
