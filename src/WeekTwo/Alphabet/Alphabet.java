package WeekTwo.Alphabet;



public class Alphabet {
    public static int letterToNumber(char c) {
        char upper = Character.toUpperCase(c);
        if (upper >= 'A' && upper <= 'Z') {
            return upper - 'A' + 1;
        } else {
            return 0;
        }

    }
    public static int[] textToNumbers(String text) {
    char[] chars = text.toCharArray();
    int[] result = new int[chars.length];

    for(int i =0; i< chars.length;i++) {
        result[i]= letterToNumber(chars[i]);
    }
    return result;
    }

    public static char numberToLetter(int n) {
        if (n < 1 || n > 26) {
            throw new IllegalArgumentException("Tal måste vara 1–26: " + n);
        }
        return (char) ('A' + (n - 1));
    }

    public static String numbersToText(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        for (int n : numbers) {
            sb.append(numberToLetter(n));
        }
        return sb.toString();
    }
}