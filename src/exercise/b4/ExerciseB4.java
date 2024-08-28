
package exercise.b4;

import java.util.Random;
import java.util.Scanner;

public class ExerciseB4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        while (true) {
            int n = rand.nextInt(100) +1;
            System.out.println("nhap vao check(yes/no)");
            String check = sc.nextLine().trim().toLowerCase();
            
            if(check.equals("yes")){
                 if(n%2==0){
                System.out.println(n+ "la so chan ");
            }else {
                     System.out.println(n+ "la so le ");
                 }
            } else {
                if(n%2==0){
                    System.out.println(n+ "la so chan ");
                }else {
                    System.out.println(n+ "la so le ");
                }
                break;
            }
        }
        sc.close();  
    }
}

