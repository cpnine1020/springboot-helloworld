package test;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Test {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<Integer> l2 = list.stream().map(a -> a * a).collect(toList());
        System.out.println(l2);

        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l3 = Arrays.asList(3, 4);
        System.out.println(l1.stream().flatMap(i -> l3.stream().map(j -> new int[]{i, j})).collect(toList()));
        //System.out.print(pairs);
    }
}
