package sort;

import duck.DonaldDuck;
import duck.Duck;
import duck.RocketDuck;
import duck.TealDuck;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author pasoktummarungsri
 */
public class DuckStream {

    public static void prints(Duck s) {
        System.out.println(s);
    }

    public static void prints(Optional<Duck> opt) {
        if (opt.isPresent()) {
            opt.get().bark();
        }
        opt.ifPresent(DuckStream::prints);
    }

    public static void main(String[] args) {

        List<Duck> list = Arrays.asList(new DonaldDuck(1),
                new RocketDuck(2),
                new TealDuck(1),
                new DonaldDuck(3),
                new TealDuck(1),
                new TealDuck(4),
                new DonaldDuck(3),
                new DonaldDuck(2));

        List<List<Integer>> listList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(1, 2, 3),
                Arrays.asList(1, 2, 3));

//        for (int i = 0; i<list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//        System.out.println("=================================");
//        
//        list.stream().forEach(DuckStream::prints);
//        System.out.println("=================================");
//        
//        list.parallelStream().forEach((s) -> System.out.println(s));
//        System.out.println("=================================");
//        List<Integer> s = list.stream()
//                .map(d -> d.getAge())
//                .collect(Collectors.toList());
//        System.out.println(s);
//        System.out.println("=================================");
//        List<Integer> s1 = listList.stream()
//                .flatMap(d -> d.stream())
//                .collect(Collectors.toList());
//        System.out.println(s1);
//        System.out.println("=================================");
//        List<Duck> result = list.stream()
//                .filter( d -> d.getAge() > 2)
//                .collect(Collectors.toList());
//        System.out.println(result);
//        System.out.println("=================================");

//        Optional<Duck> duck1 = list.stream()
//                .filter(d -> d.getAge() > 2)
//                .findFirst();
//        Optional<Duck> duck2 = list.stream()
//                .filter(d -> d.getAge() > 5)
//                .findFirst();
//        prints(duck1);
//        prints(duck2);
//        System.out.println("=================================");

        Integer sum = listList.stream()
                .flatMap(d -> d.stream())
                .reduce(1, (a, b) -> a * b);
        System.out.println(sum);
        System.out.println("=================================");
        
        Integer sum2 = listList.stream()
                .flatMap(d -> d.stream())
                .mapToInt(d -> d)
                .sum();
        System.out.println(sum2);
        System.out.println("=================================");
    }

}
