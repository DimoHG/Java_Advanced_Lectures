package arrayCreator;

import java.lang.reflect.Array;

public class ArrayCreator {

    public static <T>  T[] create(int length, T item){
        T[] array = (T[]) Array.newInstance(item.getClass(), length);
        System.out.println();
        for (int i = 0; i < length; i++) {
            array[i] = item;
        }
        return array;
    }

    public static <T> T[] create(Class<T> clazz, int length, T item){
        T[] result = (T[]) Array.newInstance(clazz, length);
        for (int i = 0; i < length; i++) {
            result[i] = item;
        }
        return result;
    }




}
