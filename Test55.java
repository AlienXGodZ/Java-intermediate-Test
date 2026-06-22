public class Test55 {

    static void generate(String pin, int length) {
        if (pin.length() == length) {
            System.out.println(pin);
            return;
        }

        for (int i = 0; i <= 9; i++) {
            generate(pin + i, length);
        }
    }

    public static void main(String[] args) {
        generate("", 2);
    }
}