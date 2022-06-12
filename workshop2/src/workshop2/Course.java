package workshop2;

public class Course {
	private int courseId;
	private String courseName;
	private double courseDuration;
	private String courseContent;
	//private Category category;
	//private Instructor instructor;
	
	
	
	
	
	public int getCourseId() {
		return courseId;
	}
	public Course() {
		super();
	}
	public Course(int courseId, String courseName, double courseDuration, String courseContent) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDuration = courseDuration;
		this.courseContent = courseContent;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(double courseDuration) {
		this.courseDuration = courseDuration;
	}
	public String getCourseContent() {
		return courseContent;
	}
	public void setCourseContent(String courseContent) {
		this.courseContent = courseContent;
	}
	
	
	
	
	
}