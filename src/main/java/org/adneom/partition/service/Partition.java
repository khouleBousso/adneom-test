package org.adneom.partition.service;

import com.google.common.collect.Lists;
import org.adneom.partition.exception.PartitionException;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Library to implement partition on a given list.
 * This library use Guava
 * @author khoule
 */
public class Partition {


    /**
     * Returns a view of the original list "<b>{@code pList}</b>" represented by
     * a list of sublists, on which each sublist has at most
     * "<b>{@code chunk}</b>" elements.<br>
     * <br>
     * <u>Examples</u> :
     * <ul>
     * <li>partition([1,2,3,4,5], 2) return [ [1,2], [3,4], [5] ]
     * <li>partition([1,2,3,4,5], 3) return [ [1,2,3], [4,5] ]
     * <li>partition([1,2,3,4,5], 1) return [ [1], [2], [3], [4], [5] ]
     * </ul>
     * <u>Note</u> : The returned sublists contains Mutable or Immutable objects
     * depending of the input list (e.g. An input list of {@link Integer}).<br>
     * <br>
     *
     * @param list
     *            The original list (not null).
     * @param chunk
     *            The maximum size of a sublist (greater than zero).
     * @return a new {@link List}
     * @throws PartitionException
     *             if "<b>{@code list}</b>" is null or "<b>{@code chunk}</b>"
     *             is lower than 1.
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
