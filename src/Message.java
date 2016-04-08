

import java.util.Hashtable;

/**
 * Created by Tom on 4/8/16.
 */
public class Message {

    public String rawInput; //Store raw input for future use

    public boolean isQuestion;
    public String qType; //question type


    public Hashtable<String, String> POS_table; //Part of Speech table - <word,POS>
    public Hashtable<String, String> WBP_table; //Words by Part table - <POS,words>.
                                                // Limited to nouns, verbs, pronouns, adjectives and adverbas

    public int sentiment; //sentiment of the message : positive (1), negative (-1), or neutral (0)

    public Message(String s) {
        initPOS_table(s);
        initQtypes(s);
        POS_table = toHashTable(s);

    }

    private void initPOS_table(String s) {
        String tagged = POS_Tagger.tag(s);
        System.out.println("tagged: " + tagged);
        POS_table = POS_Tagger.makeTable(tagged);
        System.out.println("after makeTable():");
        Global.printHashTable(POS_table);
    }

    private void initQtypes(String s) {
        /*NOT DONE*/
    }


    private Hashtable<String, String> toHashTable(String s) {
        return null;
    }

    @Override
    public String toString() {
        return "I am a Message...";
    }
}
