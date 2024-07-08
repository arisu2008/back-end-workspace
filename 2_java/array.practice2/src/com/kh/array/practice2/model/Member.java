package com.kh.array.practice2.model;

public class Member {

	
		private String id;
		private String name;
		private String pwd;
		private String email;
		private char gender;
		private int age;
		private String Book;
		/* 생성자 2개, getter/setter, toString 추가 */
				
		public Member(String id2, String name2, String pwd2, String email2, char gender2, int age2) {
			// TODO Auto-generated constructor stub
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPwd() {
			return pwd;
		}
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public char getGender() {
			return gender;
		}
		public void setGender(char gender) {
			this.gender = gender;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
	
		
		@Override
		public String toString() {
			return "Member [id=" + id + ", name=" + name + ", pwd=" + pwd + ", email=" + email + ", gender=" + gender
					+ ", age=" + age + "]";
		}
		
		
		
}
