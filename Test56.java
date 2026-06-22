public class Test56 {

    static String[] keypad = {
            "", "", "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"
    };

    static void generate(String digits, int index, String result) {

        if (index == digits.length()) {
            System.out.println(result);
            return;
        }

        String letters =
                keypad[digits.charAt(index) - '0'];

        for (int i = 0; i < letters.length(); i++) {
            generate(digits, index + 1,
                    result + letters.charAt(i));
        }
    }

    public static void main(String[] args) {
        generate("23", 0, "");
    }
}