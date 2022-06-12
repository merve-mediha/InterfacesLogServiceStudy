package workshop2;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
	List<Course> courses;
	List<LogService> logServices;

	public CourseManager(List<LogService> logServices) { // constructor o sýnýfta ilk o çalýþýr.
		courses = new ArrayList<Course>();
		this.logServices = logServices;

	}

	public List<Course> getAll() {
		return courses;

	}

	private boolean checkIfCourseContentExists(String courseContent) {

		boolean exist = false;
		for (Course item : courses) {
			if (item.getCourseContent() == courseContent) {
				exist = true;

			}
		}
		return exist;
	}

	public void add(Course course) {

		// logServices.add(new DataBaseLogService());

		if (!checkIfCourseContentExists(course.getCourseContent())) {
			courses.add(course);
			for (LogService log : logServices) {
				log.log("Merve ekledi");
			}
		} else {
			System.out.println(course.getCourseContent() + "Kurs" + course.getCourseName() + "Adýyla Mevcuttur.");
		}
	}
		// for (LogService logService : logServices) {
		// logService.log("ekleme iþlemi loglandý");
		
		
		public void delete(Course course) {
			courses.remove(getByCourseContent(course.getCourseContent())) ;
		}
		
		private Course getByCourseContent(String courseContent) {
			Course courseToFind = null;
			for(Course item: courses) {
				if(item.getCourseContent()== courseContent) {
					courseToFind =item;
					
				}
					
			}
			return courseToFind;
	

	}
}
