import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void getLastMomentTest1() {
        int n = 4;
        int[] left = {4, 3};
        int[] right = {0, 1};
        int expected = 4;
        int actual = new Solution().getLastMoment(n, left, right);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLastMomentTest2() {
        int n = 7;
        int[] left = {};
        int[] right = {0, 1, 2, 3, 4, 5, 6, 7};
        int expected = 7;
        int actual = new Solution().getLastMoment(n, left, right);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLastMomentTest3() {
        int n = 4;
        int[] left = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] right = {};
        int expected = 7;
        int actual = new Solution().getLastMoment(n, left, right);

        Assert.assertEquals(expected, actual);
    }
}
