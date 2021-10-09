package com.spring.learning.dependency.injection.algorithm.search;

import com.spring.learning.dependency.injection.algorithm.SortingAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchAlgorithm {
    //dependency```````
    @Autowired
    SortingAlgorithm bubbleSort;
    public int search(int[] numbers,int num){
        //sort
        //find locatiom
        bubbleSort.sort(numbers);
        return 3;
    }
}
