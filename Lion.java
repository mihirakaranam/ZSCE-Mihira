package OOPS;

public class Lion implements Wild {
    @Override
    public boolean isAWildAnimal(String animal) {
        return animal.equalsIgnoreCase("lion");
    }
}
