package animal;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(){}
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 메서드 : 구현부 있음
    public abstract void makeSound();
    public void eat(){
        System.out.println(name + "이 먹고 있다");
    }
}
