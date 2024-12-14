import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeStrs {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str: strs) {
            sb.append(String.format("%03d", str.length())).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int wordSize = Integer.parseInt(str.substring(i, i + 3));
            String decodeWord = str.substring(i + 4, i + 4 + wordSize);
            result.add(decodeWord);
            i = i + 4 + wordSize;
        }
        return result;
    }
}
