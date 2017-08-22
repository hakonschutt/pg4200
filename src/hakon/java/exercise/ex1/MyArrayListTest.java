package exercise.ex1;
package org.pg4200.exercise.ex01;

import test.java.org.pg4200.datastructure.delete.DeleteContainer;
import test.java.org.pg4200.datastructure.delete.DeleteContainerTestTemplate;

/**
 * Created by hakonschutt.
 */
public class MyArrayListTest extends DeleteContainerTestTemplate{
    @Override
    protected <T> DeleteContainer<T> getNewInstance(Class<T> klass) {
        return new exercise.ex1.MyArrayList<>(1);
    }
}
