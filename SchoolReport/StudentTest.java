import java.util.*;

class Student{
    private String name="";
    private String sex = "";
    private int age = 0;
    private int ID = 0;
    private double grade = 0;
    
    public Student(String name, String sex, int age, int ID,double grade){
        this.name= name;
        this.sex = sex;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

    public void show(){
        System.out.println("name :"+ this.name);
        System.out.println("sex :"+ this.sex);
        System.out.println("age :"+ this.age);
        System.out.println("ID :"+ this.ID);
        System.out.println("Grade :"+this.grade);
    }

    public double ave(Student[] std){
        double result =0;
        for(int i=0; i<std.length; i++){
            result+=std[i].grade;
        }

        result/=std.length;
        return result;
    }
}
public class StudentTest {
    public static void main(String[] args){
        Student[] std= new Student[5];

        for(int i=0; i<std.length; i++){
            std[i] = new Student("Song"+i, "F", (int)(Math.random()*20)+10,i+1,Math.random()*4.5);
        }

        double result = std[0].ave(std);
        System.out.println(result);
    }
}