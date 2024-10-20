public class question04 {
    public static void main(String[] args) {
        int n = 10; 
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.print("The Fibonacci Series: ");

        for (int i = 0; i < n; i++) {
            System.out.print(firstNumber + ",");

            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}
