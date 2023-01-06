package com.headphone;

import java.util.List;

public class ProductAndBundles {

	private List<ProductBundle> bundles;
	private List<Product> individualProducts;
	private int discount;
	private double totalPrice;

	public List<ProductBundle> getBundles() {
		return bundles;
	}

	public void setBundles(List<ProductBundle> bundles) {
		this.bundles = bundles;
	}

	public List<Product> getIndividualProducts() {
		return individualProducts;
	}

	public void setIndividualProducts(List<Product> individualProducts) {
		this.individualProducts = individualProducts;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	

}
