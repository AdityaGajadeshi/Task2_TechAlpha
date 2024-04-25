//java program for array rotation
import java.util.Scanner;
public class TechAlpha_Task2 {
    public static void main(String[] args) {
    int [] a1={1,2,3,4,5,6};
    for (int len:a1){
        System.out.print(len);
    }
    Scanner sc=new Scanner(System.in);
        System.out.println("\nENTER NUMBER YOU WANT TO ROTATE");
        int a= sc.nextInt();
        for (int i=0;i<a;i++)
        {
        int New=a1[0];
        for (int j=0;j< a1.length-1;j++)
        {
            a1[j]=a1[j+1];
        }
        a1[a1.length-1]=New;
        }
        System.out.println("\nAFTER ROTATION");
        for (int i=0;i<a1.length;i++)
        {
            System.out.print(" "+a1[i]);
        }
    }
}