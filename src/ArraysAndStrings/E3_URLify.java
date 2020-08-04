package ArraysAndStrings;

public class E3_URLify {

    public static String getTransformedString(String input, int size) {
        StringBuilder sb = new StringBuilder();
        char[] chars = input.toCharArray();
        for (int i = 0; i < size; i++) {
            if (chars[i] == ' ') {
                sb.append("%20");
                continue;
            }
            sb.append(chars[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "Hello World ";
        System.out.println(getTransformedString(input, input.length() - 1));
        System.out.println(getTransformedString(input, input.length()));
        input = "Hello";
        System.out.println(getTransformedString(input, input.length()));
    }

}
