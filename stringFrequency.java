import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

/*
Write a function that takes two parameters: (1) a String representing a text 
document and (2) an integer providing the number of items to return. Implement
the function such that it returns a list of Strings ordered by word frequency,
the most frequently occurring word first.  Use your best judgement to decide
how words are separated. Your solution should run in O(n) time where n is the
number of characters in the document. Implement this function as you would for
a production/commercial system. You may use any standard data structures.
*  @author Oulun Zhao
*  @assumption1: informal abbr. such as "can't" are not used.
*  @assumption2: it is ok to ask for top 100 words when there are only 50 words.
The result will just be all the words without duplicates.
*  @assumption3: the string does not start with a punctuation sign.
*/

public class stringFrequency {

  public static void main(String args[]) {
    String textdoc = "insert test String here";
    int num_of_items_to_return = 2;
    ArrayList<String> result = solution(textdoc, num_of_items_to_return);
    for (String word:result) {
        System.out.println(word);
    }
  }

  /** Return an arraylist with the most frequent num elements from a 
  input string textdoc in frequency order
   *  @return ArrayList<String>
   */

  public static ArrayList<String> solution(String textdoc, int num) {
    String[] parsed = stringParser(textdoc);
    ArrayList<String> result = new ArrayList<String>();
    HashMap<String, Integer> words_map = new HashMap<String, Integer>();

    for (String word:parsed) {
      if (words_map.containsKey(word)) {
        int value = words_map.get(word).intValue();
        words_map.put(word, Integer.valueOf(value+1));
      } else {
        words_map.put(word, 1);  //check this later
      }
    }
    ArrayList<Entry<String, Integer>> list = 
      new ArrayList<Entry<String, Integer>>(words_map.entrySet());
    Collections.sort(list, new Comparator<Entry<String, Integer>>()
    {
      public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
        return o2.getValue().compareTo(o1.getValue());
      }
    });
    int k = 0;
    Iterator<Entry<String, Integer>> list_iterator = list.iterator();
    while (list_iterator.hasNext()) {
      if (k >= num) {
        break;
      }
      result.add(list_iterator.next().getKey());
      k++;
    }
    return result;
  }

  /** Parser that takes a String and returns an Array of all the words in 
  that String.
  *  @return String[]
  */
  public static String[] stringParser(String input_string) {
    String delimiters = "[\\p{Punct}\\s]+";
    String[] parsed = input_string.split(delimiters);
    return parsed;
  }
}