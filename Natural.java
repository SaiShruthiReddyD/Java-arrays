class Natural {
    public static void main(String[] args) {
        int number = 10;
        System.out.println(sum(number));
    }
    static int sum(int n) {
        if (n == 0) {
            return 0; 
        } else {
            return n + sum(n - 1);
        }
    }
}
