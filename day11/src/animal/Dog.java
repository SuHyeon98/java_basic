    package animal;

public class Dog extends Animal{

    public Dog(String name, int age){
        super(name, age);
    }

    public void fetch() {
        System.out.println("강아지가 공을 찾습니다");
    }

    @Override
    public void makeSound(){
        System.out.println("강아지가 짖는다");
    }

}
