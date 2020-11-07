import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {

    public static void main(String[] args){
        FindMax findMax = new FindMax();
        List<Integer> list = new ArrayList<>();
        list.add(42);
        list.add(9);
        list.add(10);
        list.add(100);
        list.add(74);
        list.add(23);
        list.add(19);
        list.add(2000);

        long start = System.nanoTime();
        System.out.println("The max of the array is " + findMax.findMax(list));
        System.out.println(System.nanoTime() - start + " ns");

        long start2 = System.nanoTime();
        System.out.println(Collections.max(list));
        System.out.println(System.nanoTime() - start2 + " ns");
    }
}
