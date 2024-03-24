/*@author Joshua Mokwebo 222191562
  Day : 22 March 2024
  Time : 9:10pm
  GitHub Repo :Fluffy-J Joshua@mycput


*/
package za.ac.cput.domain;

import java.util.Objects;

public class Lecturer {

    private  int employeeId;
    private String firstName;
    private String lastName ;
    private String gender;
    private double salary;
    private Contact contact;

    private Lecturer(Builder builder){
      this.employeeId = builder.employeeId;
      this.firstName = builder.firstName;
      this.lastName = builder.lastName;
      this.salary = builder.salary;
      this.gender = builder.gender;

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public Contact getContact() {
        return contact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lecturer lecturer = (Lecturer) o;
        return employeeId == lecturer.employeeId && firstName == lecturer.firstName && lastName == lecturer.lastName && Double.compare(salary, lecturer.salary) == 0 && Objects.equals(gender, lecturer.gender) && Objects.equals(contact, lecturer.contact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, firstName, lastName, gender, salary, contact);
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "\nemployeeId=" + employeeId +
                "\nfirstName=" + firstName +
                "\nlastName=" + lastName +
                "\ngender='" + gender + '\'' +
                "\nsalary=" + salary +
                "\n" + contact +
                '}';
    }

 public static class Builder {
        private int employeeId;
        private String firstName , lastName , gender ;
        private double salary ;


     public Builder setEmployeeId(int employeeId){
         this.employeeId = employeeId;
         return this;

    }

     public Builder setFirstName(String firstName){
         this.firstName = firstName;
         return this;

     }


     public Builder setLastName(String lastName){
         this.lastName = lastName;
         return this;

     }


     public Builder setSalary(Double salary){
         this.salary = salary;
         return this;

     }


     public Builder copy(Lecturer o){
         this.employeeId = o.employeeId;
         this.firstName = o.firstName;
         this.lastName = o.lastName;
         this.salary = o.salary;
         return this;
     }

public Lecturer build(){
         return new Lecturer(this);
}


 }





}
