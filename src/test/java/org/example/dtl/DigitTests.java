package org.example.dtl;

import org.example.dtl.util.DigitUtil;
import org.junit.Test;

public class DigitTests {

    @Test
    public void getLetter0To9() {
        DigitUtil digitUtil = new DigitUtil();

        int[] arr1 = {2, 3};
        String result1 = digitUtil.getLetters0To9(arr1);
        System.out.println(result1);
        // ad ae af bd be bf cd ce cf

        int[] arr2 = {2, 3, 4};
        String result2 = digitUtil.getLetters0To9(arr2);
        System.out.println(result2);
        // adg adh adi aeg aeh aei afg afh afi bdg bdh bdi beg beh bei bfg bfh bfi cdg cdh cdi ceg ceh cei cfg cfh cfi
    }

    @Test
    public void getLetter0To99() {
        DigitUtil digitUtil = new DigitUtil();

        int[] arr1 = {12, 13};
        String result1 = digitUtil.getLetters0To99(arr1);
        System.out.println(result1);
        // ad ae af bd be bf cd ce cf

        int[] arr2 = {12, 13, 14};
        String result2 = digitUtil.getLetters0To99(arr2);
        System.out.println(result2);
        // adg adh adi aeg aeh aei afg afh afi bdg bdh bdi beg beh bei bfg bfh bfi cdg cdh cdi ceg ceh cei cfg cfh cfi

        int[] arr3 = {77, 88, 99};
        String result3 = digitUtil.getLetters0To99(arr3);
        System.out.println(result3);
        // ptw ptx pty ptz puw pux puy puz pvw pvx pvy pvz qtw qtx qty qtz quw qux quy quz qvw qvx qvy qvz rtw rtx rty
        // rtz ruw rux ruy ruz rvw rvx rvy rvz stw stx sty stz suw sux suy suz svw svx svy svz
    }

}
