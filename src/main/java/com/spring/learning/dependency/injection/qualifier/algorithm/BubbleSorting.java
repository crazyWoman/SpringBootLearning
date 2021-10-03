package com.spring.learning.dependency.injection.qualifier.algorithm;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSorting implements SortingAlgorithm {
    @Override
    public int[] sort(int[] numbers) {
        return new int[]{2,5,20,200};
    }
}
