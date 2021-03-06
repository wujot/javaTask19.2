public class SumOfEvenFibonnaci {

    public int sumOfEvenFibonacci(int maxValue) {

        int x = 1;
        int y = 1;

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            while (x < maxValue) {
                if (x % 2 == 0) {
                    sum += x;
                }
                x = x + y;
                y = x - y;
            }
        }
        return sum;
    }
}
