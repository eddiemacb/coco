package com.gwl.gc.productcompareangular.controller;

import com.gwl.gc.productcompareangular.data.product.Product;
import com.gwl.gc.productcompareangular.data.product.Product.Color;
import com.gwl.gc.productcompareangular.data.product.Product.Condition;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {

	@RequestMapping("/products")
	public List<Product> getProducts() {
		Condition newCondition = Condition.New;
		Condition usedCondition = Condition.Used;

		int chairId = 1;
		String chairName = "chair";
		String chairDescription = "Black chair";
		String chairImageUrl = "https://devitems.com/preview/furnish/img/product/1.jpg";
		float chairPrice = 39;
		List<Color> chairColors = Arrays.asList(Color.red, Color.green, Color.blue);

		int lampId = 2;
		String lampName = "lamp";
		String lampDescription = "Amazing lamp";
		String lampImageUrl = "https://devitems.com/preview/furnish/img/product/2.jpg";
		float lampPrice = 319;
		List<Color> lampColors = Arrays.asList(Color.green, Color.blue);

		int statueId = 3;
		String statueName = "statue";
		String statueDescription = "Used statue";
		String statueImageUrl = "https://devitems.com/preview/furnish/img/product/3.jpg";
		float statuePrice = 239;
		List<Color> statueColors = Arrays.asList(Color.red);

		int seatId = 4;
		String seatName = "seat";
		String seatDescription = "Large seat";
		String seatImageUrl = "https://devitems.com/preview/furnish/img/product/4.jpg";
		float seatPrice = 239;
		List<Color> seatColors = Arrays.asList(Color.blue);

		Product chair = createProduct(chairId, chairName, chairDescription, chairImageUrl, chairPrice, chairColors, newCondition);
		Product lamp = createProduct(lampId, lampName, lampDescription, lampImageUrl, lampPrice, lampColors, usedCondition);
		Product statue = createProduct(statueId, statueName, statueDescription, statueImageUrl, statuePrice, statueColors, usedCondition);
		Product seat = createProduct(seatId, seatName, seatDescription, seatImageUrl, seatPrice, seatColors, newCondition);

		return Arrays.asList(chair, lamp, statue, seat);
	}

	private Product createProduct(int id, String name, String description, String imageUrl, float price, List<Color> colors, Product.Condition condition) {
		Product product = new Product();
		product.setId(id);
		product.setName(name);
		product.setImageUrl(imageUrl);
		product.setDescription(description);
		product.setPrice(price);
		product.setColors(colors);
		product.setCondition(condition);

		return product;
	}

}
