package com.practice.meritcampus;

import java.util.List;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String relationName;
    private List<Person> people;

    public Person() {
    }

    public Person(String name,
                  int age,
                  String gender,
                  String relationName,
                  List<Person> people) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.relationName = relationName;
        this.people = people;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRelationName() {
        return relationName;
    }

    public void setRelationName(String relationName) {
        this.relationName = relationName;
    }
}
