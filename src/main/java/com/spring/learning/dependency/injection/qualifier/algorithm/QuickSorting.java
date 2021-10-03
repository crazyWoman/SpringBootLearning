package com.spring.learning.dependency.injection.qualifier.algorithm;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSorting implements SortingAlgorithm {
    @Override
    public int[] sort(int[] numbers) {
        return new int[]{2,5,20,200};
    }
}
