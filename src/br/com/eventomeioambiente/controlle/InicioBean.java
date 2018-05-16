package br.com.eventomeioambiente.controlle;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import br.com.eventomeioambiente.dao.MinicursoDao;
import br.com.eventomeioambiente.modelo.Aluno;
import br.com.eventomeioambiente.modelo.Minicurso;

@RequestScoped
@ManagedBean(name = "InicioBean")



public class InicioBean implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	Aluno alunologado;
	List<Minicurso> minicursos;
	MinicursoDao minicursoDao;
	@PostConstruct
	public void init() {
		
		FacesContext context = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
		alunologado=(Aluno) session.getAttribute("aluno");
		minicursoDao = new MinicursoDao();
		try {
			minicursos = minicursoDao.buscarTodosMinicursos();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public String logout(){
		FacesContext context = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
		session.removeAttribute("aluno");
		return "/index";
	}

	

	public Aluno getAlunologado() {
		return alunologado;
	}

	public void setAlunologado(Aluno alunologado) {
		this.alunologado = alunologado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<Minicurso> getMinicursos() {
		return minicursos;
	}

	public void setMinicursos(List<Minicurso> minicursos) {
		this.minicursos = minicursos;
	}
	
	
	
	

}

