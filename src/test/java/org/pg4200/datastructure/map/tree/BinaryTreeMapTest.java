package org.pg4200.datastructure.map.tree;

import org.junit.Before;
import org.junit.Test;
import org.pg4200.datastructure.map.MyMap;
import org.pg4200.datastructure.map.MyMapTestTemplate;

import static org.junit.Assert.*;

/**
 * Created by arcuri82 on 23-Aug-17.
 */
public class BinaryTreeMapTest extends MyMapTestTemplate {


    protected <K extends Comparable<K>, V> MyTreeBasedMap<K, V> getTreeInstance() {
        return new BinaryTreeMap<>();
    }

    @Override
    protected <K extends Comparable<K>, V> MyMap<K, V> getInstance() {
        return getTreeInstance();
    }

    /*
        Note: this field does NOT override the one in the super class.
     */
    private MyTreeBasedMap<Integer, String> map;


    /*
        Make sure this method does not have the same name as superclass, otherwise
        it will be overwritten, and all the tests in superclass will fail, as their
        "map" field would not be initialized
     */
    @Before
    public void initMyTreeBasedMapTestTemplateTest() {
        map = getTreeInstance();
    }


    @Test
    public void testDepthZero() {

        assertEquals(0, map.getMaxTreeDepth());
    }

    @Test
    public void testBalanced3(){

        map.put(5, "a");
        assertEquals(1, map.getMaxTreeDepth());

        map.put(0, "b");
        assertEquals(2, map.getMaxTreeDepth());

        map.put(10, "c");
        assertEquals(2, map.getMaxTreeDepth());
    }

    @Test
    public void testWorstCaseFor3(){

        //compared to previous test, here just changed the order of insertions

        map.put(0, "b");
        assertEquals(1, map.getMaxTreeDepth());

        map.put(5, "a");
        assertEquals(2, map.getMaxTreeDepth());

        map.put(10, "c");
        assertEquals(3, map.getMaxTreeDepth());
    }


    @Test
    public void testBalanced7(){

        map.put(5, "a");
        map.put(2, "a");
        map.put(3, "a");
        map.put(0, "a");
        map.put(8, "a");
        map.put(6, "a");
        map.put(10, "a");

        assertEquals(3, map.getMaxTreeDepth());
    }


    @Test
    public void testWorstCaseFor7(){

        //compared to previous test, here just changed the order of insertions

        map.put(10, "a");
        map.put(8, "a");
        map.put(6, "a");
        map.put(5, "a");
        map.put(3, "a");
        map.put(2, "a");
        map.put(0, "a");

        assertEquals(7, map.getMaxTreeDepth());
    }
}