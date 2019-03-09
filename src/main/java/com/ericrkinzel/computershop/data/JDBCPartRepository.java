package com.ericrkinzel.computershop.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ericrkinzel.computershop.models.Part;

@Repository
public class JDBCPartRepository implements PartRepository {

	private JdbcTemplate jdbcTemplate;
	
	public JDBCPartRepository(
		JdbcTemplate jdbcTemplate
	) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public List<Part> findAll() {
		String sql = "SELECT id, name, type FROM parts";
		return jdbcTemplate.query(sql, this::mapRowToPart);
	}
	
	private Part mapRowToPart(ResultSet rs, int rowNum) throws SQLException{
		Part part = new Part();
		part.setId(rs.getString("id"));
		part.setName(rs.getString("name"));
		part.setType(rs.getString("type"));
		return part;
	}

	@Override
	public Part findById(String id) {
		String sql = "SELECT " +
						"id, name, type " +
					"FROM parts " +
					"WHERE id = ?";
		
		return this.jdbcTemplate.queryForObject(sql, this::mapRowToPart, id);
	}

}
