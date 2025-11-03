package Activity2;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester2 {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		 String[] ranks = {"Ace", "King", "Queen"};
	        String[] suits = {"Hearts", "Spades"};
	        int[] values = {1, 13, 12};

	        Deck2 deck = new Deck2(ranks, suits, values);

	        System.out.println("=== New Deck Created ===");
	        System.out.println(deck);

	        // deal 1
	        System.out.println("Dealing one card: " + deck.deal());
	        System.out.println("Deck after dealing one card:");
	        System.out.println(deck);

	        // deal all remaining
	        while (!deck.isEmpty()) {
	            System.out.println("Dealt: " + deck.deal());
	        }

	        // Test 4: Deal from empty deck
	        System.out.println("Dealing from empty deck: " + deck.deal());

	        System.out.println("Final deck state:");
	        System.out.println(deck);
	}
}
