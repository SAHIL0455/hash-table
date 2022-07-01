package com.bridgelabs;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        System.out.println("Welcome to HashTable");
        String message = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        HashTable hashTable = new HashTable();
        hashTable.frequency(message);
        System.out.println(hashtable);
    }

    public static Hashtable<String, Integer> hashtable = new Hashtable<>();

    public void frequency(String sentances) {
        String[] messageArray = sentances.toLowerCase().split(" ");
        for (String word : messageArray) {
            Integer value = hashtable.get(word);

            if (value == null)
                value = 1;
            else
                value = value + 1;
            hashtable.put(word, value);
        }
    }
}
