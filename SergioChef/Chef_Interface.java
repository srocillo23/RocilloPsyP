package SergioChef;

// Clase Chef_Interface implementing Runnable

class Chef_Interface implements Runnable {
    private String chefName;
    private int cookingTime;
    private String order;

    // Constructor
    public Chef_Interface(String chefName, int cookingTime, String order) {
        this.chefName = chefName;
        this.cookingTime = cookingTime;
        this.order = order;
    }

    @Override
    public void run() {
    	
        // Chef starts cooking
        System.out.println(chefName + " started cooking order: " + order + " ☐");
        
        try {
            
            Thread.sleep(cookingTime * 1000L);
        } catch (InterruptedException e) {
            System.out.println(chefName + " was interrupted while cooking order: " + order);
            Thread.currentThread().interrupt(); 
        }
        
        // Chef finishes cooking
        
        System.out.println(chefName + " finished cooking order: " + order + " ☑");
    }
}
