package OOPS;

import java.util.Scanner;

public class OOPS {
    public static void main(String[] args) {
        System.out.println("please enter the animal name");
        Scanner scanner = new Scanner(System.in);
        String inputAnimal = scanner.next();
        Animal animal = new Dog();
        if (inputAnimal.equalsIgnoreCase("dog")) {
            Dog dog = new Dog();
            dog.eat();
            dog.setDogPet("dog is a pet");
            System.out.println(dog.getDogPet());
            animal.sound();
            boolean dogIsWild = dog.isAWildAnimal(inputAnimal);
            System.out.println("dog is a wild animal? - " + dogIsWild);
        }
        else if (inputAnimal.equalsIgnoreCase("cat")) {
            animal = new Cat();
            animal.eat();
            animal.sound();
        }
        else if (inputAnimal.equalsIgnoreCase("lion")){
            Lion lion = new Lion();
            boolean lionIsWild = lion.isAWildAnimal(inputAnimal);
            System.out.println("lion is a wild animal? - " + lionIsWild);
        }
        else{
            System.out.println("we will add this animal details in future updates");
        }
    }
}
