package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    SinglyLinkedList<String> list;
    @Before
    public void before(){
        list = new SinglyLinkedList<String>();
    }
    @Test
    public void testAdd() {
        String expected = "test";
        list.add(expected);
        Assert.assertTrue(list.contains(expected));
    }

    @Test
    public void testRemove() {
        String expected = "test";
        list.add(expected);
        list.remove(expected);
        Assert.assertTrue(list.remove(expected));
    }

    @Test
    public void testContains() {
        String expected = "test";
        list.add(expected);
        Assert.assertTrue(list.contains(expected));
    }

    @Test
    public void testFind1() {
        int expected = 1;
        String val = "target";
        list.add("");
        list.add(val);

        int actual = list.find(val);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFind2() {
        int expected = -1;
        String val = "target";
        list.add("");
        list.add("");

        int actual = list.find(val);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSize() {
        int expected = 2;
        list.add("");
        list.add("");
        list.add("");
        int actual = list.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGet() {
        String expected = "target";

        list.add("");
        list.add(expected);
        int actual = list.get(1).data;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testCopy() {
        list.add("");
        list.add("1");
        list.add("2");

        SinglyLinkedList<String> newList = list.copy();

        Assert.assertNotEquals(list.toString(),newList.toString());
        for (int i = 0; i < list.size(); i++) {
            Assert.assertEquals(list.get(i).data, newList.get(i).data);

        }
    }

    @Test
    public void testSort() {
        list.add("0");
        list.add("1");
        list.add("2");

        list.sort();
        Assert.assertEquals(list.get(0).data,"0");
        Assert.assertEquals(list.get(0).data,"1");
        Assert.assertEquals(list.get(0).data, "2");
    }
}
