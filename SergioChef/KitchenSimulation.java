package SergioChef;

public class KitchenSimulation {
	
    public static void main(String[] args) {
    	
        // Chefs, cooking times and dishes
    	
        Chef chef1 = new Chef("Chef Sergio Rocillo", 3, "Spaghetti Carbonara");
        Chef chef2 = new Chef("Chef Gordon Ramsey", 9, "Grilled Salmon");
        Chef chef3 = new Chef("Chef Jordi Roca", 5, "Chocolate Cake");	

        // Starting
        chef1.start();
        chef2.start();
        chef3.start();

        // Main continues
        System.out.println("All chefs are cooking their orders...");
        
    }
}