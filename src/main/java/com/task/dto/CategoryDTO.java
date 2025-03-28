package com.task.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.task.entity.Category;

public class CategoryDTO {
    private Long id;
    private String name;
 
    private List<Long> productIds; 
	public CategoryDTO() {
		super();
		
	}

	 public CategoryDTO(Category category) {
	        this.id = category.getId();
	        this.name = category.getName();
	        if (category.getProducts() != null) {
	            this.productIds = category.getProducts().stream()
	                                     .map(product -> product.getId())
	                                     .collect(Collectors.toList());
	        }
	    }

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Long> getProductIds() {
		return productIds;
	}
	public void setProductIds(List<Long> productIds) {
		this.productIds = productIds;
	}
	
}