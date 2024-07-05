package com.kh.overriding.model;



public class VIPCustomer extends Customer {

		private double saleRatio; // 할인율
	
		public VIPCustomer(String name) {
			this.name = name;
			this.grade = "VIP";
			this.bonusRatio = 0.05;
			this.saleRatio = 0.1;
		}
		
		public double getSaleRatio() {
			return saleRatio;
		}

		public void setSaleRatio(double saleRatio) {
			this.saleRatio = saleRatio;
		}

		@Override
		public String toString() {
			return "VIPCustomer [saleRatio=" + saleRatio + ", name=" + name + 
					", grade=" + grade + ", bonusPoint="
					+ bonusPoint + ", bonusRatio=" + bonusRatio + "]";
		}
}
