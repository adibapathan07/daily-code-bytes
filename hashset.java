import java.util.*;
public class hashset {
    public static void main(String [] args){//
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);
         System.out.println(" size of set is :" + set.size());
         System.out.println(set);

         Iterator it = set.iterator();
         System.out.println(it.next());

       
    }
}