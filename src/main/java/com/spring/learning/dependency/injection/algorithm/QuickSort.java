package com.spring.learning.dependency.injection.algorithm;

import org.springframework.stereotype.Component;

@Component
public class QuickSort implements SortingAlgorithm{
    @Override
    public int[] sort(int[] numbers) {
        return new int[]{2,5,20,200};
    }
}
