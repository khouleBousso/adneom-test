package org.adneom.partition;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Partition {

    public static List<List<Integer>> partition
            (List<Integer> intList, Integer chunck) {
        return  Lists.partition(intList, chunck);
    }

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(1,2,3,4,5);
        System.out.println(Partition.partition(new ArrayList<Integer>(inputList), 1));
    }

}
