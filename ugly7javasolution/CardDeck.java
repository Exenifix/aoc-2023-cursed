package ugly7javasolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CardDeck implements Comparable<CardDeck> {
    private int type;
    public char[] value;

    public CardDeck(String data) {
        this.value = data.toCharArray();
        var hashMap = new HashMap<Character, Integer>();
        for (char c : value) {
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }
        var size = hashMap.size();
        var countsArray = new ArrayList<Integer>(hashMap.values());
        countsArray.sort(null);
        Integer[] counts = new Integer[countsArray.size()];
        counts = countsArray.toArray(counts);
        switch (size) {
            case 5:
                this.type = 0;
                break;
            case 4:
                this.type = 1;
                break;
            case 3:
                if (Arrays.equals(counts, new Integer[] { 1, 2, 2 })) {
                    this.type = 2;
                } else {
                    this.type = 3;
                }
                break;
            case 2:
                if (Arrays.equals(counts, new Integer[] { 2, 3 })) {
                    this.type = 4;
                } else {
                    this.type = 5;
                }
                break;
            case 1:
                this.type = 6;
                break;
            default:
                break;
        }
    }

    @Override
    public String toString() {
        return String.join(", ", new String(value));
    }

    @Override
    public int compareTo(CardDeck o) {
        if (type != o.type) {
            return type - o.type;
        }
        var hm = new HashMap<Character, Integer>();
        int i = 0;
        for (var s : "23456789TJQKA".toCharArray()) {
            hm.put(s, ++i);
        }
        for (i = 0; i < 5; i++) {
            if (value[i] != o.value[i]) {
                return hm.get(value[i]) - hm.get(o.value[i]);
            }
        }
        return 0;
    }
}