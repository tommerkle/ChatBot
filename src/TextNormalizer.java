/**
 * Created by Tom on 4/8/16.
 *
 * A TextNormalizer is meant to take in an input string and do two things:
 *          1. Fix spelling mistakes in input
 *          2. Expand any contractions
 *          3. More?
 */

public class TextNormalizer {


    public static String normalize(String input) {
        return fixSpelling(expandContractions(input));

    }

    //NOT FINISHED
    public static String fixSpelling(String input){
        return "";
    }

    public static String expandContractions(String input){
        return "";
    }
}
