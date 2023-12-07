package ugly7javasolution;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * IAmAnIdiot
 * Nah bro my head legit exploded after this, part 2 in python but this is
 * enough curse for yall
 */
public class IAmAnIdiot {

    public static void main(String[] args) throws Exception {
        var f = new File("res/7.txt");
        var decks1 = new ArrayList<CardDeck>();
        var bids = new HashMap<String, Integer>();
        try (var reader = new Scanner(f)) {
            while (reader.hasNextLine()) {
                var line = reader.nextLine();
                var data = line.split(" ");
                decks1.add(new CardDeck(data[0]));
                bids.put(data[0], Integer.parseInt(data[1]));
            }
        } catch (IOException e) {
            System.out.println("your mom");
        }
        decks1.sort(null);
        long sum1 = 0;
        int rank = 0;
        for (var deck : decks1) {
            sum1 += ++rank * bids.get(new String(deck.value));
        }
        System.out.println(sum1);
    }
}