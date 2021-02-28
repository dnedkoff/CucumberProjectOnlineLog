package uni.fmi.models;

import java.util.*;

/**
 * 
 */
public class Student extends User {

    /**
     * Default constructor
     */
    public Student() {
    }

    /**
     * 
     */
    public String firstName;

    /**
     * 
     */
    public String lastName;

    /**
     * 
     */
    public int classId;

    /**
     * 
     */
  // public List<Grade>grades;

    /**
     * 
     */
    public Teacher teacher;

    /**
     * 
     */
  
    public Parent parent;

    /**
     * 
     */
    public Set<Class> students;

    /**
     * 
     */
    public Set<Grade> grades;

    /**
     * 
     */
    public void get() {
        // TODO implement here
    }

    /**
     * 
     */
    public void set() {
        // TODO implement here
    }

    /**
     * 
     */
    public void accessGradesList() {
        // TODO implement here
    }

	public void setfirstName( String firstName) {
		this.firstName = firstName;
		
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
		
	}

	public String getfirstName() {
		return firstName;
	}

	public String getlastName() {
	
		return lastName;
	}

}