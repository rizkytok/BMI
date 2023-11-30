/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bmi.bmiproject;
import java.util.Scanner;
/**
 *
 * @author Rizkyaja
 */
public class BMI {
 
    public static void main(String[] args) throws Exception {
        BMI();
    }
    private static void BMI() throws Exception {
        System.out.print("MASUKAN BERAT BADAN ANDA : ");
        Scanner s = new Scanner(System.in);
        float berat = s.nextFloat();
        System.out.print("MASUKAN TINGGI BADAN ANDA : ");
        float tinggi = s.nextFloat();
        float bmi = (100*100*berat)/(tinggi*tinggi);
        System.out.println("Hasil: "+bmi);
        bmi(bmi);
    }
    private static void bmi(float bmi) {
        if(bmi < 18.5) {
            System.out.println("BERAT BADAN ANDA KURANG");
        }else if (bmi < 25) {
            System.out.println("NORMAL");
        }else if (bmi < 30) {
            System.out.println("BERAT BADAN ANDA LEBIH");
        }else {
            System.out.println("OBESITAS");
        }
    }
}