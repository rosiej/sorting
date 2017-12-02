package pl.sdacademy.rozkocha.szymon.sorting;

import java.util.List;

public class SortUtils {
    static void swap(List<Integer> numbers, int i, int j) {
        int temp = numbers.get(i);
        numbers.set(i, numbers.get(j));
        numbers.set(j, temp);
    }
}
