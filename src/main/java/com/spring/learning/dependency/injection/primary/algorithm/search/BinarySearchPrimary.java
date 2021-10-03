package com.spring.learning.dependency.injection.primary.algorithm.search;


import com.spring.learning.dependency.injection.primary.algorithm.SortingAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchPrimary {
    @Autowired
    SortingAlgorithm sortingAlgorithm;
    public int search(int[] numbers,int num){
        //sort
        //find locatiom
        sortingAlgorithm.sort(numbers);
        return 9;
    }
}
