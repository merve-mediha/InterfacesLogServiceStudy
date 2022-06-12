package workshop2;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
	private List<Category> categories;
	
	
	public CategoryManager() {
		categories = new ArrayList<Category>();
		
	}
	
	public List<Category> getAll() {
		return categories;
		
	}

	public void add(Category category) {
		categories.add(category);
		
	}
	
	
	
	
}
