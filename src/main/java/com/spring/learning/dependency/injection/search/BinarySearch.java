package com.spring.learning.dependency.injection.search;

import com.spring.learning.dependency.injection.algorithm.SortingAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;

public class BinarySearch {
    @Autowired
    SortingAlgorithm bubbleSort;
    public int search(int[] numbers,int num){
        //sort
        //find locatiom
        bubbleSort.sort(numbers);
        return 3;
    }
}
