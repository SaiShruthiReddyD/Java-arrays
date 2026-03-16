public class Helloworld {
    public static int addNumbers(int a, int b) {
        while (b != 0) {   
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int sum = addNumbers(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum); 
        int num3 = -7;
        int num4 = 3;
        int sum2 = addNumbers(num3, num4);
        System.out.println("Sum of " + num3 + " and " + num4 + " is: " + sum2); 
    }
}