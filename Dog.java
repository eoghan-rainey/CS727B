public class Dog extends Pet implements Adoptable {
    private String favouriteToy;

    public Dog(PetType type, String petName, String petBreed, int petAge, String favouriteToy) {
        super(PetType.DOG, petName, petBreed, petAge);
        this.favouriteToy = favouriteToy;
    }

    @Override
    public void petSound() {

        System.out.println(this.getName() + " is playing with his " + favouriteToy + "  and BARKS happily.");
        
    }



    @Override
    public void displayInfo() {
        super.displayInfo();
        this.printLegs();
        System.out.println("Favourite toy: " + favouriteToy);
        this.petSound();
    }

}