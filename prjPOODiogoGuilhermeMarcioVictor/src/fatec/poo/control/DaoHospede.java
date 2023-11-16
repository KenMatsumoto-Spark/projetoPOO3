package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Hospede;

public class DaoHospede {

    private Connection conn;
    
    public DaoHospede(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Hospede hospede) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbhospede(CPF, NOME, ENDERECO, TELEFONE, TAXADESCONTO) VALUES(?,?,?,?,?)");
            ps.setString(1, hospede.getCpf());
            ps.setString(2, hospede.getNome());
            ps.setString(3, hospede.getEndereco());
            ps.setString(4, hospede.getTelefone());
            ps.setDouble(5, hospede.getTaxaDesconto());
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Hospede hospede) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbhospede set NOME = ?, ENDERECO = ?, TELEFONE = ?, TAXADESCONTO = ? " +
                                                 "where cpf = ?");
            
            ps.setString(5, hospede.getCpf());
            ps.setString(1, hospede.getNome());
            ps.setString(2, hospede.getEndereco());
            ps.setString(3, hospede.getTelefone());
            ps.setDouble(4, hospede.getTaxaDesconto());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
    public  Hospede consultar (String cpf) {
        Hospede hospede = null;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tbhospede where " +
                                                 "CPF = ?");
            
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                hospede = new Hospede (cpf, rs.getString("nome"));
                hospede.setEndereco( rs.getString("endereco"));
                hospede.setTelefone(rs.getString("telefone"));
                hospede.setTaxaDesconto(rs.getInt("taxadesconto"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (hospede);
    }    
     
    public void excluir(Hospede hospede) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbhospede where cpf = ?");
            
            ps.setString(1, hospede.getCpf());
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}





