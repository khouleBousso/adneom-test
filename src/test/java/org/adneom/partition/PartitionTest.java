package org.adneom.partition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;


public class PartitionTest {

    @Test(expected = IllegalArgumentException.class)
    public void partition_WithListNull_AndChunkEqualsZero() {
        Partition.partition(null, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void partition_listNullAndPositiveChunk() {
        Partition.partition(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void partition_emptyListAndChunkZero() {
        Partition.partition(new ArrayList<>(), 0);
    }

    @Test
    public void partition_emptyListAndPositiveChunk() {
        List<List<Integer>> result = Partition.partition(new ArrayList<>(), 1);
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void givenList_whenPartitioningIntoNSublists_thenCorrect() {

        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<List<Integer>> subSets = Partition.partition(intList, 3);

        List<Integer> lastPartition = subSets.get(2);
        List<Integer> expectedLastPartition = Arrays.asList(7, 8);
        Assert.assertEquals(subSets.size(), 3);
        Assert.assertEquals(lastPartition, expectedLastPartition);
    }


    @Test
    public void partition_NotEmptyListAndPositiveChunk_1() {
        List<List<Integer>> result = Partition.partition(Arrays.asList(1, 2, 5, 10, 8), 1);
        Assert.assertEquals(5, result.size());
        Assert.assertEquals(Collections.singletonList(1), result.get(0));
        Assert.assertEquals(Collections.singletonList(2), result.get(1));
        Assert.assertEquals(Collections.singletonList(5), result.get(2));
        Assert.assertEquals(Collections.singletonList(10), result.get(3));
        Assert.assertEquals(Collections.singletonList(8), result.get(4));
    }

    @Test
    public void partition_NotEmptyListAndPositiveChunk_2() {
        List<List<Integer>> result = Partition.partition(Arrays.asList(1, 2, 3, 4, 5), 2);
        Assert.assertEquals(3, result.size());
        Assert.assertEquals(Arrays.asList(1, 2), result.get(0));
        Assert.assertEquals(Arrays.asList(3, 4), result.get(1));
        Assert.assertEquals(Collections.singletonList(5), result.get(2));
    }
}
