import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestReverseString {

    public static void main(String[] args) {
        TestReverseString ts = new TestReverseString();
        String result = ts.reverseWords("Hello World");
        System.out.println(result);

    }
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        // Initialize the output string
        String out = "";
        System.out.println(str);
        // Iterate through the words in reverse order
        for (int i = str.length - 1; i >= 0; i--) {
            // Append the current word and a space to the output
            out += str[i] + " ";
        }
        System.out.println(out);
        // Append the first word to the output (without trailing space)
        return out ;
    }
}
