public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private Integer yearsTeaching;

    protected String getFirstName(){
        return firstName;
    }
    private void setFirstName(String firstName){
        this.firstName=firstName;
    }
    protected String getLastName(){
        return lastName;
    }
    private void setLastName(String lastName){
        this.lastName=lastName;
    }
    protected String getSubject(){
        return subject;
    }
    private void setSubject(String subject){
        this.subject=subject;
    }
    protected Integer getYearsTeaching(){
        return yearsTeaching;
    }
    private void setYearsTeaching(Integer yearsTeaching){
        this.yearsTeaching = yearsTeaching;
    }
}
