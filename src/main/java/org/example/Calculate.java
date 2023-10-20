package org.example;

import java.util.Arrays;

public class Calculate {

    /* 2. Kirjoita Java-ohjelma yksikkötesteineen, joka selvittää pienimmän määrän numeroita mitä luonnollisessa järjestyksessä mahtuu taulukon eri numeroiden välille.

Esimerkiksi taulukon [ 1, 4, 10 ] oikea vastaus olisi 2, sillä numeroiden 1 ja 4 väliin mahtuu numerot 2 ja 3 ja muiden numeroiden väliin mahtuisi suurempi kappalemäärä numeroita.

• Funktio voi olettaa, että kaikki taulukon elementit sisältävät luonnollisen numeron

• Funktion täytyy toimia samalla tavalla vaikka taulukon numeroiden järjestys muuttuisi

• Funktion täytyy toimia samalla tavalla vaikka taulukossa olisi useampi sama numero

• Funktion täytyy toimia samalla tavalla vaikka taulukossa olisi usealla numeroilla samanpituinen väli, esimerkiksi [ 1, 3, 5 ]


 */
    public static int calculate(int[] numbers) {
        // Sort the array to make the order optimal for smallest distance calculation
        int[] sorted_numbers = Arrays.stream(numbers).sorted().toArray();
        // First guess at shortest distance is just difference between first two numbers
        int shortest = sorted_numbers[1] - sorted_numbers[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            int larger_number = sorted_numbers[i + 1];
            int smaller_number = sorted_numbers[i];
            // We don't compare the number to itself
            if (larger_number == smaller_number) continue;

            int difference = larger_number - smaller_number;
            // If the difference is shorter than previous shortest we replace
            if (difference < shortest) {
                shortest = difference;
                // Helps in debugging
                // System.out.println(String.format("New shortest %d - %d = %d", larger_number, smaller_number, shortest));
            }
        }
        // We return the shortest difference - 1 to calculate how many numbers fit between two
        return shortest - 1;
    }
}

