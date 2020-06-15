package org.adneom.partition.service;

import com.google.common.collect.Lists;
import org.adneom.partition.exception.PartitionException;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author khoule
 */
public class Partition {

    /**
     *
     * @param list
     * @param chunk
     * @return
     * @throws PartitionException
     */
    public static List<List<Integer>> partition
            (List<Integer> list, Integer chunk) throws PartitionException {

        if (Objects.nonNull(list) && chunk > 0)
            return Lists.partition(list, chunk);

        throw new PartitionException("Input List cannot be null or chunk must be positive");
    }

    public static void main(String[] args) throws PartitionException {
        List<Integer> inputList = Arrays.asList(1,2,3,5);
        System.out.println(Partition.partition(inputList, -1));
    }

}
