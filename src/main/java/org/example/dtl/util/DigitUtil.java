package org.example.dtl.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DigitUtil {

    public String getLetters0To9(int[] arr) {
        if (arr == null) {
            return "";
        }
        Map<Integer, String[]> letterMap = new HashMap<>();
        letterMap.put(2, new String[]{"A", "B", "C"});
        letterMap.put(3, new String[]{"D", "E", "F"});
        letterMap.put(4, new String[]{"G", "H", "I"});
        letterMap.put(5, new String[]{"J", "K", "L"});
        letterMap.put(6, new String[]{"M", "N", "O"});
        letterMap.put(7, new String[]{"P", "Q", "R", "S"});
        letterMap.put(8, new String[]{"T", "U", "V"});
        letterMap.put(9, new String[]{"W", "X", "Y", "Z"});

        List<String[]> letterArrList = new ArrayList<>();
        for (int num : arr) {
            if (num != 0 && num != 1) {
                letterArrList.add(letterMap.get(num));
            }
        }

        // 获取结果总长度
        int resultLength = letterArrList.size() > 0 ? 1 : 0;
        List<Integer> lenList = new ArrayList<>();
        int arrLength = arr.length;
        for (int i = 0; i < letterArrList.size(); i++) {
            String[] letterArr = letterArrList.get(i);
            resultLength = resultLength * letterArr.length;
            lenList.add(resultLength);
        }

        // 循环填充数组
        String[] resultArr = new String[resultLength];
        int len = resultLength;
        for (int i = 0; i < letterArrList.size(); i++) {
            String[] letterArr = letterArrList.get(i);
            len = len / letterArr.length;
            int lastLen = len * letterArr.length;
            for (int k = 0; k < resultLength; k++) {
                resultArr[k] = resultArr[k] == null ? "" : resultArr[k];
                int index = k / len;
                if(i > 0){
                    index = k % lastLen / len;
                }
                resultArr[k] = resultArr[k] + letterArr[index];
            }
        }
        return String.join(" ", resultArr).toLowerCase();
    }

    public String getLetters0To99(int[] arr) {
        if (arr == null) {
            return "";
        }
        Map<Integer, String[]> letterMap = new HashMap<>();
        for (int i = 1; i <= 99; i++) {
            int i1 = i % 10;
            switch (i1) {
                case 2:
                    letterMap.put(i, new String[]{"A", "B", "C"});
                    break;
                case 3:
                    letterMap.put(i, new String[]{"D", "E", "F"});
                    break;
                case 4:
                    letterMap.put(i, new String[]{"G", "H", "I"});
                    break;
                case 5:
                    letterMap.put(i, new String[]{"J", "K", "L"});
                    break;
                case 6:
                    letterMap.put(i, new String[]{"M", "N", "O"});
                    break;
                case 7:
                    letterMap.put(i, new String[]{"P", "Q", "R", "S"});
                    break;
                case 8:
                    letterMap.put(i, new String[]{"T", "U", "V"});
                    break;
                case 9:
                    letterMap.put(i, new String[]{"W", "X", "Y", "Z"});
                    break;
                default:
                    break;
            }
        }

        List<String[]> letterArrList = new ArrayList<>();
        for (int num : arr) {
            int num1 = num % 10;
            if (num1 != 0 && num1 != 1) {
                letterArrList.add(letterMap.get(num));
            }
        }

        // 获取结果总长度
        int resultLength = letterArrList.size() > 0 ? 1 : 0;
        List<Integer> lenList = new ArrayList<>();
        int arrLength = arr.length;
        for (int i = 0; i < letterArrList.size(); i++) {
            String[] letterArr = letterArrList.get(i);
            resultLength = resultLength * letterArr.length;
            lenList.add(resultLength);
        }

        // 循环填充数组
        String[] resultArr = new String[resultLength];
        int len = resultLength;
        for (int i = 0; i < letterArrList.size(); i++) {
            String[] letterArr = letterArrList.get(i);
            len = len / letterArr.length;
            int lastLen = len * letterArr.length;
            for (int k = 0; k < resultLength; k++) {
                resultArr[k] = resultArr[k] == null ? "" : resultArr[k];
                int index = k / len;
                if(i > 0){
                    index = k % lastLen / len;
                }
                resultArr[k] = resultArr[k] + letterArr[index];
            }
        }
        return String.join(" ", resultArr).toLowerCase();
    }

}
