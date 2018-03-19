import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class SumOfEvenFibonnaciTest {

    @Test
    public void shouldReturn10() {

        // given
        SumOfEvenFibonnaci sumOfEvenFibonnaci = new SumOfEvenFibonnaci();
        int maxValue = 10;

        // when
        int result = sumOfEvenFibonnaci.sumOfEvenFibonacci(maxValue);

        // then
        Assert.assertThat(result, CoreMatchers.is(10));
    }

    @Test
    public void shouldReturn44() {

        // given
        SumOfEvenFibonnaci sumOfEvenFibonnaci = new SumOfEvenFibonnaci();
        int maxValue = 100;

        // when
        int result = sumOfEvenFibonnaci.sumOfEvenFibonacci(maxValue);

        // then
        Assert.assertThat(result, CoreMatchers.is(44));
    }

    @Test
    public void shouldReturn4613732() {

        // given
        SumOfEvenFibonnaci sumOfEvenFibonnaci = new SumOfEvenFibonnaci();
        int maxValue = 4000000;

        // when
        int result = sumOfEvenFibonnaci.sumOfEvenFibonacci(maxValue);

        // then
        Assert.assertThat(result, CoreMatchers.is(4613732));
    }
}
