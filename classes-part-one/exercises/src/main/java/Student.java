public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        public Student(String name, int studentId, int numberOfCredits, double gpa) {
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;
        }
        // Drop your getters and setters below for the Student class.
        protected String getName(){
                return name;
        }
        private void setName(String name){
                this.name = name;
        }
        protected Integer getStudentId(){
                return studentId;
        }
        private void setStudentId(Integer studentId){
                this.studentId = studentId;
        }
        protected Integer getNumberOfCredits(){
                return numberOfCredits;
        }
        private void setNumberOfCredits(Integer numberOfCredits){
                this.numberOfCredits = numberOfCredits;
        }
        protected Double getGpa(){
                return gpa;
        }
        private void setGpa(Double gpa){
                this.gpa = gpa;
        }


        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.

}
