package com.ipartek.formacion.youtube.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.youtube.connection.ConnectionManager;
import com.ipartek.formacion.youtube.pojo.Comentario;
import com.ipartek.formacion.youtube.pojo.Usuario;

public class ComentarioDAO implements CrudAble<Comentario> {
	public static ComentarioDAO INSTANCE = null;

	private static final String SQL_GET_ALL = "SELECT 	c.id as 'id_comentario',    u.id as 'id_usuario',    fecha,    texto,    aprobado,    u.nombre"
			+ "FROM youtube.comentario as c, youtube.usuario as u" + "WHERE c.id_usuario = u.id"
			+ "ORDER BY u.id DESC LIMIT 1000;";

	private static final String SQL_GET_ALL_BY_VIDEO_ID = "SELECT 	c.id as 'id_comentario',    u.id as 'id_usuario',    fecha,    texto,    aprobado,    u.nombre "+ 
			  " FROM comentario as c , usuario as u " +
              " WHERE c.id_usuario = u.id AND "+
			  " c.id_video = ? " +
			  " ORDER BY c.id DESC LIMIT 500;";

//por abrobar 
	private static final String SQL_GET_COMENTARIOS_APROBAR = "SELECT 	c.id as 'id_comentario',    u.id as 'id_usuario',    fecha,    texto,    aprobado,    u.nombre"+ 
			  " FROM comentario as c " +
			  " INNER JOIN usuario as u ON c.id_usuario = u.id" +
			  " WHERE aprobado = 0;";
	
	//"select c.texto, c.aprobado, u.nombre from comentario as c, usuario as u where c.id_usuario = u.id AND c.aprobado = 0"
	private final String SQL_UPDATE_COMENTARIOS_APROBAR = "UPDATE comentario SET aprobado=? WHERE id=?;";

	private final String SQL_DELETE = "DELETE FROM comentario WHERE id = ?;";
	// añadir la columna de id_usuario
	private final String SQL_INSERT = "INSERT INTO `comentario` (`texto`, `id_video`, `id_usuario`) VALUES (?,?,?);";

	public static synchronized ComentarioDAO getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ComentarioDAO();
		}
		return INSTANCE;
	}

	@Override
	public boolean insert(Comentario pojo) throws Exception {
		boolean resul = false;

		try (Connection con = ConnectionManager.getConnection();
				PreparedStatement ps = con.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);) {

			ps.setString(1, pojo.getTexto().trim());
			ps.setLong(2, pojo.getVideo().getId());
			ps.setLong(3, pojo.getUsuario().getId());

			int affectedRows = ps.executeUpdate();
			if (affectedRows == 1) {
				try (ResultSet rs = ps.getGeneratedKeys()) {
					while (rs.next()) {
						pojo.setId(rs.getLong(1));
						resul = true;
					}
				}
			}

		}
		return resul;
	}

	@Override
	public List<Comentario> getAll() throws Exception {

		ArrayList<Comentario> comentarios = new ArrayList<Comentario>();
		try (Connection con = ConnectionManager.getConnection();
				PreparedStatement ps = con.prepareStatement(SQL_GET_ALL);
				ResultSet rs = ps.executeQuery();) {

			while (rs.next()) {
				comentarios.add(rowMapper(rs, null));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return comentarios;
	}

	public List<Comentario> getAllByVideo(long videoId) throws Exception {

		Comentario comentario = null;
		ArrayList<Comentario> comentarios = new ArrayList<Comentario>();
		try (Connection con = ConnectionManager.getConnection();
				PreparedStatement ps = con.prepareStatement(SQL_GET_ALL_BY_VIDEO_ID);) {

			ps.setLong(1, videoId);

			try (ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {
					comentarios.add(rowMapper(rs, comentario));
				}
			}

		}
		return comentarios;
	}
	

	public List<Comentario>  getAllAprobado() throws Exception {

		Comentario comentario = null;
		ArrayList<Comentario> comentarios = new ArrayList<Comentario>();
		try (Connection con = ConnectionManager.getConnection();
				PreparedStatement ps = con.prepareStatement(SQL_GET_COMENTARIOS_APROBAR);) {

			try (ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {
					comentarios.add(rowMapper(rs, comentario));
				}
			}

		}
		return comentarios;
	
	}
	
	public boolean updateAprobar(String[] ComAprobado) {
		boolean resul = false;
		try (Connection con = ConnectionManager.getConnection();
				PreparedStatement ps = con.prepareStatement(SQL_UPDATE_COMENTARIOS_APROBAR);) {

			for (int i = 0; i < ComAprobado.length; i++) {
				ps.setLong(1, 1);
				ps.setLong(2, Long.parseLong(ComAprobado[i]));

				int affectedRows = ps.executeUpdate();

				if (affectedRows == 1) {
					resul = true;
				}
			}
			

			

		} catch (Exception e) {
			e.printStackTrace();
		}
		return resul;
	}
	@Override
	public Comentario getById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Comentario pojo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	private Comentario rowMapper(ResultSet rs, Comentario c) throws Exception {
		if (c == null) {
			c = new Comentario();
		}

		if (rs != null) {
			c.setId(rs.getLong("id_comentario"));
			c.setAprobado(rs.getBoolean("aprobado"));
			c.setFecha(rs.getTimestamp("fecha"));
			c.setTexto(rs.getString("texto"));
		

			Usuario usuario = new Usuario();
			usuario.setId(rs.getLong("id_usuario"));
			usuario.setNombre(rs.getString("nombre"));
			c.setUsuario(usuario);

		}

		return c;
	}

}