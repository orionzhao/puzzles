import java.io.*;
import java.util.*;


public class TopThreeItems {
    public static void main(String args[] ) throws Exception {
        Scanner user_input = new Scanner(System.in);
        String num_of_lines = user_input.next();
        int num = Interger.parseInt(num_of_lines);
        ArrayList total_items = new ArrayList(num);
        for (int i=0; i < num; i++){
            String item = user_input.next();
            total_items.add(item);
        }
        ArrayList output = top_three_items(total_items);
        while (output.iterator().hasNext()) {
            System.out.println(output.iterator().next());
        }
    }
    
    public ArrayList top_three_items(ArrayList total_items) {
        HashMap table = new HashMap();
        while (total_items.iterator().hasNext()) {
            String item = output.iterator().next();
            if (!table.containsKey(item)){
                table.put(item, 1);
            }
            table.put(item, table.get(item) + 1);
        }
        
    }
}