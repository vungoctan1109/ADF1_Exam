package exam2.entity;

import java.util.StringTokenizer;

public class ConversionUtil {
    public StringTokenizer converse(String text) {
        StringTokenizer stringTokenizer = new StringTokenizer(text);
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
        return stringTokenizer;
    }
}
