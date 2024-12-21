
import org.junit.Assert;
import org.junit.Test;

public class EvaluateNotationTest {

  @Test
  public void simpleTest() {
    EvaluateNotation evaluateNotation = new EvaluateNotation();
    int result = evaluateNotation.evalRPN(new String[]{"2","1","+","3","*"});
    Assert.assertEquals(9, result);
  }

  @Test
  public void simpleTest2() {
    EvaluateNotation evaluateNotation = new EvaluateNotation();
    int result = evaluateNotation.evalRPN(new String[]{"4","13","5","/","+"});
    Assert.assertEquals(6, result);
  }

  @Test
  public void simpleTest3() {
    EvaluateNotation evaluateNotation = new EvaluateNotation();
    int result = evaluateNotation.evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"});
    Assert.assertEquals(22, result);
  }
}
