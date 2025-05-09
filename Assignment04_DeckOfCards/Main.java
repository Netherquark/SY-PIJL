/*
 * Name: Your Name
 * PRN: Your PRN
 * Batch: Your Batch
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DeckOfCards deck = new DeckOfCards();
        deck.createDeck();

        while (true) {
            System.out.println("\n--- Deck of Cards Menu ---");
            System.out.println("1. Print Deck");
            System.out.println("2. Print a Card");
            System.out.println("3. Print Cards of a Suit");
            System.out.println("4. Compare Two Cards (by Rank)");
            System.out.println("5. Search for a Card");
            System.out.println("6. Deal 5 Random Cards");
            System.out.println("7. Shuffle Deck");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    deck.printDeck();
                    break;
                case 2:
                    System.out.print("Enter card index (0-51): ");
                    int index = Integer.parseInt(scanner.nextLine());
                    deck.printCard(index);
                    break;
                case 3:
                    System.out.print("Enter suit (Hearts/Clubs/Spades/Diamonds): ");
                    String suit = scanner.nextLine();
                    deck.printCardsOfSuit(suit);
                    break;
                case 4:
                    System.out.print("Enter first card index (0-51): ");
                    int idx1 = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter second card index (0-51): ");
                    int idx2 = Integer.parseInt(scanner.nextLine());
                    deck.compareCards(idx1, idx2);
                    break;
                case 5:
                    System.out.print("Enter rank (e.g., Ace, 2, ..., King): ");
                    String rank = scanner.nextLine();
                    System.out.print("Enter suit (Hearts/Clubs/Spades/Diamonds): ");
                    String searchSuit = scanner.nextLine();
                    deck.findCard(rank, searchSuit);
                    break;
                case 6:
                    deck.dealRandomCards(5);
                    break;
                case 7:
                    deck.shuffleDeck();
                    System.out.println("Deck shuffled.");
                    break;
                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

