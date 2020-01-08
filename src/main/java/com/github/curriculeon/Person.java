package com.github.curriculeon;

/**
 * Created by leon on 1/8/2020.
 */
public class Person {
    private Long id;
    private String firstName;
    private String lastName;

    public Person(Long id, String firstName, String lastName) {
    }

    public Long getId() {
        return null;
    }

    public void setId(Long id) {
    }

    public String getFirstName() {
        return null;
    }

    public void setFirstName(String firstName) {
    }

    public String getLastName() {
        return null;
    }

    public void setLastName(String lastName) {
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object objectToCompareAgainst) {
        Person personToCompareAgainst = (Person)objectToCompareAgainst;
        String personCurrentState = personToCompareAgainst.toString();
        String thisPersonCurrentState = this.toString();
        return personCurrentState.equals(thisPersonCurrentState);
    }
}
