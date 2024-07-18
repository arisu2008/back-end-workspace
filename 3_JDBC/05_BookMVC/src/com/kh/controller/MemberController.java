package com.kh.controller;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.kh.model.Book;
import com.kh.model.Member;

import config.ServerInfo;


public class MemberController {

		Properties p = new Properties();
		
		public MemberController() {
			
			
			try {
				p.load(new FileInputStream("src/config/jdbc.properties"));
				
				Class.forName(ServerInfo.DRIVER_NAME);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		
		private static MemberController instance;
		
		public static MemberController getInstance() {
			if(instance == null) instance = new MemberController();
			return instance;
		}
		
		public Connection connect() throws SQLException {
			return DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASSWORD);
		}
		
		public void close(PreparedStatement ps, Connection conn) throws SQLException {
			ps.close();
			conn.close();
		}
		
		public void close(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
			rs.close();
			close(ps, conn);
		}
	
		
		public ArrayList<Book> printBookAll() throws SQLException {
			Connection conn = connect();
			
			
			String query = "SELECT * FROM book";			
			PreparedStatement ps = conn.prepareStatement(query);
						
			ResultSet rs = ps.executeQuery();
			ArrayList<Book> list = new ArrayList<>();
			
			
			
			return null;
			
			
			
		}
		public boolean idCheck(String id) throws SQLException {
			Connection conn = connect();
			PreparedStatement ps = conn.prepareStatement(p.getProperty("idCheck"));
			ps.setString(1, id);
			
			ResultSet rs = ps.executeQuery();
			String checkId = null;
			
			if(rs.next()) checkId = rs.getString("id");
			close(rs, ps, conn);
			
			if(checkId!=null) return true;
			return false;
		}
		
		public boolean signUp(Member m) throws SQLException {
	
			if(!idCheck(m.getId())) {
				Connection conn = connect();
				PreparedStatement ps = conn.prepareStatement(p.getProperty("signUp"));
				ps.setString(1, m.getId());
				ps.setString(2, m.getPassword());
				ps.setString(3, m.getName());
				
				ps.executeUpdate();
				close(ps,conn);
				return true;
				
			}
			return false;
			
		}
		
		public String login(String id, String password) throws SQLException {
			Connection conn = connect();
			PreparedStatement ps = conn.prepareStatement(p.getProperty("login"));
			ps.setString(1, id);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			String name = null;
			
			if(rs.next()) name = rs.getString("name");
			close(rs, ps, conn);
			
			return name;
			
		}
	}
		

