package arrays.problems;


import utils.GeneralUtils;

import java.util.Stack;

/**
 * Created by vinit on 8/25/16.
 */
public class OnePointFive {


    public static String compression(String givenString) {

        Stack<Character> compressionStack = new Stack<>();

        StringBuilder compressedGivenString = new StringBuilder();

        for (int i = 0; i < givenString.length(); i++) {


            if (!compressionStack.empty() && (compressionStack.peek() != givenString.charAt(i))) {
                compressedGivenString.append(compressionStack.peek());
                compressedGivenString.append(compressionStack.size());
                compressionStack.removeAllElements();

            }
            compressionStack.push(givenString.charAt(i));


        }

        if (!compressionStack.empty()) {
            compressedGivenString.append(compressionStack.peek());
            compressedGivenString.append(compressionStack.size());
            compressionStack.removeAllElements();
        }
        GeneralUtils.println(compressionStack);
        return compressedGivenString.toString();
    }

    public static void main(String[] args) {

        GeneralUtils.println(compression("aabcccccaaammmmmmmmmmnnr"));
    }
}
