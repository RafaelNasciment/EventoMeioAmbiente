package br.com.eventomeioambiente.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.eventomeioambiente.conexao.Conexao;
import br.com.eventomeioambiente.modelo.Aluno;

public class AlunoDao {
 
	public int atualizaQrcode(Aluno aluno) throws SQLException{
		Conexao c = new Conexao();
		Connection cc = c.conectar();
		
		String atualizar = "update aluno( set qrcode = '"+aluno.getQrcode()+"' where id_aluno = '"+ aluno.getIdAluno()+"')";
		
		Statement stm = (Statement)cc.createStatement();
		int result = stm.executeUpdate(atualizar);
		
		c.desconectar();
		return result;
}
}