package org.adneom.partition;

import com.google.common.collect.Lists;
import org.adneom.partition.exception.PartitionException;
import org.adneom.partition.service.Partition;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class PartitionTest {

    @Test
    public void givenList_whenPartitioningIntoNSublists_thenCorrect() throws PartitionException {

        List<Integer> intList = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8);
        List<List<Integer>> subSets = Partition.partition(intList, 3);

        List<Integer> lastPartition = subSets.get(2);
        List<Integer> expectedLastPartition = Lists.<Integer> newArrayList(7, 8);
        assertThat(subSets.size(), equalTo(3));
        assertThat(lastPartition, equalTo(expectedLastPartition));
    }

}
