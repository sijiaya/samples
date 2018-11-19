package com.soft1841.week6;

public class StudentApp {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("qqq","male"),
                new Student("www","male"),
                new Student("rrr","male")
        };
        for (Student student:students) {
            System.out.println(student);
        }
    }

}

class Student{
    private String name;
    private String gender;
    //创建无参构造器
    public Student() {
    }

    public Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "姓名" + name + "性别" + gender;
    }
}