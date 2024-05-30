package ru.gb.jdk.homework_3.task_1;

/*
Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа,
над которыми должна быть произведена операция. Методы должны возвращать результат своей работы.
*/

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int number1 = 2;
        double number2 = 5.67;
        System.out.println(calculator.sum(number1, number2));
        System.out.println(calculator.multiply(number1, number2));
        System.out.println(calculator.divide(number1, number2));
        System.out.println(calculator.subtract(number1, number2));
    }
}
