public class Naturalreccrev {
    public static void main(String[] args) {
        int number = 4879;
        System.out.println(reverse(number, 0)); 
    }
    static int reverse(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        int r = n % 10;
        rev = rev * 10 + r;
        return reverse(n / 10, rev); 
    }
}
