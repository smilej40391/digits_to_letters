package org.example.dtl;

import org.example.dtl.util.DigitUtil;
import org.junit.Test;

public class DigitTests {

    @Test
    public void getLetter0To9() {
        int[] arr = {2, 3, 4};
        DigitUtil digitUtil = new DigitUtil();
        String result = digitUtil.getLetters0To9(arr);
        System.out.println(result);
    }

    @Test
    public void getLetter0To99() {
        int[] arr = {17, 18, 19};
        DigitUtil digitUtil = new DigitUtil();
        String result = digitUtil.getLetters0To99(arr);
        System.out.println(result);
    }

}
