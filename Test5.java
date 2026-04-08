//Method with return type (add numbers)

public class Test5{
    public static int addnumbers (int a, int b){
        int add = a + b;
        return add;
    }
    public static void main(String[] args){
        int result = addnumbers(2,4);
        System.out.println("Sum = " + result);
    }
}