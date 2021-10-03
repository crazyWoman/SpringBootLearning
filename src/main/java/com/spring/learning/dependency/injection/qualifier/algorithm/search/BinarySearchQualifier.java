package com.spring.learning.dependency.injection.qualifier.algorithm.search;


import com.spring.learning.dependency.injection.qualifier.algorithm.SortingAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchQualifier {
    @Autowired
    @Qualifier("bubble")
    SortingAlgorithm sortingAlgorithm;
    public int search(int[] numbers,int num){
        //sort
        //find locatiom
        sortingAlgorithm.sort(numbers);
        return 10;
    }
}
