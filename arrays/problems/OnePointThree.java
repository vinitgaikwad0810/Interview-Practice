package arrays.problems;

import utils.GeneralUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by vinit on 8/25/16.
 */
public class OnePointThree {


    public static Boolean isPermutationOf(String givenString, String toBeTested) {

        Map<Character, Integer> characterIntegerMap = new HashMap<>();

        for (int i = 0; i < givenString.length(); i++) {

            characterIntegerMap.put(givenString.charAt(i), characterIntegerMap.get(givenString.charAt(i)) == null ? 1 : characterIntegerMap.get(givenString.charAt(i)) + 1);

        }


        for (int i = 0; i < toBeTested.length(); i++) {

            if (Objects.isNull(characterIntegerMap.get(toBeTested.charAt(i)))) {
                return Boolean.FALSE;

            } else {

                Integer count = characterIntegerMap.get(toBeTested.charAt(i));

                characterIntegerMap.put(toBeTested.charAt(i), count - 1);

            }


        }


        if (characterIntegerMap.values().stream().allMatch(p -> {
            return p == 0;
        })) {
            return Boolean.TRUE;
        } else
            return Boolean.FALSE;


    }

    public static void main(String[] args) {

        GeneralUtils.println(isPermutationOf("vinit", "tinvi"));
    }
}
