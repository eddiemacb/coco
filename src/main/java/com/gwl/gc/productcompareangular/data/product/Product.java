package com.gwl.gc.productcompareangular.data.product;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Product {

	private int id;

	private String name;

	private String description;

	private String imageUrl;

	private float price;

	private List<Color> colors;

	private Condition condition;

	public enum Color {
		red, green, blue
	}

	public enum Condition {
		New, Used
	}

}
