package cards;
public class Main {
    public static void main(String[] args) {
        
        Deck deck = new Deck();
        System.out.printf(">>deck before shuffling: %s\n", deck);

        deck.shuffle();
        
        System.out.println();
        System.out.printf(">>deck after shuffling: %s\n", deck);
    
    }
    
}
