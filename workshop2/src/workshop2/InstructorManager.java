package workshop2;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager {
	private List<Instructor> instructors;

	public InstructorManager() {
		instructors = new ArrayList<Instructor>();

	}

	public List<Instructor> getAll() {
		return instructors;
	}
	
	private boolean checkIfInstructorNameExists(String instructorLastName) {
		
		boolean exist =false;
		for(Instructor person: instructors) {
			if(person.getLastName()==instructorLastName) {
				exist=true;
				
			}
		}
		return exist;
	}
	
	
	public void add(Instructor instructor) {
		if(!checkIfInstructorNameExists(instructor.getLastName())) {
			instructors.add(instructor);
			
		}
		else {
			System.out.println(instructor.getFirstName() + instructor.getLastName()+"- "+"Eðitmen Eklenemez");
			
		}
	}
	public void delete(Instructor instructor) {
		instructors.remove(getByLastName(instructor.getLastName()));
	}
	
	private Instructor getByLastName(String lastName) {
		Instructor instructorToFind = null;
		for(Instructor person: instructors) {
			if(person.getLastName()== lastName) {
				instructorToFind =person;
				
			}
				
		}
		return instructorToFind;
	}

}
