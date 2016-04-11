

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by Tom on 4/8/16.
 */
public class Message {

    public String rawInput; //Store raw input for future use

    //Part of Speech table - <word,POS>
    public Hashtable<String, String> POS_table;

    //Words by Part in ArrayLists
    // Limited to nouns, verbs, pronouns, adjectives and adverbas
    public ArrayList<String> nArray = new ArrayList<String>();
    public ArrayList<String> pnArray = new ArrayList<String>();
    public ArrayList<String> vArray = new ArrayList<String>();
    public ArrayList<String> advArray = new ArrayList<String>();
    public ArrayList<String> adjArray = new ArrayList<String>();


    public boolean isQuestion;
    //question type
    public String qType;


    //sentiment of the message : positive (1), negative (-1), or neutral (0)
    public int sentiment;

    public Message(String s) {
        rawInput = s;
        initPOS_table(s);
        initWBP_table();
        initQtype(s);
        System.out.println(this.toString());
    }

    private void initPOS_table(String s) {
        String tagged = POS_Tagger.tag(s);
        POS_table = POS_Tagger.makeTable(tagged);
    }

    //We've already parsed the string to create the POS table at this point.
    //Now we can iterate through the table and save words by their POS
    //Limit to Nouns,Pronouns, Verbs,  Adverbs, Adjectives
    private void initWBP_table() {
       // ArrayList<String> values = new ArrayList<String>(POS_table.values());
        Enumeration nuValues = POS_table.keys();

        while (nuValues.hasMoreElements()) {
            String nuVal = (String) nuValues.nextElement();
            String oldVal = POS_table.get(nuVal);
            if (oldVal.contains("NN")) {
                // Noun
                nArray.add(nuVal);
            } else if (oldVal.contains("PP$") | oldVal.contains("PRP") | oldVal.contains("WP")) {
                // Pronoun
                pnArray.add(nuVal);
            } else if (oldVal.contains("VB")) {
                //Verb
                vArray.add(nuVal);
            } else if (oldVal.contains("RB")) {
                //Adverb
                advArray.add(nuVal);
            } else if (oldVal.contains("JJ")) {
                //Adjective
                adjArray.add(nuVal);
            }
        }
    }

    private void initQtype(String s) {
        qType = "HAVEN'T FINISHED...";
        /*NOT DONE*/
    }


    @Override
    public String toString() {
        String ret = "";
        ret += "Raw Input: \n" + rawInput;
        ret += "\n Parts of Speech: \n" + POS_table.toString();
        ret += "\n Nouns: " + nArray.toString();
        ret += "\n Pronouns: " + pnArray.toString();
        ret += "\n Verbs: " + vArray.toString();
        ret += "\n Adverbs: " + advArray.toString();
        ret += "\n Adjectives: " + adjArray.toString();
        ret += "\n Is it a Question?: " + isQuestion;
        if (isQuestion) {
            ret += "\n Question Type: " + qType;
        }
        ret +="\n Sentiment: " + sentiment;

        return ret;
    }
}
