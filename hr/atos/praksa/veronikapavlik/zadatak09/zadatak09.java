package hr.atos.praksa.veronikapavlik.zadatak09;

import java.util.Scanner;

public class zadatak09 {

    public static void main(String[] args) {
        int[] costOfMonth = new int[12];
        int[] month = new int[12];

        Scanner myObj = new Scanner(System.in);

        for (int i = 0; i < 12; i++) {
            System.out.println("Unesite trošak za " + (i + 1) + ". mj: ");
            costOfMonth[i] = myObj.nextInt();
        }

        for (int i = 0; i < 12; i++) {
            month[i] = intervali(costOfMonth[i]);
        }
        
        for (int novac = 5000; novac >= 0; novac -= 1000) {
            System.out.format("%9d kn - |", novac);
            char slovo ='x';
            for (int i = 0; i <12; i++) {
                if (novac == 0) {
                    System.out.print(" ");
                } else if (month[i] == intervali(novac)) {
                    System.out.format("%2s",slovo);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        System.out.println("               -- -- -- -- -- -- --");
        System.out.print("               ");
        for(int i=1;i<=12;i++) {
			System.out.format("%2d", i);
        }
    }

    public static int intervali(int value) {
        if (value >= 0 && value <= 500) {
            return 0;
        } else if (value <= 1500) {
            return 1;
        } else if (value <= 2500) {
            return 2;
        } else if (value <= 3500) {
            return 3;
        } else if (value <= 4500) {
            return 4;
        } else {
            return 5;
        }
    }
}
