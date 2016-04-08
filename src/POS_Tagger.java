import edu.stanford.nlp.tagger.maxent.MaxentTagger;

import java.io.IOException;
import java.util.Hashtable;
import java.util.StringTokenizer;

/**
 * Created by Tom on 4/7/16.
 */
public class POS_Tagger {

    // new tagger using bidirectional architecture
    public static MaxentTagger tagger = new MaxentTagger("taggers/english-bidirectional-distsim.tagger");

    public static Hashtable <String,String> makeTable(String s) {
        Hashtable<String, String> POS_table = new Hashtable<String, String>();
        //split input by spaces and underscores
        String[] splitUp = s.split("\\s|_");

        //iterate over splitUp, there will always be an even number of elements
        // since each element gets paired with a POS we can increment by twos
        for (int i =0; i <splitUp.length-1;i+=2) {
           POS_table.put(splitUp[i], splitUp[i+1]);
        }
        return POS_table;
    }

    public static String tag(String s) {
        return tagger.tagString(s);
    }

}
