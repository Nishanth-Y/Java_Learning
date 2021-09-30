//Annotations, a form of metadata, provide data about a program that is not part of the program itself. Annotations have no direct effect on the operation of the code they annotate.
//
//        Annotations have a number of uses, among them:
//        1.Information for the compiler — Annotations can be used by the compiler to detect errors or suppress warnings.
//        2.Compile-time and deployment-time processing — Software tools can process annotation information to generate code, XML files, and so forth.
//        3.Runtime processing — Some annotations are available to be examined at runtime.

package com.company.Annotaion;

public class Annotations {
  private int id;
  private String name;
  private int rollno;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRollno() {
    return rollno;
  }

  public void setRollno(int rollno) {
    this.rollno = rollno;
  }
//Most used annotation in java,
//   @Override annotation informs the compiler that the element is meant
//   to override an element declared in a superclass. Overriding methods will be discussed
//   in Interfaces and Inheritance.
  @Override
  public String toString() {
    return "Annotations{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", rollno=" + rollno +
            '}';
  }
}
