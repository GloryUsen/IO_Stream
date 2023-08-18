package org.example;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private int gradeLevel;
    private Role Role;

    public Person(String firstName, String lastName, String email, String gradeLevel, org.example.Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gradeLevel = Integer.parseInt(gradeLevel);
        Role = role;
    }

    public Person(String firstName, org.example.Role valueOf, String email) {
    }

    public Person() {

    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    // getters and setters (becos strings are private)
    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public org.example.Role getRole() {
        return Role;
    }

    public void setRole(org.example.Role role) {
        Role = role;
    }

    //toString (to print ur data in a partcular structure)

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gradeLevel=" + gradeLevel +
                ", Role=" + Role +
                '}';
    }
    // equals and hascode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return getGradeLevel() == person.getGradeLevel() && Objects.equals(getFirstName(), person.getFirstName()) && Objects.equals(getLastName(), person.getLastName()) && Objects.equals(getEmail(), person.getEmail()) && getRole() == person.getRole();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getEmail(), getGradeLevel(), getRole());
    }
}
