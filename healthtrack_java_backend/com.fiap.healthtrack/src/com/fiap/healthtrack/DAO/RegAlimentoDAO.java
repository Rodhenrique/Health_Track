package com.fiap.healthtrack.DAO;

import com.fiap.healthtrack.RegAlimento;
import Interface.ICrud;
import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Database.ConnectionManager;
import java.util.Date;

public class RegAlimentoDAO implements ICrud<RegAlimento> {
	
  private Connection conexao;

	@Override
    public List<RegAlimento> Consultar() {
		List<RegAlimento> alimentos = new ArrayList<RegAlimento>();
		PreparedStatement stmt = null;
	    ResultSet rs = null;
	    
	    try {
	    	conexao = ConnectionManager.getInstance().getConnection();
	        stmt = conexao.prepareStatement("SELECT * FROM RegAlimento");
	        rs = stmt.executeQuery();
	        
	        while (rs.next()) {
	            RegAlimento alimento = new RegAlimento(rs.getInt("id_registro"),rs.getDate("dt_registro"),rs.getInt("qnt_alimento"),rs.getInt("t_cliente_id_cliente"),rs.getInt("t_alimento_id_alimento"));
	        	alimentos.add(alimento);
	        }
	    	
	    }catch(Exception ex)
	    {
	    	ex.printStackTrace();
	    }finally {
	    	try {
	            stmt.close();
	            rs.close();
	            conexao.close();
	          } catch (SQLException e) {
	            e.printStackTrace();
          	}
		}
	    
	    
		return alimentos;
    }
	
	@Override
    public RegAlimento ConsultarPorId(int id) {
		RegAlimento alimento = null;	
		PreparedStatement stmt = null;
	    ResultSet rs = null;
	    
	    try {
	    	conexao = ConnectionManager.getInstance().getConnection();
	        stmt = conexao.prepareStatement("SELECT * FROM RegAlimento WHERE id_registro = ?");	        
	        stmt.setInt(1, id);
	        rs = stmt.executeQuery();
	        
	        if (rs.next()){
	            alimento = new RegAlimento(rs.getInt("id_registro"),rs.getDate("dt_registro"),rs.getInt("qnt_alimento"),rs.getInt("t_cliente_id_cliente"),rs.getInt("t_alimento_id_alimento"));
	        }

	    }catch(Exception ex)
	    {
	    	ex.printStackTrace();
	    }finally {
	    	try {
	            stmt.close();
	            rs.close();
	            conexao.close();
	          } catch (SQLException e) {
	            e.printStackTrace();
          	}
		}
	    
		return alimento;
    }
	
	
    @Override
    public void Cadastrar(RegAlimento item) {
    	PreparedStatement stmt = null;
    	  
        try {
	    	conexao = ConnectionManager.getInstance().getConnection();
	        String sql = "insert into t_r_alimentos (dt_registro, qnt_alimentos, t_cliente_id_cliente, t_alimento_id_alimento) values (?,?,?,?)";
	        stmt = conexao.prepareStatement(sql);
	        stmt.setDate(1, item.getDt_registro());
	        stmt.setInt(2, item.getQnt_alimento());
	        stmt.setInt(3, item.getT_cliente_id_cliente());
	        stmt.setInt(3, item.getT_alimento_id_alimento());

	        stmt.setDate(4, data);

          stmt.executeUpdate();
          
        } catch (SQLException e) {
          e.printStackTrace();
        } finally {
          try {
            stmt.close();
            conexao.close();
          } catch (SQLException e) {
            e.printStackTrace();
          }
        }
    }


    @Override
    public void Atualizar(RegAlimento item) {
      
    }


    @Override
    public void Deletar(int id) {
		PreparedStatement stmt = null;
	    ResultSet rs = null;
	    
	    try {
	    	conexao = ConnectionManager.getInstance().getConnection();
	        String sql = "DELETE FROM RegAlimento WHERE id_registro = ?";
	        stmt = conexao.prepareStatement(sql);
	        stmt.setInt(1, id);
	        rs = stmt.executeQuery();
	        
	    }catch(Exception ex)
	    {
	    	ex.printStackTrace();
	    }finally {
	    	try {
	            stmt.close();
	            rs.close();
	            conexao.close();
	          } catch (SQLException e) {
	            e.printStackTrace();
          	}
		}
    }
}
