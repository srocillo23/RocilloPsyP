package SergioChef;

public class KitchenSimulation_Interface {

    public static void main(String[] args) {
    	
        
        Chef_Interface chef1 = new Chef_Interface("Chef Sergio Rocillo", 3, "Spaghetti Carbonara");
        Chef_Interface chef2 = new Chef_Interface("Chef Gordon Ramsey", 9, "Grilled Salmon");
        Chef_Interface chef3 = new Chef_Interface("Chef Jordi Roca", 5, "Chocolate Cake");

   
        Thread thread1 = new Thread(chef1);
        Thread thread2 = new Thread(chef2);
        Thread thread3 = new Thread(chef3);

        thread1.start();
        thread2.start();
        thread3.start();

        
        System.out.println("All chefs are cooking their orders...");
        
        try {
            
        	// Wait chefs to finish theis meals
        	
            thread1.join();
            thread2.join();
            thread3.join();
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}