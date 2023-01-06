package com.headphone;

import java.util.ArrayList;
import java.util.List;

public class ProductBundle {

	private Product product;
	private Product compatableProduct;

	private boolean isValid = false;
	private List<String> messages;

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {

		this.messages = messages;
	}

	public void addMessage(String message) {
		if (this.messages == null) {
			this.messages = new ArrayList<>();
		}
		this.messages.add(message);
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Product getCompatableProduct() {
		return compatableProduct;
	}

	public void setCompatableProduct(Product compatableProduct) {
		this.compatableProduct = compatableProduct;
	}

}
