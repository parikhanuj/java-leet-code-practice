import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class EncodeDecodeStrsTest {

    @Test
    public void simpleTest() {
        EncodeDecodeStrs encodeDecodeStrs = new EncodeDecodeStrs();
        String result = encodeDecodeStrs.encode(Arrays.asList("hello", "how", "are", "you", "doing", "?"));
        System.out.println(result);
        List<String> strs = encodeDecodeStrs.decode(result);
        System.out.println(strs);
    }

    @Test
    public void simpleTest2() {
        EncodeDecodeStrs encodeDecodeStrs = new EncodeDecodeStrs();
        String result = encodeDecodeStrs.encode(Arrays.asList("neet", "code", "he#llo"));
        System.out.println(result);
        List<String> strs = encodeDecodeStrs.decode(result);
        System.out.println(strs);
    }

    @Test
    public void simpleTest3() {
        EncodeDecodeStrs encodeDecodeStrs = new EncodeDecodeStrs();
        String result = encodeDecodeStrs.encode(Arrays.asList(""));
        System.out.println(result);
        List<String> strs = encodeDecodeStrs.decode(result);
        System.out.println(strs);
    }

    @Test
    public void simpleTest4() {
        EncodeDecodeStrs encodeDecodeStrs = new EncodeDecodeStrs();
        String result = encodeDecodeStrs.encode(Arrays.asList("we","say",":","yes","!@#$%^&*()"));
        System.out.println(result);
        List<String> strs = encodeDecodeStrs.decode(result);
        System.out.println(strs);
    }
}
