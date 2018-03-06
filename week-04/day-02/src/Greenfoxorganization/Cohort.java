package Greenfoxorganization;

import java.util.ArrayList;
import java.util.List;

public class Cohort {

  private String name;
  private List <Student> students;
  private List <Mentor> mentors;

  public Cohort(String name) {
    this.name = name;
    this.students = new ArrayList<>();
    this.mentors = new ArrayList<>();
  }

  public void info(){
    System.out.println("The " + name + "cohort has " + students.size() + "students and " + mentors.size() + " mentors.");
  }

  public void addStudent(Student name) {
    students.add(name);
  }

  public void addMentor (Mentor name) {
    mentors.add(name);
  }



}
