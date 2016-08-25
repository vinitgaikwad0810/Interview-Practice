package arrays.problems;

import utils.GeneralUtils;

/**
 * Created by vinit on 8/25/16.
 */
public class OnePointOne {

    public static Boolean doesStringHaveAllUniqueCharacters(String givenString) {

        for (int i = 1; i < givenString.length(); i++) {

            int j = i - 1;
            while (j >= 0) {
                if (givenString.charAt(j) == givenString.charAt(i))
                    return Boolean.FALSE;
                j--;
            }
        }
        return Boolean.TRUE;
    }

    public static void main(String[] args) {


        GeneralUtils.println(doesStringHaveAllUniqueCharacters("afghi"));
    }


}
