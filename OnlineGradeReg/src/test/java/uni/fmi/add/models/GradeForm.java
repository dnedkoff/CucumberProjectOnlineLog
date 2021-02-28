package uni.fmi.add.models;

public class GradeForm {
	

		public int value;
		public int studentId;
		public int subjectId;
		private String message;
	
		
		public void addValue(int value) {
			this.value = value;
		}
		
		public void addStudentId(int studentId) {
			this.studentId = studentId;
		}
		
		public void addSubjectId(int subjectId) {
			this.subjectId = subjectId;
		}
	     
		public String getMessage() {
			return message;
			
		}
		
	}
	

