package com.SWII.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;


@Entity
@Inheritance
public  class Product {
		@Id
		Integer productId; 
		String name;
		double lowPrice;
		double highPrice;
		String brand;
		String category;
		
		
		
		public Product(Integer productId, String name, double lowPrice, double highPrice, String brand,
				String category) {
			super();
			this.productId = productId;
			this.name = name;
			this.lowPrice = lowPrice;
			this.highPrice = highPrice;
			this.brand = brand;
			this.category = category;
		}
		
		public Product() {
			super();
			this.name ="";
			this.lowPrice = 0.0;
			this.highPrice = 0.0;
			this.brand = "";
			this.category = "";
		}
		
		public Integer getProductId() {
			return productId;
		}
		public void setProductId(Integer productId) {
			this.productId = productId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getLowPrice() {
			return lowPrice;
		}
		public void setLowPrice(double lowPrice) {
			this.lowPrice = lowPrice;
		}
		public double getHighPrice() {
			return highPrice;
		}
		public void setHighPrice(double highPrice) {
			this.highPrice = highPrice;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		
		
		

}
