import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        // Exercise 1
        System.out.println("\n---------------------------\n");

        Animal.getYearOfSpecieDiscovery();

        Elephant Ex_1 = new Elephant();
        System.out.println("Elephant's specie: " + Ex_1.animalSpecie("Herbivore"));
        System.out.println("Elephant's sound: " + Ex_1.animalsSound("Trumpet"));
        System.out.println("Elephant's biome: " + Ex_1.animalsBiome("Savanna Africa"));
        System.out.println("Elephant is herbivore: " + Ex_1.isHerbivore());
        System.out.println("Elephant's daily food intake: " + Ex_1.dailyFoodIntake(100) + " kg");
        
    }
}
