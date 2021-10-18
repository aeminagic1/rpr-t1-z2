package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
    public static int sumaCifara(int n){
        int suma=0;
        int temp=n;
        while (temp!=0){
            suma=suma+temp%10;
            temp=temp/10;
        }
        return suma;

    }

    public static void main(String[] args) {
        Scanner ulaz= new Scanner(System.in);
        System.out.println("Unesite n: ");
        int temp = ulaz.nextInt();
        for(int i=1; i<=temp;i++){
                if(i%sumaCifara(i)==0)
                    System.out.println(i + " ");
        }
    }
}
