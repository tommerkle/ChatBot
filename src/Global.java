import java.util.*;


/**
 * Created by Tom on 4/8/16.
 */
public class Global {

    static void printArray(String[] array) {
        for (String s : array
                ) {
            System.out.println(s);

        }
    }

    static void printHashTable(Hashtable<String, String> hashtable) {
        System.out.println(hashtable);
    }


    public static String getKey(Hashtable<String, String> pos_table, String value) {
        //getting a key by its value
        String key = null;
        for (Map.Entry entry : pos_table.entrySet()) {
            if (value.equals(entry.getValue())) {
                key = (String) entry.getKey();

                break; //breaking because its one to one map
            }
        }
        return key;
    }
}
