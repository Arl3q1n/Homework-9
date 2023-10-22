public interface Animal {

    public final static int yearOfSpecieDiscovery = 0;

    public abstract String animalSpecie(String specie);

    public abstract String animalsSound(String sound);

    public abstract String animalsBiome(String biome);

    public abstract String animalsFavouriteFood(String food);

    public default void thisIs(String is) {
        System.out.println("This is an Animal template");
    }

    public static void getYearOfSpecieDiscovery() {
        System.out.println("Year of animal specie discovery is: " + yearOfSpecieDiscovery);
    }

}
