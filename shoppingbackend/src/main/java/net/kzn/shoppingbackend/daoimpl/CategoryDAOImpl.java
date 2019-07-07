package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	
	private static List<Category> categories = new ArrayList<Category>();
	static {
		
		Category category = new Category();
		category.setId(1);
		category.setName("Laptop");
		category.setDescription("Very Good Alptop");
		category.setImageURL("Lap_1.PNG");
		categories.add(category);
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Laptop");
		category1.setDescription("Very Good Alptop");
		category1.setImageURL("Lap_1.PNG");
		categories.add(category1);
		
		
		
	}

	public Category get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	public boolean add(Category category) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(Category category) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(Category category) {
		// TODO Auto-generated method stub
		return false;
	}

}
