import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

    //Imperative example 1
        for(int i =0; i<5;++i){

            System.out.println(" i is "+i);
        }

    // Declarative go to common line such Html and easy
       // example 1
        System.out.println("With determated Data ");
        IntStream stream=IntStream.of(1,2,3,4,5,6);
        stream.forEach(System.out::println);
        System.out.println("With Rang Data Data ");
        IntStream stream1=IntStream.rangeClosed(1,6);
        stream1.forEach(System.out::println);



        //Imperative example 2
        // Sum with old way
        int sum=0;
        for (int i=0;i<6;++i){

            sum+=i;
        }
        System.out.println( "Imperative Sum example ");
        System.out.println( "Sum is "+sum);



        //Declarative  example 2
        // Sum with java8 way
        int sum1=IntStream.rangeClosed(1,5).sum();
        System.out.println( "Declarative Sum example ");
        System.out.println( "Sum is "+sum1);





        //Imperative example 2 minimum
        List<Integer> list = Arrays.asList(1,2,3,6,4);
        int min = list.get(0);
        for( Integer s:list){
            if(s < min)
                min=s;
        }
        System.out.println("The minimun is with Imperative Style is "+min );



        //Declarative Style example 2 minimum
        List<Integer> declarativeList =Arrays.asList(1,2,3,6,4);
      Optional<Integer> min1= declarativeList.stream().min(Integer::compare);

        System.out.println("The minimun is with Declarative Style is "+min1 );



    }
}