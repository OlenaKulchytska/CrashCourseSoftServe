package Task10;

import java.util.HashSet;

public class UnionAndIntersect {
    public static void main(String args[]) {
        HashSet<String> set1 = new HashSet <String>();
        HashSet <String> set2 = new HashSet <String>();
        set1.add("Mat");
        set1.add("Sat");
        set1.add("Cat");
        System.out.println("Set1 = "+ set1);
        set2.add("Mat");
        set2.add("Cat");
        set2.add("Fat");
        set2.add("Hat");
        System.out.println("Set2 = "+ set2);
        set1.addAll(set2);
        System.out.println("Union = "+ set1);
        set1.retainAll(set2);
        System.out.println("Intersect = "+ set1);
    }
}
