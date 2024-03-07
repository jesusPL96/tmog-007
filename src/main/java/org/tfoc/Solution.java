package org.tfoc;

import java.util.Arrays;

/**
 * The class containing the solution to this exercise
 */
public class Solution {

    public static boolean isAnagram(
            String s,
            String t) {

        if(s != null && t != null && t.length() == s.length()){

            s = s.toLowerCase();
            t = t.toLowerCase();

            var sCharArray = s.toLowerCase().toCharArray();
            var tCharArray = t.toLowerCase().toCharArray();


            Arrays.sort(sCharArray);
            Arrays.sort(tCharArray);

            return Arrays.equals(sCharArray,tCharArray);

        } else {
            return false;
        }
    }

}
