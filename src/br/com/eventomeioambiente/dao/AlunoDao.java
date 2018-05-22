package br.com.eventomeioambiente.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.eventomeioambiente.conexao.Conexao;
import br.com.eventomeioambiente.modelo.Aluno;


public class AlunoDao {
 
	public int atualizaQrcode(Aluno aluno) throws SQLException{
		Conexao c = new Conexao();
		Connection cc = c.conectar();
		
		String atualizar = "update aluno set qrcode = '"+aluno.getQrcode()+"' where id_aluno = '"+ aluno.getIdAluno()+"'";
		
		Statement stm = (Statement)cc.createStatement();
		int result = stm.executeUpdate(atualizar);
		
		c.desconectar();
		return result;
}
	//de usuarioDao
	public Aluno buscarAluno(String matricula, String senha)
			throws SQLException {

		Conexao c = new Conexao();
		Connection cc = c.conectar();

		String consulta = "SELECT *  FROM aluno WHERE matricula ='"
				+ matricula + "' and senha = '" + senha + "'";

		Aluno u = null;

		// Usada para matricular as instruções SQL
		Statement stm = (Statement) cc.createStatement();
		ResultSet result = stm.executeQuery(consulta);

		while (result.next()) {
			u = new Aluno();
			u.setMatricula(result.getString("matricula"));
			u.setSenha(result.getString("senha"));
			u.setNome(result.getString("nome"));


		}
		c.desconectar();
		return u;
	}
	public int iserirMinicursoAluno(Aluno aluno) throws SQLException{
		Conexao c = new Conexao();
		Connection cc = c.conectar();

		String consulta = "Insert into aluno_palestra(id_aluno, id_palestra)values("
				+ aluno.getIdAluno()+ " ," + aluno.getMinicurso().getIdPalestra()
				+ ")";

		Statement stm = (Statement) cc.createStatement();
		int result = stm.executeUpdate(consulta);

		return result;
	}
}