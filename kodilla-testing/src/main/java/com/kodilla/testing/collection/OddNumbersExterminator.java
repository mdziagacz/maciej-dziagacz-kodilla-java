package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> evenList = new ArrayList<Integer>();

        for (Integer temp : numbers) {
            if (temp % 2 == 0) {
                evenList.add(temp);
            }
        }
        return evenList;
    }
}
