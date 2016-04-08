import java.util.Hashtable;

/**
 * Created by Tom on 4/8/16.
 */
public class Message {
    //Create the POS_table with <word,POS>
    Hashtable<String,String> POS_table;

    public Message(String s){
        initPOS_table(s);
        initQtypes(s);
        POS_table = toHashTable(s);


    }

    private Hashtable<String,String> toHashTable(String s) {

    }
}
