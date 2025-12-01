public class Cat extends Pet implements Adoptable{
    private String favouriteFood;

    public Cat(PetType type, String petName, String petBreed, int petAge, String favouriteFood) {
        super(PetType.DOG, petName, petBreed, petAge);
        this.favouriteFood = favouriteFood;
    }

    @Override
    public void petSound() {

        System.out.println(this.getName() + " is eating her " + favouriteFood + "  and MIAOWS happily.");
        
    }



    @Override
    public void displayInfo() {
        super.displayInfo();
        this.printLegs();
        System.out.println("Favourite toy: " + favouriteFood);
        this.petSound();
    }

}