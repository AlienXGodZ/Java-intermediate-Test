
public class Test57 {

    static void roll(int count, String result) {

        if (count == 0) {
            System.out.println(result);
            return;
        }

        for (int i = 1; i <= 6; i++) {
            roll(count - 1, result + i);
        }
    }

    public static void main(String[] args) {
        roll(2, "");
    }
}