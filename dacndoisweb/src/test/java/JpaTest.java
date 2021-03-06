
import br.com.trks.dacndoisweb.dao.ParticipanteDao;
import br.com.trks.dacndoisweb.domain.Participante;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.junit.InSequence;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;



@RunWith(Arquillian.class)
public class JpaTest {

	@Inject
	ParticipanteDao participanteDao;
	

	@Deployment
	public static JavaArchive criarArquivoTeste() {
		return ShrinkWrap.create(JavaArchive.class)
				.addPackage(ParticipanteDao.class.getPackage())
				.addPackage(Participante.class.getPackage())
				.addAsResource("META-INF/persistence.xml");
	}

	@Test
	@InSequence(1)
	@Ignore
	public void testeSalvarParticipante() {
		Participante p1 = new Participante();
		p1.setEmail("carlos@gmail.com");
		p1.setNome("carlos");
		participanteDao.salvar(p1);

		Participante p2 = new Participante();
		p2.setEmail("jose@gmail.com");
		p2.setNome("josé");
		participanteDao.salvar(p2);
	}
	
	/*@Test
	@InSequence(2)
	@Ignore
	public void testeSalvarEvento() {
		Evento e1 = new Evento();
		e1.setNome("Sertão Comp");
		e1.setDescricao("Sertão Comp");
		e1.setInscricao(50.00f);
		e1.setTipo(TipoEvento.CONGRESSO);
		e1.setData(new Date());
		eventoDAO.salvar(e1);
	}
	
	@Test
	@Ignore
	public void salvarPessoaComEndereco() {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Daniel");
		pessoa.setIdade(20);
		Endereco endereco = new Endereco("Rua do asfalto", "Cajazeiras", "Paraíba", "Brasil");
		pessoa.setEndereco(endereco);
		pessoaDao.salvar(pessoa);
	}
	
	@Test
	@Ignore
	public void salvarAluno() {
		Aluno aluno = new Aluno();
		aluno.setNome("José Carlos");
		Matricula matricula = new Matricula("201901281230", new Date());
		// Se o relacionamento tiver CASCADE e mappedBy, o destino do mappedBy deve ser atribuído
		matricula.setAluno(aluno);
		
		aluno.setMatricula(matricula);
		alunoDao.salvar(aluno);
	}
	
	@Test
	@Ignore
	public void salvarTelefones() {
		Pessoa pessoa = new Pessoa();
		pessoa.setIdade(21);
		pessoa.setNome("Romulo");
		List<Telefone> telefones = new ArrayList();
		telefones.add(new Telefone("83-831820138", "Celular"));
		telefones.add(new Telefone("83-32123232", "Fixo"));
		pessoa.setTelefones(telefones);
		pessoaDao.salvar(pessoa);
	}
	
	@Test
	@Ignore
	public void salvarAlunoComFaculdade() {
		Aluno aluno = new Aluno();
		aluno.setNome("Diones");
		Matricula matricula = new Matricula("201923281230", new Date());
		matricula.setAluno(aluno);
		aluno.setMatricula(matricula);
		
		Faculdade faculdade = new Faculdade();
		faculdade.setNome("Faculdade Indaiá");
		faculdade.setEndereco(new Endereco("Rua da fonte de água mineral", "Cajazeiras", "PB", "Brasil"));
		faculdadeDao.salvar(faculdade);
		
		aluno.setFaculdade(faculdade);
		alunoDao.salvar(aluno);
	}
	
	@Test
	@Ignore
	public void salvarPessoaComReserva() {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Alex");
		pessoa.setIdade(20);
		
		List<Reserva> reservas = new ArrayList();
		Reserva reserva = new Reserva("0001", "Hotel", new Date());
		reserva.setPessoa(pessoa);
		reservas.add(reserva);
		
		pessoa.setReservas(reservas);
		pessoaDao.salvar(pessoa);
	}
	
	@Test
	@Ignore
	public void criarPessoaComProdutos() {
		Produto produto1 = new Produto("Playstation 4", 2000.00f);
		produtoDao.salvar(produto1);
		
		Produto produto2 = new Produto("Iphone 5s", 700.00f);
		produtoDao.salvar(produto2);
		
		Produto produto3 = new Produto("Caneta Azul", 2.00f);
		produtoDao.salvar(produto3);
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Diogo");
		List<Produto> favoritos = new ArrayList();
		favoritos.add(produto1);
		favoritos.add(produto2);
		favoritos.add(produto3);
		pessoa.setProdutosFavoritos(favoritos);
		pessoaDao.salvar(pessoa);
		
	}
	
	@Test
	public void criarAlunoComTurmas() {
		Turma turma = new Turma("DAC");
		turmaDao.salvar(turma);
		
		Turma turma2 = new Turma("PDM");
		turmaDao.salvar(turma2);
		
		Turma turma3 = new Turma("Cálculo");
		turmaDao.salvar(turma3);
		
		Aluno aluno = new Aluno();
		aluno.setNome("Diones");
		Matricula matricula = new Matricula("201923281230", new Date());
		matricula.setAluno(aluno);
		aluno.setMatricula(matricula);
		
		List<Turma> turmas = new ArrayList();
		turmas.add(turma);
		turmas.add(turma2);
		turmas.add(turma3);
		aluno.setTurmas(turmas);
		
		alunoDao.salvar(aluno);
		
	}*/

}
