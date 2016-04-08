

import java.util.Hashtable;

/**
 * Created by Tom on 4/8/16.
 */
public class Message {

    public String rawInput;

    public boolean isQuestion;
    public String qType;


    public Hashtable<String,String> POS_table;
    public Hashtable<String ,String> WBP_table;

    static int SENTIMENT;

    public Message(String s){
        initPOS_table(s);
        initQtypes(s);
        POS_table = toHashTable(s);


    }

    private void initPOS_table(String s) {

    }

    private void initQtypes(String s){
        /*NOT DONE*/
    }


    private Hashtable<String,String> toHashTable(String s) {
        return null;
    }
}
