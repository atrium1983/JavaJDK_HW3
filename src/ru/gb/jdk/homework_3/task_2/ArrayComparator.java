package ru.gb.jdk.homework_3.task_2;

public class ArrayComparator {

    public <E> boolean compareArrays(E[] e1, E[] e2){
        if(e1.length!= e2.length){
            return false;
        }
        for (int i = 0; i < e1.length; i++) {
            if(!(e1[i].getClass()).equals(e2[i].getClass())){
                return false;
            }
        }
        return true;
    }
}
