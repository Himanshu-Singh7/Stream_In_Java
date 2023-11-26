package Work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        //Stream API :- Collection process
        // collection - Group of object
        
        
        // 1 : blank
        Stream<Object> empty = Stream.empty();
        // 2 :- array object collection
        String names[] = {"Himanshu", "Ram", "Uttam","Aparajita"};
        Stream<String> names1 = Stream.of(names);
        names1.forEach(e -> {
            System.out.println(e);
        });

       // 3 Builder

        Stream<Object> build = Stream.builder().build();
        // 4

        IntStream stream = Arrays.stream(new int[]{10, 34, 656, 68, 78});
        stream.forEach(e -> {
            System.out.println(e);
        });

        // 5 List , Set


        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(41);
        list2.add(43);
        list2.add(45);
        list2.add(2);

       list2.stream().forEach(e -> {
           System.out.println("List of Arrays : "+e);
       });

    }
}
