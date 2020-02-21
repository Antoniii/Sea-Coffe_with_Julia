/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 123
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N = 1000000000;
        double numerator = 4.0;
        double denominator = 1.0;
        double operation = 1.0;
        double pi = 0.0;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++){
            pi += operation * (numerator / denominator);
            denominator += 2.0;
            operation *= -1.0;
        }
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("Pi = " + pi);// TODO code application logic here
        System.out.println("Программа выполнялась " + timeSpent + " миллисекунд");
    }
    
}
