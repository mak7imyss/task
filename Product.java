package tasks;

import java.util.List;
import java.util.Arrays;

public class Product {
    public static int[] twoProduct(int[] r, int n) {
        Integer[] what = Arrays.stream(r).boxed().toArray( Integer[]::new );
        List<Integer> t = Arrays.asList(what);
        for (int x : r) if (n % x == 0 && t.contains(n/x) &&
                t.indexOf(x) > t.indexOf(n/x)) return new int[] {n/x, x};
        return new int[] {};
    }
}