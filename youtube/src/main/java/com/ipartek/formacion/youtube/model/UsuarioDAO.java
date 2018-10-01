package com.ipartek.formacion.youtube.model;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.youtube.pojo.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UsuarioDAO implements CrudAble<Usuario> {

	private static UsuarioDAO INSTANCE = null;

	private final String SQL_GET_ALL = "SELECT id, nombre, password, rol FROM usuario ORDER BY id DESC LIMIT 1000;";
	private final String SQL_GET_BY_ID = "SELECT  id, nombre, password, rol FROM usuario WHERE id = ?;";
	private final String SQL_UPDATE = "UPDATE usuario SET nombre= ? password= ? WHERE id = ?;";
	private final String SQL_DELETE = "DELETE FROM usuario WHERE id = ?;";
	private final String SQL_INSERT = "INSERT INTO usuario (nombre, password) VALUES (?,?);";

	private UsuarioDAO() {
		super();
	}

	public static synchronized UsuarioDAO getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new UsuarioDAO();
		}
		return INSTANCE;
	}

	@Override
	public boolean insert(Usuario pojo) {
		boolean resul = false;
		
		try (Connection con = ConnectionManager.getConnection();
				PreparedStatement ps = con.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);){
			
			ps.setString(1, pojo.getNombre());
			ps.setString(2, pojo.getPass());
			
			int affectedRows = ps.executeUpdate();
			if ( affectedRows == 1 ) {
				//Conseguir ID generado
				try(ResultSet rs = ps.getGeneratedKeys()){
					while(rs.next()) {
						pojo.setId(rs.getLong(1));
						resul = true;
					}
				}
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return resul;
	}

	@Override
	public List<Usuario> getAll() {

		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		try (Connection con = ConnectionManager.getConnection();
				PreparedStatement ps = con.prepareStatement(SQL_GET_ALL);
				ResultSet rs = ps.executeQuery();) {
			
			while (rs.next()) {				
				usuarios.add( rowMapper(rs) );
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return usuarios;
	}

	@Override
	public Usuario getById(String id) {
		Usuario usuario = null;
		try (Connection con = ConnectionManager.getConnection();
			 PreparedStatement ps = con.prepareStatement(SQL_GET_BY_ID); 
			){
						
			ps.setString(1, id);
			
			try(ResultSet rs = ps.executeQuery()){			
				while (rs.next()) {
					usuario = rowMapper(rs);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return usuario;
	}

	@Override
	public boolean update(Usuario pojo) {
		boolean resul = false;
		try (Connection con = ConnectionManager.getConnection();
			 PreparedStatement ps = con.prepareStatement(SQL_UPDATE);){
			
			ps.setString(1, pojo.getNombre());
			ps.setString(2, pojo.getPass());	
			ps.setLong(3, pojo.getId());				
			if ( ps.executeUpdate() == 1 ) {
				resul = true;
			}			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return resul;
	}

	@Override
	public boolean delete(String id) {
		boolean resul = false;
		try (Connection con = ConnectionManager.getConnection();
			 PreparedStatement ps = con.prepareStatement(SQL_DELETE);){
			
			ps.setString(1, id);			
			if ( ps.executeUpdate() == 1 ) {
				resul = true;
			}			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return resul;
	}
	
	
	private Usuario rowMapper(ResultSet rs) throws Exception {
		Usuario usuario= new Usuario();
		if( rs != null) {
			usuario.setId(rs.getLong("id"));
			usuario.setNombre(rs.getString("nombre"));
			usuario.setPass(rs.getString("password"));
		}
		return usuario;
	}
	
	

}
