package uni.fmi.servise;

import java.util.ArrayList;
import java.util.List;

import uni.fmi.models.Student;

public class StudentService {
	

	private List<Student> students = new ArrayList<>();

	public StudentService() {
		Student student = new Student();
		student.setfirstName("Ivan");
		student.setlastName("Marinov");
		this.students.add(student);
	}

	public String insert(String firstName, String lastName) {

		boolean studentExists = students.stream()
				.anyMatch(student -> student.getfirstName().equals(firstName)
						&& student.getlastName().equals(lastName));

		return studentExists ? "Студента вече съществува!" : "Успешно въведен студент!";
	}

	
	}




