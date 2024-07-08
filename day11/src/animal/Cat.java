package animal;

public class Cat extends Animal{

    public Cat(String name, int age){
        super(name, age);
    }

    public void scratch() {
        System.out.println("고양이가 스크래치를 긁습니다");
    }

    @Override
    public void makeSound(){
        System.out.println("고양이가 운다");
    }
}
