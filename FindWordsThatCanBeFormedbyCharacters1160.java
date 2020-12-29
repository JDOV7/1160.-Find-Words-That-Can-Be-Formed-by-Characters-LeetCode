/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Daniel Ochoa
 */
public class FindWordsThatCanBeFormedbyCharacters1160 {

    public void FindWordsThatCanBeFormedbyCharacters1160() {
        String[] words = {"hello", "world", "leetcode"};
        String chars = "welldonehoneyr";
        int iSumWordsGoods = 0;
        for (String word : words) {
            StringBuilder sPattern = new StringBuilder(chars);
            boolean sState = true;
            for (int i = 0; i < word.length(); i++) {
                int iPositionLetter = sPattern.indexOf(new StringBuilder().append(word.charAt(i)).toString());
                if (iPositionLetter != -1) {
                    sPattern.replace(iPositionLetter, iPositionLetter + 1, "-");
                } else {
                    sState = false;
                    break;
                }
            }
            if (sState) {
                iSumWordsGoods += word.length();
            }
        }
        System.out.println(iSumWordsGoods);
    }
}
