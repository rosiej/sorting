package pl.sdacademy.rozkocha.szymon.sorting;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort{
    public static List<Integer> sort(List<Integer> list) {
        List<Integer> result = new ArrayList<>(list);

        for(int i = 0;i < result.size() - 1;++i) {
            for(int j = 0;j < result.size() - 1 - i;++j) {
                if(result.get(j) > result.get(j + 1)) {
                    SortUtils.swap(result, j, j + 1);
                }
            }
        }

        return result;
    }
}
