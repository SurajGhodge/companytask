package com.task.dto;

import com.task.entity.Product;

public class ProductDTO {
    private Long id;
    private String name;
    private Double price;
    private Long categoryId;
    public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	private CategoryDTO category;
    
	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ProductDTO(Long id, String name, Double price,Long categoryId, CategoryDTO category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.categoryId = categoryId;
		this.category = category;
	}
	 public ProductDTO(Product product) {
	        this.id = product.getId();
	        this.name = product.getName();
	        this.price = product.getPrice();
	        this.category = (product.getCategory() != null) ? new CategoryDTO(product.getCategory()) : null;

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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public CategoryDTO getCategory() {
		return category;
	}
	public void setCategory(CategoryDTO category) {
		this.category = category;
	}
    
}
