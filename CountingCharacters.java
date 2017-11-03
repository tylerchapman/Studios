package org.launchcode.java.studios;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {

    public static void main(String[] args) {

        String sample = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        sample = sample.toLowerCase();
        char[] charactersInString = sample.toCharArray();
        Arrays.sort(charactersInString);
        Map<Character, Integer> charCount = getCharCount(charactersInString);
        for (Map.Entry<Character, Integer> character : charCount.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }

    }

    private static Map<Character, Integer> getCharCount(char[] charactersInString) {

        Map<Character, Integer> charCount = new HashMap<>();
        for (char character : charactersInString) {
            String stringCharacter = Character.toString(character);
            if (stringCharacter.matches("[a-z]")) {
                if (!charCount.containsKey(character)) {
                    charCount.put(character, 1);
                } else if (charCount.containsKey(character)) {
                    int currentValue = charCount.get(character) + 1;
                    charCount.replace(character, currentValue);
                }
            } else {
                continue;
            }
        }
        return charCount;

    }

    private static char[] stringToArray(String stringToConvert) {

        stringToConvert = stringToConvert.toLowerCase();
        char[] characterArray = stringToConvert.toCharArray();
        return characterArray;

    }

}
