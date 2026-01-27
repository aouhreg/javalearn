package test2;

public class Coder extends Employee{
    public Coder() {}

    public Coder(String name, int age, double salary) {
        super(name, age, salary);
    }
    @Override
    public void work(){
        System.out.println(super.getName() + " is working."+super.getAge() + " years old."+super.getSalary() + "codingcoding");
    }
}
