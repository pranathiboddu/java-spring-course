package com.example.springjdbcdemo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.springjdbcdemo.model.Alien;

@Repository
public class AlienRepo {
	
	private JdbcTemplate jdbctemplate;
	
	
	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	@Autowired
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	public void save(Alien alien)
	{
		String query = "insert into alien (id, name, tech) values(?,?,?)";
		int rows = jdbctemplate.update(query,alien.getId(),alien.getName(),alien.getTech());
		System.out.println(rows);
	}
	
	public List<Alien> getAll()
	{
//		org.springframework.jdbc.core.RowMapper<Alien> mapper = new org.springframework.jdbc.core.RowMapper<Alien>()
//		{
//			@Override
//			public Alien mapRow(ResultSet rs, int rowNum) throws SQLException {
//				Alien a = new Alien();
//				a.setId(rs.getInt(1));
//				a.setName(rs.getString(2));
//				a.setTech(rs.getString(3));
//				
//				return a;
//			}			
//		};
		
		org.springframework.jdbc.core.RowMapper<Alien> mapper = ( rs, rowNum) ->{
				Alien a = new Alien();
				a.setId(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setTech(rs.getString(3));
				
				return a;
			};			

		
		String sql ="select * from alien";		
		List<Alien> aliens = jdbctemplate.query(sql, mapper);
		return aliens;
	}

}
