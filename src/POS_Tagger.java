import edu.stanford.nlp.tagger.maxent.MaxentTagger;

import java.io.IOException;
import java.util.Hashtable;
import java.util.StringTokenizer;

/**
 * Created by Tom on 4/7/16.
 */
public class POS_Tagger {

    static MaxentTagger tagger = new MaxentTagger("taggers/english-bidirectional-distsim.tagger"); // new tagger using bidirectional distsim

    static Hashtable <String,String> makeTable(String s) {

        Hashtable<String, String> POS_table = new Hashtable<String, String>();
        //split input by spaces
        String[] splitBySpace = s.split(" ");
        //Iterate over splitBySpace and split again by underscore
        for (String uScored : splitBySpace) {
            String[] splitByUScore = uScored.split("_");
           POS_table.put(splitByUScore[0], splitByUScore[1]);
        }
        return POS_table;
    }

    public static String tag(String s) {
        return tagger.tagString(s);
    }

}
