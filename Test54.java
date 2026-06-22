public class Test54 {

    static void generate(String str, int length) {
        if (length == 0) {
            System.out.println(str);
            return;
        }

        generate(str + "a", length - 1);
        generate(str + "b", length - 1);
    }

    public static void main(String[] args) {
        generate("", 3);
    }
}