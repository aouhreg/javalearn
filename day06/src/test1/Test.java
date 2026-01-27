package test1;

public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher("j",20);
        System.out.println(t.getAge() + " " + t.getName() );

        Student stu = new Student("jl",21,100);
        System.out.println(stu.getAge() + " " + stu.getName() + stu.getScore());
    }
}
