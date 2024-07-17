package com.kh.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.kh.model.Member;

public class MemberController {
		
	public MemberController() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}		
	}
	
	public Connection getConnect() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/member", "root", "qwer1234");
	}
	
	public void closeAll(PreparedStatement ps, Connection conn) throws SQLException {
		ps.close();
		conn.close();
	}
	
	public void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
		rs.close();
		closeAll(ps, conn);
	}
	

	
	// !
	public int signUp(String id, String password, String name) throws SQLException {
		
		Connection conn = getConnect();
		
		String query = "INSERT INTO member(id) WHERE id = ? ";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, id);
		ps.setString(2, id);
		
		if(ps.executeUpdate() == 1) {
			id = id;
			System.out.println("이미존재하는 아이디입니다.");
		} else {
			
			closeAll(ps, conn);
			return 0;
		}
		// 회원가입 기능 구현! 
		// -> 아이디가 기존에 있는지 체크 여부!
		// -> member 테이블에 데이터 추가! 
		return 0;

	}
	
	public void login() {

		// 로그인 기능 구현! 
		// -> member 테이블에서 id와 password로 멤버 정보 하나 가져오기!
		
	}
	
	public void changePassword() {

		// 비밀번호 바꾸기 기능 구현!
		// -> login 메서드 활용 후 사용자 이름이 null이 아니면 member 테이블에서 id로 새로운 패스워드로 변경

	}
	
	public void changeName() {

		// 이름 바꾸기 기능 구현!
		// -> member 테이블에서 id로 새로운 이름으로 변경 
		
	}
	
}









