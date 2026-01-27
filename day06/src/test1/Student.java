package test1;

public class Student extends Person {
    //1.思考，有沒有特有的成員變量需要補充？ -->有

    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    //2.思考，有沒有特有的成員方法需要補充？ -->沒有
    //3.思考，有沒有需要重寫的方法？ --> 沒有
    //4.思考，子類需要自己編寫構造方法

    public Student() {

    }

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }
}
