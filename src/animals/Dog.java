package animals;

public class Dog extends Animal {

    public Dog(){
        super();
        System.out.println("Arff");
    }

    public Dog(String hello) {
        System.out.println(hello);
    }


    @Override
    public String sleep(){
        return "Zzzz....";
    }

}

