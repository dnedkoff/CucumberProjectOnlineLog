package uni.fmi.models;


/**
 * 
 */
public class Grade {

    
  public int value;

  /**
	  * 
     */
	/**
     * Default constructor
     */
    public Grade(int value) {
        if (value < 2 || value > 6) {
            throw new IllegalArgumentException();
         } else {
            this.value = value;
         }
      }

      public int get() {
         return value;
      }


    /**
     * 
     */
  
    public int studentId;

    /**
     * 
     */
    public int subjectId;

    /**
     * 
     */
    public Subject subject;

    /**
     * 
     */
    public Student student;

    /**
     * 
     */

}