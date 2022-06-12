package workshop2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor(1,"Engin","Demiroð");
		Instructor instructor2 = new Instructor(2,"Ahmet","Demir");
		Instructor instructor3 = new Instructor(3,"Derya","Yýldýz");
		
		Instructor instructor4 = new Instructor(4,"Mert","Demir");
		Instructor instructor5 = new Instructor(4,"Zeynep","Dað");
		
		InstructorManager manager = new InstructorManager();
		manager.add(instructor1);
		manager.add(instructor2);
		manager.add(instructor3);
		manager.add(instructor4);
		manager.add(instructor5);
		
		for(Instructor instructor : manager.getAll() ) {
			System.out.println(instructor.getFirstName()+ "   "+instructor.getLastName() );
		}
		
		Course course1 = new Course(1,"Yazýlým Geliþtirici Yetiþtirme Kampý",115.5,"JavaScript");
		Course course2 = new Course(2,"Yazýlým Geliþtirici Yetiþtirme Kampý",130.2,"C# + ANGULAR");
		Course course3 = new Course(3,"Yazýlým Geliþtirici Yetiþtirme Kampý",123.7,"JAVA + REACT");
		Course course4 = new Course(4,"Programaya Giriþ için Temel Kurs",115.5,"Python");
		Course course5 = new Course(5,"Yazýlým Geliþtirici Yetiþtirme Kampý",150,"C# + ANGULAR");
		
		List<LogService> list=  new ArrayList<LogService>();
		list.add(new EmailLogService());
		list.add(new DataBaseLogService());
		list.add(new FileLogService());
		CourseManager manager1 = new CourseManager(list);
		manager1.add(course1);
		manager1.add(course2);
		manager1.add(course3);
		manager1.add(course4);
		
		for(Course course : manager1.getAll() ) {
			System.out.println(course.getCourseName()+ " =>  "+course.getCourseContent() );
		}
		
		Category category1 = new Category(1,"Programlama",4);
		Category category2 = new Category(2,"Ýngilizce",0);
		
		CategoryManager catManager = new CategoryManager();
		catManager.add(category1);
		catManager.add(category2);
		
		for(Category category : catManager.getAll()) {
			System.out.println(category.getCategoryName()+ "   "+ category.getCategoryNumberOfCourses() );

		}
		for(Instructor instructor : manager.getAll()) {
			System.out.println(instructor.getFirstName());

		}
		manager.delete(instructor1);
		
		for(Instructor instructor : manager.getAll()) {
			System.out.println(instructor.getFirstName());

		}
		
		
		manager1.delete(course5);
		
		for(Course course : manager1.getAll() ) {
			System.out.println(course.getCourseName()+ " =>  "+course.getCourseContent() );
		
		
		
		}
		
		
	}

}
