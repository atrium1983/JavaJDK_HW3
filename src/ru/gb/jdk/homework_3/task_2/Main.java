package ru.gb.jdk.homework_3.task_2;

/*
Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые,
и false в противном случае. Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы
одного типа по парно по индексам.
 */

public class Main {
    public static void main(String[] args) {
        ArrayComparator comparator = new ArrayComparator();

        Integer[] array1 = {1,2,3,4,5};
        Integer[] array2 = {1,2,3,4,5};
        System.out.println(comparator.compareArrays(array1, array2));

        Byte[] array3 = {1,2,3,4,5};
        Integer[] array4 = {1,2,3,4,5};
        System.out.println(comparator.compareArrays(array3, array4));

        Integer[] array5 = {1,2,3,4,5,7,7};
        Integer[] array6 = {1,2,3,4,5};
        System.out.println(comparator.compareArrays(array5, array6));
    }
}
