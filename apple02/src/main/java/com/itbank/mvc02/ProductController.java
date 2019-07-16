package com.itbank.mvc02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@RequestMapping("insert")
	public String insert(ProductDTO productDTO,ProductDAO productDAO) {
		productDAO.reset(productDTO);
		productDAO.insert(productDTO);
		return "confirm";
	}
	
	@RequestMapping("delete")
	public String Delete(ProductDTO productDTO,ProductDAO productDAO) {
		productDAO.reset(productDTO);
		productDAO.delete(productDTO);
		return "delete";
	}
	@RequestMapping("search")
	public String search(ProductDTO productDTO,ProductDAO productDAO) {
		productDAO.reset(productDTO);
		productDAO.delete(productDTO);
		return "search";
	}
	
}
