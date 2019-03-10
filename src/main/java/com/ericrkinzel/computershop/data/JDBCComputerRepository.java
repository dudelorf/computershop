package com.ericrkinzel.computershop.data;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ericrkinzel.computershop.models.Computer;

@Repository
public class JDBCComputerRepository implements ComputerRepository {

	private JdbcTemplate jdbcTemplate;
	
	public JDBCComputerRepository(
			JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public Computer findOne(Integer id) {
		String sql = "SELECT " +
				"id, name " +
				"FROM computer";
		return null;
	}

	@Override
	public List<Computer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer save(Computer computer) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private Computer mapRowToComputer(ResultSet rs, int rowNum) {
		Computer computer = new Computer();
		
		return computer;
	}

}
