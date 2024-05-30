package ru.gb.jdk.homework_3.task_1;

public class Calculator {

    public static <E extends Number> double sum(E number1, E number2){
        return number1.doubleValue() + number2.doubleValue();
    }

    public static <E extends Number> double multiply(E number1, E number2){
        return number1.doubleValue() * number2.doubleValue();
    }

    public static <E extends Number> double divide(E number1, E number2){
        if(number2.doubleValue() == 0){
            throw new ArithmeticException("Делитель не может быть равен 0");
        }
        return number1.doubleValue() / number2.doubleValue();
    }

    public static <E extends Number> double subtract(E number1, E number2){
        return number1.doubleValue() - number2.doubleValue();
    }
}
