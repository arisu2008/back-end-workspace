package com.kh.Inherltance.child;

public class SmartPhone extends product {

		private String agency; // 통신사
		
		
		
		
		
		
		public void setAgency(String agency) {
			this.agency = agency;
		}
		
	

		@Override
		public String toString() {
			return super.toString() + ", SmartPhone [agency=" + agency + "]";
		}
		
		
}
