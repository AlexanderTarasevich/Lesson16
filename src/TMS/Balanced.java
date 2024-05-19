package TMS;

public class Balanced {
    public static void main(String[] args) {
        String input = "{[(())]}";

        if (isBalanced(input)) {
            System.out.println("Строка \"" + input + "\" сбалансирована!");
        } else {
            System.out.println("Строка \"" + input + "\" не сбалансирована!");
        }

    }

    public static boolean isBalanced(String str) {
        char[] openingBracket = new char[str.length()];
        int endArray = 0;

        for (char ch : str.toCharArray()) {
            switch (ch) {
                case '(':
                case '[':
                case '{':
                    openingBracket[endArray++] = ch;
                    break;
                case ')':
                    if (endArray == 0 || openingBracket[--endArray] != '(') return false;
                    break;
                case ']':
                    if (endArray == 0 || openingBracket[--endArray] != '[') return false;
                    break;
                case '}':
                    if (endArray == 0 || openingBracket[--endArray] != '{') return false;
                    break;
            }
        }
        return endArray == 0;
    }

}

