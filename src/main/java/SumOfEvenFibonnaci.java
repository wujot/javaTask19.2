public class SumOfEvenFibonnaci {

    public int sumOfEvenFibonacci(int terms) {

        int x = 1;
        int y = 1;

        int sum = 0;

        for (int i = 1; i <= terms; i++) {
            if (x <= 4000000) {
                if (x % 2 == 0) {
                    sum += x;
                }
            }
            x = x + y;
            y = x - y;
        }
        return sum;
    }
}
