package arrays.problems;

import utils.GeneralUtils;

/**
 * Created by vinit on 8/25/16.
 */
public class OnePointTwo {

    /**
     * Reversing a string
     * @param givenString
     * @return
     */
    public static String reverse(String givenString) {

        char temp;
        char[] givenCharArray = givenString.toCharArray();

        for (int i = 0, j = givenCharArray.length - 1; i < j; i++, j--) {

            temp = givenCharArray[j];
            givenCharArray[j] = givenCharArray[i];
            givenCharArray[i] = temp;

        }

        return new String(givenCharArray);
    }

    public static void main(String[] args) {

        GeneralUtils.println(reverse("2344567"));
    }
}
