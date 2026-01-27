package pojo;

public class Student {
    private int age;
    private String name;

    public Student(){

    }
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        if(age >= 0 && age <= 120){
            this.age = age;
        }
        else
        {
            System.out.println("error");
        }
    }

    public int getAge(){
        return age;
    }

}
