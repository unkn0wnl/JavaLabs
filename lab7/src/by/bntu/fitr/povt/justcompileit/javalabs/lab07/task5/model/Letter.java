package by.bntu.fitr.povt.justcompileit.javalabs.lab07.task5.model;

public class Letter {

    public static String isVowel(char letter) {

        StringBuilder result = new StringBuilder();

        if (Character.isLetter(letter)) {
            switch (Character.toLowerCase(letter)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                    result.append("vowel letter");
                    break;
                default:
                    result.append("consonant letter");
            }
        } else {
            result.append("not a letter");
        }
        return result.toString();
    }

}
