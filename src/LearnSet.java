import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
       // Set<Integer> set=new HashSet<>();
       // Set<Integer> set=new LinkedHashSet<>();
        Set<Integer> set=new TreeSet<>();
        set.add(36);
        set.add(33);
        set.add(44);
        set.add(66);

        System.out.println(set);

        set.remove(44);
        System.out.println(set);

        System.out.println(set.contains(66));

        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);
    }
}
