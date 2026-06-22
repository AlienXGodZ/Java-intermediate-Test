public class Test59 {

    static void arrange(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String remaining =
                    str.substring(0, i)
                            + str.substring(i + 1);

            arrange(remaining, ans + ch);
        }
    }

    public static void main(String[] args) {
        arrange("ABC", "");
    }
}