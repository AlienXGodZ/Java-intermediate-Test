public class Test60 {

    static void combine(String str,
                        String current,
                        int index) {

        if (index == str.length()) {
            System.out.println(current);
            return;
        }

        combine(str, current +
                str.charAt(index), index + 1);

        combine(str, current, index + 1);
    }

    public static void main(String[] args) {
        combine("ABC", "", 0);
    }
}