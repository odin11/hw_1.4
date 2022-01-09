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

        int firstFriday = 6;
        int j =1;
        while (j<=31){
            if (j == firstFriday) {
                for (;j<=31;j = j + 7) {
                    System.out.println("Сегодня пятница, "+ j + "-е число. Необходимо подготовить отчет.");
                }
            } else {
                j = j+1;
            }

        }

    //task3

        int currentYear = 2022;
        int y = 0;
        int start = currentYear - 200;
        int end = currentYear + 100;
        //while ((y >= start) && (y <= end)){
        while (y < end){
            y = y + 79;
            if ((y >= start)&&(y<=end)){
                System.out.println(y);
            }
        }
    }
}
