package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambdas {

    public static void main(String[] args) {
    
        List<String>s=Arrays.asList("1","2","3","10","15","8","7");
        //s.forEach(System.out::println);
        
        List<Integer>numeros=s.stream()
                .map(x->Integer.parseInt(x))
                .map(x-> x*x)
                .filter(x-> x<100)
                .collect(Collectors.toList());
        
        numeros.forEach(System.out::println);
    }
    
}
