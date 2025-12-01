abstract class Pet {
    private String petName;
    private int petAge;
    private String petBreed;
    static int petCount = 1;
    final String SHOP_LOCATION = "Dublin";
    private PetType type;
    private String petSound;


    public Pet(PetType type, String petName, String petBreed, int petAge) {
        this.type = type;
        this.petName = petName;
        this.petAge= petAge;
        petCount++;
    }

    public String getName() {
        return this.petName;
    }
    
    public int getPetAge() {
        return this.petAge;
    }

    public PetType getPetType() {
        return this.type;
    }

    public final String getShopLocation() {
        return SHOP_LOCATION;
    }

    public void petSound(){
        System.out.println("Ribbit ribbit");
    }

    public final void printLegs(){
        System.out.println("Animal has 4 legs");
    }

    public void displayInfo() {
        System.out.println("Pet Type: " + type);
        System.out.println("Pet name: " + petName);
        System.out.println("Pet age " + petAge);
        System.out.println("Pet location: " + SHOP_LOCATION);
    }

    public static int getTotalPets() {
        return petCount - 1;
    }

    
}