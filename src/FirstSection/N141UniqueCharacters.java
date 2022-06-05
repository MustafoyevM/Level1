package FirstSection;

import java.lang.reflect.Array;
import java.util.Arrays;

public class N141UniqueCharacters {
    public static boolean uniwueCharacters(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        boolean a = true;
        for (int i = 1; i < s.length(); i++) {
                if (c[i] == c[i-1]) {
                    a = false;
                    break;

            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(uniwueCharacters("xyyz"));
    }
}
