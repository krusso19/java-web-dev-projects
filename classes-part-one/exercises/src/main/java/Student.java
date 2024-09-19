import java.util.Objects;

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

        public static String getGradeLevel(int numberOfCredits){
                if (numberOfCredits <= 29) {
                        return "freshman";
                } else if (numberOfCredits <= 59) {
                        return "sophomore";
                } else if (numberOfCredits <= 89) {
                        return "junior";
                } else {
                        return "senior";
                }
        }

        public void addGrade(int courseCredits, double courseGrade){
                double totalQualityScore = this.gpa*this.numberOfCredits;
                totalQualityScore += courseCredits*courseGrade;
                this.numberOfCredits += courseCredits;
                this.gpa += courseGrade;
                this.gpa = totalQualityScore/this.numberOfCredits;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Student student = (Student) o;
                return studentId == student.studentId;
        }

        @Override
        public int hashCode() {
                return Objects.hashCode(studentId);
        }

        @Override
        public String toString() {
                return "Student{" +
                        "name='" + name + '\'' +
                        ", studentId=" + studentId +
                        ", numberOfCredits=" + numberOfCredits +
                        ", gpa=" + gpa +
                        '}';
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
