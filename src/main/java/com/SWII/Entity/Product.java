package com.SWII.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Product {
		@Id 
		String productId; 
		String name; 
		double lowPrice; 
		double highPrice;
		String brand;
		String category;
		
		
		
		public Product(String productId, String name, double lowPrice, double highPrice, String brand,
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
			this.productId="";
			this.name ="";
			this.lowPrice = 0.0;
			this.highPrice = 0.0;
			this.brand = "";
			this.category = "";
		}
		
		public String getProductId() {
			return productId;
		}
		public void setProductId(String productId) {
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
