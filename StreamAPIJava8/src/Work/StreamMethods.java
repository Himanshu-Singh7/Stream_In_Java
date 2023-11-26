package Work;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {

        //filter(Predicate)
        //boolean value function
        List<String> names = List.of("Aman","Aprajit","Aditya","Himanshu");
        List<String> newName = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println("Start with name A : "+ newName);


        //map(Function)
        // Each element operation

        List<Integer> numbers = List.of(4,45,55,66,67,68,69);
        List<Integer> collect = numbers.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(collect);

      //
        names.stream().forEach(

                e->{
                    System.out.println(e);
                });

        newName.stream().forEach(System.out ::println);
   // Sorted()
        numbers.stream().sorted().forEach(System.out::println);
   //min()

        Integer integer = numbers.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("MIN : "+integer);

   // max()
        Integer integer1 = numbers.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println("MAX : " +integer1);

    }
}
