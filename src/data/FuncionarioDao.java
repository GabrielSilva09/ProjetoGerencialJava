package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class FuncionarioDao {

    Statement st;
    Connection conn;
    ResultSet rs;

    public FuncionarioDao() {
    }

    public boolean conectar() {
        //Conexão e insert no banco de dados
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/controle", "root", "");
            st = conn.createStatement();
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
    }

    public int salvar(Funcionario f) {
        int status;
        try {
            String sql;
            sql = "INSERT INTO funcionarios VALUES ('" + f.getMatricula() + "','" + f.getNome() + "','" + f.getCargo() + "'," + f.getSalario() + ")";
            status = st.executeUpdate(sql);
            return status;
        } catch (SQLException ex) {
            return ex.getErrorCode();
        }
    }

    public void desconectar() {
        try {
            conn.close();
        } catch (SQLException ex) {
        }
    }

    public Funcionario consultar(String matricula) {
        try {
            Funcionario funcionario = new Funcionario();
            String sql;
            sql = "SELECT * FROM funcionarios WHERE MATRICULA = '" + matricula + "'";
            rs = st.executeQuery(sql);
            //If para saber se ele encontrou o registro
            if (rs.next()) {//retorna os registros
                funcionario.setMatricula(rs.getString("MATRICULA"));
                funcionario.setNome(rs.getString("NOME"));
                funcionario.setCargo(rs.getString("CARGO"));
                funcionario.setSalario(rs.getDouble("SALARIO"));
                return funcionario;
            } else {//retorna nulo
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean deletar(String matricula) {
        try {
            String sql;
            sql = "DELETE FROM funcionarios WHERE MATRICULA = '" + matricula + "'";
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean alterar(Funcionario f) {
        try {
            String sql;
            sql = "UPDATE funcionarios SET NOME = '" + f.getNome() + "', CARGO = '" + f.getCargo() + "', SALARIO = " + f.getSalario() + " WHERE MATRICULA = '" + f.getMatricula() + "'";
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

}
