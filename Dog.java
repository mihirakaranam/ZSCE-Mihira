package OOPS;

class Dog extends Animal implements Wild{
    private String dogPet;
    public void eat() {
        System.out.println("eats pedigree");
    }
    public String getDogPet(){
        return dogPet;
    }

    public void setDogPet(String output){
        dogPet = output;
    }
    public void sound(){
        System.out.println("The dog barks - Woof");
    }

    @Override
    public boolean isAWildAnimal(String animal) {
        return animal.equalsIgnoreCase("lion");
    }
}