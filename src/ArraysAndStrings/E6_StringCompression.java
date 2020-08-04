package ArraysAndStrings;

public class E6_StringCompression {

    public static String compress(String input) {
        if (input.length() > 0) {
            StringBuilder sb = new StringBuilder();
            char[] characters = input.toCharArray();
            int counter = 1;
            for (int i = 1; i < input.length(); i++) {
                if (characters[i] == characters[i - 1]) {
                    counter++;
                } else {
                    sb.append(characters[i - 1]);
                    sb.append(counter);
                    counter = 1;
                }
            }
            if (characters[characters.length -1] == characters[characters.length - 2]) {
                sb.append(characters[characters.length - 1]);
                sb.append(counter);
            } else {
                sb.append(characters[characters.length - 1]);
                sb.append("1");
            }
            if (sb.length() < input.length()) {
                return sb.toString();
            }
        }
        return input;
    }

    public static void main(String[] args) {
        String input = "aabcccccaaa";
        System.out.println(compress(input));
        input = "aabcccccaab";
        System.out.println(compress(input));
        input = "aabcccccaabze";
        System.out.println(compress(input));
    }

}
