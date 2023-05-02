public class FibonacciCalc {
    public static void main(String[] args) {
        Fibonacci(50);
    }

    public static void Fibonacci(int num) {
        int num1 = 0, num2 = 1, sum;

        System.out.println(num1);
        System.out.println(num2);

        for (int i = 2; i < num; i++) {
            sum = num1 + num2;
            System.out.println(sum);
            num1 = num2;
            num2 = sum;
        }
    }
}