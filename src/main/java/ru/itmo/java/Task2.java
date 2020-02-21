package ru.itmo.java;

@SuppressWarnings("all")
public class Task2 {

    /**
     * Дано произвольное вещественное число. Выведите его дробную часть
     * <p>
     * Например
     * - дано 17.9
     * - вывод 0.9
     */
    double getFractionalPart(double realNumber) {
        realNumber = realNumber % 1;
        return realNumber; //your code here
    }

    /**
     * Дан символ, верните его код. Не используйте явное приведение типов и любые библиотечные функции
     */
    int charCode(char c) {
        int b = c + 0;
        return b; //your code here
    }

    /**
     * Даны 2 целых числа. Проверьте равны ли они
     */
    boolean testIfIntsEqual(Integer a, Integer b) {
        boolean c = false;
        if (a == b) c = true;

        return c; //your code here
    }

    /**
     * Дано целое число. Выведите {@code true}, если оно входит в заданный диапазон или {@code false}
     * в иных случаях
     *
     * @param number      заданное число
     * @param leftBound   правая граница диапазона
     * @param rightBound  верхняя граница диапазона
     * @param inclusively входят ли границы в заданный даипазон
     */
    boolean numberInRange(Integer number, Integer leftBound, Integer rightBound, Boolean inclusively) {
        boolean otvet = false;
        if (inclusively == true) {
            if ((number >= leftBound) && (number <= rightBound)) otvet = true;
        } else {
            if ((number > leftBound) && (number < rightBound)) otvet = true;
        }
        return otvet; //your code here
    }

    /**
     * Даны 3 символа. Определите является ли хотя бы один из них цифрой 1..9
     */
    boolean atLeastOneIsDigit(char c1, char c2, char c3) {
        boolean otvet = (Character.isDigit (c1)) || (Character.isDigit (c2)) || (Character.isDigit (c3));
        return otvet; //your code here
    }

    /**
     * Даны два вещественных числа. Определите равны ли они
     */
    boolean areRealNumbersEqual(double a, double b)
    {
        double EPS = 0.00001;
        if (Math.abs(a - b) < EPS) return true;
        else return false;
        //return false; //your code here
    }

    /**
     * Дано трехзначное число 100 <= N <= 999. Найдите сумму его чисел.
     */
    int sumOfDigits(int n) {
        int a1 = n % 10;
        int b1 = (n / 10) % 10;
        int c1 = n / 100;
        int n1 = a1 + b1 + c1;
        return n1; //your code here
    }

    /**
     * Дано натуральное число N <= 10000. Выведите следующее после N четное число. Например: N = 8, Result = 10
     */
    int nextEvenNumber(int n)
    {
        int ch = ((n + 2) / 2) * 2;
        return ch; //your code here
    }

    /**
     * Школа №32 решила создать 3 дополнительных физмат класса и укомплектовать кабинеты новыми партами.
     * За одной партой может сидеть 2 ученика. Кол-во учеников в каждом из классов известно (num1, num2, num3).
     * Выведите минимальное кол-во парт, которые нужно приобрести школе, при условии что каждый из классов сидит в
     * своем кабинете
     */
    int schoolDesks(int num1, int num2, int num3) {
        int otvet = (num1 + 1) / 2 + (num2 + 1) / 2 + (num3 + 1) / 2;
        return otvet; //your code here
    }

    /**
     * Дано натуральное число N >= 10. Выведите результат применения XOR к последним 2-м цифрам числа N
     */
    int xorDigits(int N)
    {
        int A1 = (N % 100) / 10;
        int A2 = N % 10;

        int N1 = A1 ^ A2;
        return N1; //your code here
        //int A1 = N % 10;
        //int A2 = (N % 100) / 10;
        //int N1 = N ^ A1 ^ A2;
        //return N1;
    }

}
