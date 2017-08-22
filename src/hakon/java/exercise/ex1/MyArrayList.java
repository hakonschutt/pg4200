package exercise.ex1;

import org.pg4200.datastructure.delete.ArrayDeleteContainer;

/**
 * Created by hakonschutt on 22/08/2017.
 */

public class MyArrayList<T> extends ArrayDeleteContainer<T> {
    public MyArrayList(){ super(); }

    public MyArrayList(int capacity){ super(capacity); }

    @Override
    public void add(T value){
        if(data.length == size){
            Object[] bigger = new Object[data.length * 2];
            for(int i=0; i<data.length; i++){
                bigger[i] = data[i];
            }
            data = bigger;
        }
        super.add(value);
    }
}
