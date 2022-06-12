package workshop2;

public class Category {
	private int categoryId;
	private String categoryName;
	private  int categoryNumberOfCourses;
	
	
	
	
	public Category() {
		super();
		
	}
	public Category(int categoryId, String categoryName, int categoryNumberOfCourses) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryNumberOfCourses = categoryNumberOfCourses;
		
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public int getCategoryNumberOfCourses() {
		return categoryNumberOfCourses;
	}
	public void setCategoryNumberOfCourses(int categoryNumberOfCourses) {
		this.categoryNumberOfCourses = categoryNumberOfCourses;
	}
	
	
	
	
	

}
