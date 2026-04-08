
public class mypackageTest11 {


        public static void main(String[] args) {

            mypackageTest10 obj = new mypackageTest10();

            System.out.println("Public: " + obj.a);

            System.out.println("Private (via getter): " + obj.getb());

            System.out.println("Protected: " + obj.c);
            System.out.println("Default: " + obj.d);
        }
    }