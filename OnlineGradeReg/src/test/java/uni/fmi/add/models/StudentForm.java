package uni.fmi.add.models;

import uni.fmi.servise.StudentService;

public class StudentForm {
	public String firstName;
	public String lastName;
	public int classId;
	private String message;
	
	
	public void addfirstName(String firstName) {
		this.firstName = firstName;
	}

	public void addlastName(String lastName) {
		this.lastName = lastName;
	}
	public void addclassId(int classId) {
		this.classId = classId;
	}
	

	public void clickStudentButton() {
		boolean isfirstNameNotValid = firstName == null || firstName.isEmpty();
		boolean islastNameNotValid = lastName == null || lastName.isEmpty();
		if (isfirstNameNotValid || islastNameNotValid) {
			message = "";
		} else {
			message = new StudentService().insert(firstName, lastName);
		}
	}

	public String getMessage() {
		return message;
	}
		
	}



