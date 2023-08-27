package functions;

public class GetNumberVowels {
    public int getNumberVowels (String word) {
        int counter = 0;

        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> counter++;
            }
        }

        return counter;
    }
}
