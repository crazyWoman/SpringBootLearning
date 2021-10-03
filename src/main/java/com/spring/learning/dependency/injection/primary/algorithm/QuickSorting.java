package com.spring.learning.dependency.injection.primary.algorithm;

import org.springframework.stereotype.Component;

@Component
public class QuickSorting implements SortingAlgorithm {
    @Override
    public int[] sort(int[] numbers) {
        return new int[]{2,5,20,200};
    }
}
