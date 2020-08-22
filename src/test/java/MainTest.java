import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class MainTest {

    @Test
    public void returnsZeroGivenEmptyString() {
        int result = Main.add("");

        assertThat(result, is(equalTo(0)));
    }

    @Test
    public void returnsOwnNumberGivenOnlyOneNumber() {
        int result = Main.add("1");

        assertThat(result, is(equalTo(1)));
    }

    @Test
    public void returnsSumGivenTwoNumbers() {
        int result = Main.add("1,2");

        assertThat(result, is(equalTo(3)));
    }

    @Test
    public void returnsSumGivenAnyAmountOfNumbers() {
        int result = Main.add("1,2,3");

        assertThat(result, is(equalTo(6)));
    }

}