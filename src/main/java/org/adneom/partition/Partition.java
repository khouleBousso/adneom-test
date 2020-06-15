package org.adneom.partition;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Objects;

/**
 * Library to implement partition on a given list.
 * This library use Guava
 * @author Ibrahima KHOULE
 */
public final class Partition {


    /**
     * Returns a view of the original list "<b>{@code pList}</b>" represented by
     * a list of sublists, on which each sublist has at most
     * "<b>{@code chunk}</b>" elements.<br>
     * <br>
     * <u>Examples</u> :
     * <ul>
     * <li>partition([1,2,3,4], 2) return [ [1,2], [3,4] ]
     * <li>partition([1,2,3,4], 3) return [ [1,2,3], [4] ]
     * <li>partition([1,2,3,4], 1) return [ [1], [2], [3], [4] ]
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
     * @throws IllegalArgumentException
     *             if "<b>{@code list}</b>" is null or "<b>{@code chunk}</b>"
     *             is lower than 1.
     */
    public static List<List<Integer>> partition
            (List<Integer> list, Integer chunk) {

        if (Objects.nonNull(list) && chunk > 0)
            return Lists.partition(list, chunk);

        throw new IllegalArgumentException("Input List cannot be null or chunk must be positive");
    }
}
