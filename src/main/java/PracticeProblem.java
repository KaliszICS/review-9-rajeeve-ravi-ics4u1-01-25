public class PracticeProblem {

    public static void main(String args[]) {

    }

    //  Q1
    public static int lettersToFive(String word, char character) {
        int count = 0;
        int totalLetters = 0;
        while (count < 5 && totalLetters < word.length()) {
            if (word.charAt(totalLetters) == character) {
                count++;
            }
            totalLetters++;
        }
        return count == 5 ? totalLetters : -1;
    }

    // Q2
    public static int countLetter(String word, char character) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }

    // Q3
    public static int oddSum(int num1, int num2) {
        int sum = 0;
        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }
}
