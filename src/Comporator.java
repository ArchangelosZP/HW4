import java.util.Arrays;

public class Comporator {
    boolean arrayStringComporator(String[] ar1, String[] ar2) {
        String s1;
        String s2;
        s1 = Arrays.toString(ar1);
        s1 = s1.replaceAll("[,. ]", "");
        s2 = Arrays.toString(ar2);
        s2 = s2.replaceAll("[,. ]", "");
        if (s1.equals(s2)) {
            return true;
        } else {
            return false;
        }
    }
}


