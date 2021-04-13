import java.util.*;

import org.apache.commons.lang3.ArrayUtils;


public class task1 {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.print("Input string: ");
            String text = in.next();
            in.close();



            System.out.println("String: " + text);

            char[] myArray = text.toCharArray();
            List<Item> items = new ArrayList<>();
            Item item = new Item(myArray[0]);

            for (int i = 1; i < text.length(); ++i){
               if(myArray[i] != item.symbol){
                   items.add(item);
                   item = new Item(myArray[i]);
               }
               else{
                   item.number++;
               }
            }
            items.add(item);
            for (Item one : items) {
                System.out.print(one.toString());
           }



//            int count = 0;
//
//            HashMap<Character, Integer> chars = new HashMap<Character, Integer>();
//            for (int i = 0; i < text.length(); ++i) {
//                char c = text.charAt(i);
//                if (Character.isLetter(c)) {
//                    if (chars.containsKey(c)) {
//                        chars.put(c, chars.get(c) + 1);
//                    } else {
//                        chars.put(c, 1);
//                    }
//                }
//            }
//            int maxValueInMap = (Collections.max(chars.values()));
//            for (Map.Entry entry : chars.entrySet()) {
//                System.out.print(entry.getValue() + "" + entry.getKey());
//            }
        }
        public static class Item {
            Character symbol;
            int number;

            public Item(Character symbol) {
                this.symbol = symbol;
                this.number = 1;
            }

            @Override
            public String toString() {
                return "" + number + symbol;
            }
        }
}
