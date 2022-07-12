package com.shankar.introduction;

//Default Constructor
/*public class Constructor {
    static class Student{
        String name;
        int num;
        Student(){
            System.out.println("Hell not! GO ahead");
        }
    }*/
//parameterised Constructor
    public class Constructor {
        static class Student{
            int num;
            String name;
            Student(String name, int num){
                this.name=name;
                this.num=num;
            }
        }
        public static void main(String[] args) {
            Student stud1;
            stud1 = new Student("Shankar",90);
            System.out.print(stud1.name+" ");
            System.out.print(stud1.num);
        }
}
