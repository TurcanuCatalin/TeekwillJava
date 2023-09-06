package things;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class lessonStream {
    public static void main(String[] args) {
//        Stream<Integer> stream = Stream.of( 1,2,3,4,5,6,7,8,9 );
//        stream.forEach(p -> System.out.println(p));
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i< 10; i++){
            list.add(i);
        }

        Stream<Integer> streamFromList = list.stream();
//
//        System.out.println(streamFromList
//                .filter(i -> i <=8)
//                .map(i -> i * i)
//                .filter(i -> i%2!=1)
//                .map(i -> i/4)
//                .collect(Collectors.toList()));
    }

    //        static void generate(int limit){
//            Stream<Integer> randomNumbers = Stream
//                    .generate(() -> (new Random()).nextInt(10));
//
//            randomNumbers.limit(limit).forEach(elm -> System.out.print(elm + " "));
//
//    iterate();
//
//}
//static void iterate(){
//    // create a stream using iterate
//    Stream<Integer> stream
//            = Stream.iterate(1,
//            i -> i <= 20, i -> i * 2);
//
//    // print Values
//    stream.forEach(System.out::println);
//}


}
