public interface Adoptable {
    /**
     * Show adoption terms to the console.
     *
     * <p>Default method so implementors may optionally override.</p>
     */
    default void showAdoptableTerms() {
        System.out.println("Adoption terms: Potential owners will be subject to mandatory screening processes.");
    }

    /**
     * Display general rental information (static helper).
     */
    static void displayGeneralInfo() {
        System.out.println("All animals are available to visit in our Dublin branch.");
    }

    

    

   
}