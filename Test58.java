import java.util.Random;

public class Test58 {

    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            System.out.print(random.nextInt(50) + 1 + " ");
        }
    }
}
