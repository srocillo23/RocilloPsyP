package SergioChef_99Iterations;

public class Chef99Threads {

	
	
	public static void main(String[] args) {

		// Chef details
		String chefName = "Chef Sergio Rocillo";
		int cookingTime = 1; // One second each step
		String order = "100 seconds Spanish Omelette";

		// Simulating 99 iterations for the same order
		for (int i = 1; i <= 99; i++) {
			System.out.println(chefName + " started " + i + " of order: " + order + " ☐");

			try {

				// Simulate cooking time for this step
				Thread.sleep(cookingTime * 1000L); // Convert seconds to milliseconds
			} catch (InterruptedException e) {
				System.out.println(chefName + " was interrupted while cooking step " + i + " of order: " + order);
				Thread.currentThread().interrupt(); // Restore interrupted status
			}

			// Chef finishes this step
			System.out.println(chefName + " finished cooking step " + i + " of order: " + order + " ☑");
		}

		// Final message
		System.out.println(chefName + " has completed cooking the entire order: " + order + " 🍽️");
		
	}
}
