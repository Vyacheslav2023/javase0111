package ru.javalang.module16;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * При работе например с массивом стримов (массивов, списков и так далее) преобразует их в один стрим (массив,список и так далее
 *
 * [stream1,stream2,stream3,stream4] => stream
 */
public class Sample1622 {
    public static void main(String[] args) {
        String[] array = {"Java", "Arrrrrayyy"};
        Stream<String> streamOfArray = Arrays.stream(array);
        streamOfArray.map(s->s.split("")) //Преобразование слова в массив букв
                .flatMap(Arrays::stream).distinct() //выравнивает каждый сгенерированный поток в один поток
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}
