//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Type 1", "Size 1" , 15);
        doAnimalStuff(animal , "fast");
        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("yorkie" , 75);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("Labrador retriever" , 89 , "Floppy" , "Swimmer");
        doAnimalStuff(retriever, "slow");
    }

    public static void doAnimalStuff(Animal animal , String speed){
        animal.makeSound();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("########");

    }
}