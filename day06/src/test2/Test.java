package test2;

public class Test {
    public static void main(String[] args) {
        Coder c = new Coder("j",20,200);
        Manager m = new Manager("jl", 22, 209000, 2000);
        System.out.println(c.getName());
        System.out.println(c.getAge());
        System.out.println(c.getSalary());
        c.work();
        System.out.println(m.getName());
        System.out.println(m.getAge());
        System.out.println(m.getSalary());
        System.out.println(m.getBonus());
        m.work();


    }
}
