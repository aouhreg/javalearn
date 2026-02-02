package polymorphism;

public class PolymorphismDemo3 {
    /*
    多態的好處：提高代碼的擴展性
    方法的形參定義為父類類型，就可以傳入該類的任意 子類對象了

    多態的弊端，不能直接調用子類的特定方法，需要向下轉型

    ClassCastException: 類型轉換異常
    原因：在强轉的過程中，如果目標類型和實際類型，不是同一種類型，就會出現該一場
    instanceof:判斷左邊的變量，記錄的是否是右邊的類型，返回true,flase

     */
    public static void main(String[] args) {
        useDog(new Dog());
        useCat(new Cat());
        useAnimal(new Dog());
        useAnimal(new Cat());
    }

    public static void useDog(Dog d){ //Dog d = new Dog()
        d.eat();
    }
    public static void useCat(Cat c){ // Cat c = new Cat()
        c.eat();
    }
    public static void useAnimal(Animal a){// Animal a = new Dog()..1 Animal a = new Cat();父類引用子類對象-->多態
        a.eat();
        if(a instanceof Dog){
            Dog d = (Dog) a;
            d.watchHome();
        }
        else if(a instanceof Cat){
            Cat c = (Cat) a;
            c.catchMouse();
        }

    }
}


abstract class Animal {
    public abstract void eat();
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog eat meat");
    }
    public void watchHome(){
        System.out.println("Dog watch home");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cat eat fish");
    }
    public void catchMouse(){
        System.out.println("Cat catch mouse");
    }
}

