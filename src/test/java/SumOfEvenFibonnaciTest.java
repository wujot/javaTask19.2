import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class SumOfEvenFibonnaciTest {

    @Test
    public void shouldReturn44() {

        // given
        SumOfEvenFibonnaci sumOfEvenFibonnaci = new SumOfEvenFibonnaci();
        int terms = 10;

        // when
        int result = sumOfEvenFibonnaci.sumOfEvenFibonacci(terms);

        // then
        Assert.assertThat(result, CoreMatchers.is(44));
    }

    @Test
    public void shouldReturn14328() {

        // given
        SumOfEvenFibonnaci sumOfEvenFibonnaci = new SumOfEvenFibonnaci();
        int terms = 20;

        // when
        int result = sumOfEvenFibonnaci.sumOfEvenFibonacci(terms);

        // then
        Assert.assertThat(result, CoreMatchers.is(14328));
    }

    @Test
    public void shouldReturn4613732() {

        // given
        SumOfEvenFibonnaci sumOfEvenFibonnaci = new SumOfEvenFibonnaci();
        int terms = 40;

        // when
        int result = sumOfEvenFibonnaci.sumOfEvenFibonacci(terms);

        // then
        Assert.assertThat(result, CoreMatchers.is(4613732));
    }
}
