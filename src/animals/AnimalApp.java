package animals;

public class AnimalApp {

    public static void main(String[] args) {

        //New animal object
        //A new animal has been created!
        Animal a = new Animal();
        //An animal eats...
        print(a.eat());
        //An animal sleeps...
        print(a.sleep());

        //New Cat object
        //Super does not do anything. Constructors cannot be overriden and are always inherited
        //But an additional line is put in the cat constructor to also print Now I am a Cat!
        Cat c = new Cat();
        //Overrides Animal method to say A cat eats...
        print(c.eat());
        //Overrides Animal method to say A cat sleeps...
        print(c.sleep());
        //new purr method for the cat class
        print(c.purr());


        //new bird object
        //Constructors cannot be overriden and are always inherited
        //An new line is added to the constructor saying A bird is hatched...
        Bird b = new Bird();
        //the eat method is overriden to say A bird eats...
        print(b.eat());
        //the sleep method is overriden to say A bird sleeps soundly...
        print(b.sleep());
        //a new fly method for the bird class
        print(b.fly());

        //Woof is added to the constructor print line
        //Arff is now the default dog constructor
        Dog d = new Dog("woof");
        //the Sleep method was changed to Zzz...
        print(d.sleep());

        //new mouse object inherited by the dog class
        //A new animal has been created and Arff are inherited constructor now that this
        //is inherited from an inherited class
        //I may be small but I'm a dog! Woof! is also the new constructor print for Mouse
        Mouse m = new Mouse();
        //Mouse inherits Dogs sleep method
        print(m.sleep());
        //Mouse inherits Animals eat method because it was never changed in Dog
        print(m.eat());

    }
    private static void print(String s) {
        System.out.println(s);
    }
}
