package br.com.carv.system.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.carv.system.domain.Category;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource
{
	@RequestMapping(method = RequestMethod.GET)
	public List<Category> toList()
	{
		Category category = new Category(1, "Technlogy"); 
		List<Category> list = new ArrayList<>();
		
		list.add(category);
		
		return list;
	}
}
