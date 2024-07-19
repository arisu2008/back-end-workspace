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
import com.kh.model.Member2;

import config.ServerInfo;


public class MemberController2 {

		Properties p = new Properties();
		

		
		public MemberController2() {
			
			
			try {
				p.load(new FileInputStream("src/config/jdbc.properties"));
				
				Class.forName(ServerInfo.DRIVER_NAME);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		
		private static MemberController2 instance;
		
		public static MemberController2 getInstance() {
			if(instance == null) instance = new MemberController2();
			return instance;
		}
		
		public Connection getConnect() throws SQLException {
			return DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASSWORD);
		}
		
		public void closeAll(PreparedStatement ps, Connection conn) throws SQLException {
			ps.close();
			conn.close();
		}
		
		public void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
			rs.close();
			closeAll(ps, conn);
		}
	
		
		public Book printBookAll() throws SQLException {
			Connection conn = getConnect();
			
			
			String query = "SELECT * FROM book";			
			PreparedStatement ps = conn.prepareStatement(query);
						
			ResultSet rs = ps.executeQuery();
			ArrayList<Book> list = new ArrayList<>();
			
			while(rs.next()) {
				Book book = new Book();
				book.setName(rs.getString("name"));
			}
			
			
			return null;
				
			
		}
		public boolean idCheck(String id) throws SQLException {
			Connection conn = getConnect();
			PreparedStatement ps = conn.prepareStatement(p.getProperty("idCheck"));
			ps.setString(1, id);
			
			ResultSet rs = ps.executeQuery();
			String checkId = null;
			
			if(rs.next()) checkId = rs.getString("id");
			closeAll(rs, ps, conn);
			
			if(checkId!=null) return true;
			return false;
		}
		
		public boolean signUp(Member2 m) throws SQLException {
	
			if(!idCheck(m.getId())) {
				Connection conn = getConnect();
				PreparedStatement ps = conn.prepareStatement(p.getProperty("signUp"));
				ps.setString(1, m.getId());
				ps.setString(2, m.getPassword());
				ps.setString(3, m.getName());
				
				ps.executeUpdate();
				closeAll(ps,conn);
				return true;
				
			}
			return false;
			
		}
		
		public String login(String id, String password) throws SQLException {
			Connection conn = getConnect();
			PreparedStatement ps = conn.prepareStatement(p.getProperty("login"));
			ps.setString(1, id);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			String name = null;
			
			if(rs.next()) name = rs.getString("name");
			closeAll(rs, ps, conn);
			
			return name;
			
		}
		// 책 제목, 책 저자를 사용자한테 입력 받아
		public int registerBook(String name, String bookname) throws SQLException {
			
			Connection conn = getConnect();
			
			String query = "INSERT INTO book(name, bookname) VALUES(?, ?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2,  bookname);
			
			int result = ps.executeUpdate();
			
			closeAll(ps, conn);
			
			return result;
			
			
			
		}
		
		public String sellBook(String name) throws SQLException {
			
			Connection conn = getConnect();
			
			Book book = printBookAll();
			
			
			
			String query = "DELETE FROM book WHERE name = ?";
			PreparedStatement ps = conn.prepareStatement(query);
			
			ps.setString(1, name);
			
			if(ps.executeUpdate() == 1) {
				book = book.getBook();
			}
			
		}
		
		
}
	
		

