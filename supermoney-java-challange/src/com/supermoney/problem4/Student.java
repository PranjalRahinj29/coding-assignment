package com.supermoney.problem4;

public class Student {
    int rollNo;
    String name;
    int id;
    double marks;

    public Student(int rollNo, String name, int id, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.id = id;
        this.marks = marks;
    }
    @Override public boolean equals(Object obj){
        if(this == obj){
            return  true;
        }
        if(obj==null || this.getClass() !=obj.getClass()){
            return false;
        }
        Student s1 = (Student) obj;
        return this.rollNo == s1.rollNo && this.name.equals(s1.name) && this.id ==s1.id && this.marks ==s1.marks;
    }

    public static void main(String[] args) {
        Student student1 = new Student(1,"Pranjal",10,45.4);
        Student student2 = new Student(2,"gauri",20,50.4);
        System.out.println(student1.equals(student2));

    }
}
