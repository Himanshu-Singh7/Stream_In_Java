package Work;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) {

        List<Integer> list1 = List.of(2, 4, 8, 16, 17, 29, 30, 71, 79);

        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(41);
        list2.add(43);
        list2.add(45);
        list2.add(2);

        List<Integer> list3 = Arrays.asList(2, 5, 6, 8, 9, 141, 215, 2562);

        //List1
        // without stream

        ArrayList<Integer> listeven = new ArrayList<>();
        for (Integer i :list1) {

            if (i % 2 == 0){
                listeven.add(i);
            }
        }

        System.out.println(list1);
        System.out.println(listeven);


        //Using stream

//        Stream<Integer> stream = list1.stream();
//        List<Integer> Alllist = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
//        System.out.println("Stream API Answer "+ Alllist);

        List<Integer> listofeven = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("list of even reduce code"+listofeven);


        // Q :- Find out all number is greater than 15
        List<Integer> collect = list1.stream().filter((j) -> j > 15 ).collect(Collectors.toList());
        System.out.println("Greater than 15  : "+collect);
    }
}
