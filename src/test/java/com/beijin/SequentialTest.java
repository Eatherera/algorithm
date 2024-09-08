package com.beijin;

import com.beijin.linear.List;
import com.beijin.linear.SequentialList;
import org.junit.Test;

/**
 * Author:Eather
 * Time:2024/9/8 上午11:28
 */
public class SequentialTest {
    @Test
    public void test1() {
        List<Integer> list = new SequentialList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.size());
    }
}
