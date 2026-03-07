public class Count {
    public static void main(String[] args) {
        int number = 234576;
        if (number == 0) {
            System.out.println(1); 
        } else {
            System.out.println(count(number));
        }
    }
    static int count(int n) {
        n = Math.abs(n); 
        if (n == 0) {
            return 0;
        } else {
            return 1 + count(n / 10);
        }
    }
}
