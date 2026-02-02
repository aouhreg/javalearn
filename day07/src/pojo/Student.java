package pojo;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student() {}
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    @Override
    public boolean equals(Object o) {
        //this：stu1
        //o：stu2
        if (this == o) return true;
        //getClass比較兩個對象的字節碼，如果字節碼不相同，代表類型不一致Phone,Student
        if (o == null || getClass() != o.getClass()) return false;
        //向下轉型，調用子類特有的屬性
        //你説爲什麽不先用instanceof來判斷屬性嗎？因爲在上面已經判斷字節碼，所以類型是一致的
        Student student = (Student) o;
        //比較兩個對象的屬性值
        return age == student.age && Objects.equals(name, student.name);
    }


    /*
    @Override
    public boolean equals(Object obj) {//Object obj = stu2;
        //this:發起比較的對象:stu1
        // obj:stu2
        if(obj instanceof Student) {
            Student stu = (Student) obj;
            return this.age == stu.age && this.name.equals(stu.name);
        }
        else {
            return false;
        }

    }
     */
}
