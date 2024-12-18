import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {

    @Test
    public void simpleTest() {
        ValidParentheses validParentheses = new ValidParentheses();
        Assert.assertFalse(validParentheses.isValid("[(])"));
    }

    @Test
    public void simpleTest2() {
        ValidParentheses validParentheses = new ValidParentheses();
        Assert.assertTrue(validParentheses.isValid("[()]"));
    }

    @Test
    public void simpleTest3() {
        ValidParentheses validParentheses = new ValidParentheses();
        Assert.assertFalse(validParentheses.isValid("[{({(["));
    }

    @Test
    public void simpleTest4() {
        ValidParentheses validParentheses = new ValidParentheses();
        Assert.assertFalse(validParentheses.isValid("]})]})"));
    }
}
