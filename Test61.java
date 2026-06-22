public class Test61 {

    static void generate(String name,
                         String current,
                         int index) {

        if (index == name.length()) {
            System.out.println(current);
            return;
        }

        generate(name,
                current + name.charAt(index),
                index + 1);

        generate(name,
                current,
                index + 1);
    }

    public static void main(String[] args) {
        generate("JOHN", "", 0);
    }
}