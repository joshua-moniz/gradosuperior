import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Blackjack {
    private static final String[] SUITS = {"Corazones", "Diamantes", "Tréboles", "Picas"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private static final int BLACKJACK = 21;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Card> deck = createDeck();
        Collections.shuffle(deck);

        System.out.print("¿Cuántos jugadores hay? ");
        int numPlayers = scanner.nextInt();
        int[] playerScores = new int[numPlayers];
        boolean[] playerBusted = new boolean[numPlayers];

        for (int i = 0; i < numPlayers; i++) {
            playerScores[i] = playTurn(scanner, deck, i + 1);
            if (playerScores[i] > BLACKJACK) {
                playerBusted[i] = true;
            }
        }

        int dealerScore = playDealerTurn(deck);
        System.out.println("El puntaje del dealer es: " + dealerScore);

        for (int i = 0; i < numPlayers; i++) {
            if (!playerBusted[i]) {
                if (playerScores[i] > dealerScore || dealerScore > BLACKJACK) {
                    System.out.println("¡El jugador " + (i + 1) + " gana!");
                } else if (playerScores[i] == dealerScore) {
                    System.out.println("El jugador " + (i + 1) + " empata con el dealer.");
                } else {
                    System.out.println("El jugador " + (i + 1) + " pierde.");
                }
            } else {
                System.out.println("El jugador " + (i + 1) + " se pasó de 21 y pierde.");
            }
        }

        scanner.close();
    }

    private static ArrayList<Card> createDeck() {
        ArrayList<Card> deck = new ArrayList<>();
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck.add(new Card(suit, rank));
            }
        }
        return deck;
    }

    private static int playTurn(Scanner scanner, ArrayList<Card> deck, int playerNumber) {
        int score = 0;
        boolean finished = false;

        System.out.println("Turno del jugador " + playerNumber);
        while (!finished) {
            System.out.println("Puntaje actual: " + score);
            System.out.print("¿Quieres pedir otra carta? (s/n): ");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("s")) {
                Card card = deck.remove(deck.size() - 1);
                score += card.getValue();
                System.out.println("Has sacado: " + card);
                if (score > BLACKJACK) {
                    finished = true;
                }
            } else {
                finished = true;
            }
        }
        return score;
    }

    private static int playDealerTurn(ArrayList<Card> deck) {
        int score = 0;
        while (score < 17) {
            Card card = deck.remove(deck.size() - 1);
            score += card.getValue();
            System.out.println("El dealer ha sacado: " + card);
        }
        return score;
    }

    static class Card {
        private String suit;
        private String rank;

        public Card(String suit, String rank) {
            this.suit = suit;
            this.rank = rank;
        }

        public int getValue() {
            if (rank.equals("A")) {
                return 11; // As se cuenta como 11 en este juego simplificado
            } else if (rank.equals("K") || rank.equals("Q") || rank.equals("J")) {
                return 10; // Figuras valen 10
            } else {
                return Integer.parseInt(rank); // Números valen su valor
            }
        }

        @Override
        public String toString() {
            return rank + " de " + suit;
        }
    }
}