public class Elephant extends Herbivore implements Animal{


    @Override
    public String animalSpecie(String specie) {
        return specie;
    }

    @Override
    public String animalsSound(String sound) {
        return sound;
    }

    @Override
    public String animalsBiome(String biome) {
        return biome;
    }

    @Override
    public String animalsFavouriteFood(String food) {
        return food;
    }

    @Override
    public boolean isHerbivore() {
        return true;
    }


    @Override
    public int dailyFoodIntake(int intake) {
        return super.dailyFoodIntake(intake);
    }

}
