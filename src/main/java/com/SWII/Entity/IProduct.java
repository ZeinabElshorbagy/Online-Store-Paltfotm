package com.SWII.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public abstract interface IProduct {
		@Id
		@GeneratedValue
		Integer productId=0; 
		String name="";
		double lowPrice=0.0;
		double highPrice=0.0;
		String brand="";
		String category="";
		
		
		public default int getProductId() {
			return productId;
		}
		public default String getName() {
			return name;
		}
		public default void setName(String name) {
			this.name = name;
		}
		public default double getPrice() {
			return price;
		}
		public default void setPrice(double price) {
			this.price = price;
		}
		public default String getBrand() {
			return brand;
		}
		public default void setBrand(String brand) {
			this.brand = brand;
		}
		public default String getCategory() {
			return category;
		}
		public default void setCategory(String category) {
			this.category = category;
		}
}
