
package exercise.b4;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap so luong phan tu cua mang: ");
        n= sc.nextInt();
        int array[];
        array = new int[n];// khoi tao mang voi kinh thuoc n
        for(int i=0; i<array.length; i++){
            System.out.println("Nhap phan tu thu: ");
            System.out.println("phan tu "+ (i+1)+ ":");
            array[i] = sc.nextInt();
        }
      // khoi tao gia tri cua phan tu dau tien trong mang (array[0])
        int max = array[0];
        int min = array[0];
        int sum = 0;
        
        
        for(int i=0; i<n; i++){
            if(array[i]>max){
                max = array[i];
            }
            if(array[i]<min){
                min=array[i];
            }
            sum += array[i];
        }
        double average =(double) sum/n;
        
        System.out.println("gia tri lon nhat trong mang: "+max);
        System.out.println("gia tri nho nhat trong mang: "+min);
        System.out.println("tong cac phan tu trong mang: "+sum);
        System.out.println("gia tri trung binh cua mang: "+average);
        
        // sap xep theo thu tu tang dan
       Arrays.sort(array); 
        System.out.println("mang sau khi sap xep theo thu tu tang dan: ");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+ " ");
        }
        
        sc.close();
    }
}
