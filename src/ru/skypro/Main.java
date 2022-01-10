package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here

    //task1

        int i=0;
        while   (i<=10){
            System.out.print(i + " ");
            i++;

        }
        System.out.print("\n");
        for (i=10;i>=0;i--){
            System.out.print(i+" ");
        }
        System.out.println();

    //task2

        int firstFriday = 5;
        for (int j =firstFriday;j<=31;j = j + 7) {
            System.out.println("Сегодня пятница, "+ j + "-е число. Необходимо подготовить отчет.");
        }

    //task3

        int currentYear = 2022;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for ( int y = start; y <= end; y++) {
            if (y % 79 == 0) {
                System.out.println(y);
            }
        }
    }
}
