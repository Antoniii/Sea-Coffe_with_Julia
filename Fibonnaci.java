/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonnaci;

/**
 *
 * @author 123
 */
public class Fibonnaci {
    
    public static int fibonnaci(int n){  //функция с параметрами
        int t1 = 0, t2 = 1, nextTerm = 0;  //создаём переменную, в которую будем помещать расчётное значение
        for(int i = 1; i <= n; i++){  //цикл для возведения в степень
            if (i == 1){
            nextTerm = t1;
            continue;
        }
        if (i == 2){
            nextTerm = t2;
            continue;
        }
        nextTerm = t1 + t2;
        t1 = t2;
        t2 = nextTerm;  //умножаем новое значение со старым и тем самым возводим в степень
        }
        return nextTerm;  //возвращаем посчитанное значение
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       long start = System.nanoTime();
       int result = fibonnaci(49);  //вызываем функцию передав два аргумента (возводим десять во вторую степень)
       long end = System.nanoTime();
       long microseconds = (end - start) / 1000;
       System.out.println(result);  //вывод значения переменной // TODO code application logic here
       System.out.println("Программа выполнялась " + microseconds + " микросекунд");
    }
    
}
