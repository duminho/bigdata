package com.itbank.mvc02;

public class ProductDAO {
	
	public void insert(ProductDTO productDTO) {
		System.out.println("DB연동해서 insert sql문 실행");
		System.out.println("저장된 ID: "+productDTO.getId());
		System.out.println("저장된 NAME: "+productDTO.getName());
		System.out.println("저장된 PRICE: "+productDTO.getPrice());
		System.out.println("저장된 MILEAGE: "+productDTO.getMileage());
	}
	public void delete(ProductDTO productDTO) {
		System.out.println("DB연동해서 delete sql문 실행");
		System.out.println("삭제된 ID: "+productDTO.getId());
	}
	public void search(ProductDTO productDTO) {
		System.out.println("DB연동해서 select sql문 실행");
		System.out.println("검색된 ID: "+productDTO.getId());
		System.out.println("검색된 NAME: "+productDTO.getName());
		System.out.println("검색된 PRICE: "+productDTO.getPrice());
		System.out.println("검색된 MILEAGE: "+productDTO.getMileage());
	}
	public void reset(ProductDTO productDTO) {
		productDTO.setMileage("0");
	}
	
}
