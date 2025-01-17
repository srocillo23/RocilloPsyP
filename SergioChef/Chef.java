package SergioChef;

class Chef extends Thread {
    private String chefName;
    private int cookingTime; // in seconds
    private String order; // order that is cookking

    //Constructor
    public Chef(String chefName, int cookingTime, String order) {
        this.chefName = chefName;
        this.cookingTime = cookingTime;
        this.order = order;
    }

    @Override
    public void run() {
    	
        System.out.println(chefName + " started cooking order: " + order + " ☐"); 
        
        try {
            // Sleeps for cooking time
            Thread.sleep(cookingTime * 1000L); // Seconds to milisecondso
        } catch (InterruptedException e) {
            System.out.println(chefName + " was interrupted while cooking order: " + order);
            Thread.currentThread().interrupt(); // Restablecer el estado de interrupción
        }
        
        System.out.println(chefName + " finished cooking order: " + order + " ☑");
        
    }
}