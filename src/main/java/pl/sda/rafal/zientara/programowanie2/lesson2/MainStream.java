package pl.sda.rafal.zientara.programowanie2.lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MainStream {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);

        List integer = Arrays.asList(new Integer []{1,2,3});
        List inte = Arrays.asList(new int[]{1,2,3});
        System.out.println(inte==integer);

//        list.stream()
//                .map(integer -> "lol" + integer)
                /*.map(new Function<Integer, String>() {
                    @Override
                    public String apply(Integer integer) {
                        return "lol" + integer;
                    }
                })*/
    }
}
