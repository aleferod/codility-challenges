package codility;

import java.util.*;
import java.util.stream.Collectors;

public class Result {

    static int bynaryGapy(int N) {
        String value = Integer.toBinaryString(N);
        List<Integer> binary = new ArrayList<>();

        for (int i = 0; i < value.length(); i++) {
            binary.add(Integer.valueOf(String.valueOf(value.charAt(i))));
        }

        int count = 0;
        List<Integer> numberOfGaps = new ArrayList<>();
        for (Integer el : binary) {
            if (el.equals(0)) {
                count++;
            } else {
                numberOfGaps.add(count);
                count = 0;
            }
        }

        return Collections.max(numberOfGaps);
    }

    static String stringDescribe(String s) {
        char c = s.charAt(0);
        if (Character.isUpperCase(c)) {
            return "upper";
        } else if (Character.isLowerCase(c)) {  // please fix condition
            return "lower";
        } else if (Character.isDigit(c)) {
            return "digit";
        } else {
            return "other";
        }
    }

    static int longestPassword(String S) {
        var passwords = Arrays.stream(S.split("\\s+"))
                .map(String::valueOf)
                .collect(Collectors.toList());

        var validPasswords = passwords.stream().filter(password -> validPassword(password))
                .collect(Collectors.toList());
        return validPasswords.isEmpty() ?
        -1 :
        Collections.max(validPasswords, Comparator.comparing(String::length)).length();
    }

    private static boolean validPassword(String s) {
        return isAlphanumeric(s) &&
                hasEvenNumberOfLetters(s) &&
                hasOddNumberOfDigits(s);
    }

    private static boolean isAlphanumeric(String s) {
        String alphaNumericPattern = "^[a-zA-Z0-9]*$";
        return s.matches(alphaNumericPattern);
    }

    private static boolean hasEvenNumberOfLetters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                count++;
            }
        }
        return count % 2 == 0;
    }

    private static boolean hasOddNumberOfDigits(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                count++;
            }
        }
        return count % 2 != 0;
    }
}
