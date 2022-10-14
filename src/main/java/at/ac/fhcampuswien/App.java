package at.ac.fhcampuswien;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        // input your solution here
      //  System.out.print("Number 1: ");

        Scanner kb= new Scanner(System.in);
        int i=1;
        double any=0; double max=0;

        while(true) {
            System.out.print("Number " + i++ + ": ");
            any=kb.nextDouble();
            if(any<=0) {
                if (i <3) {
                    System.out.println("No number entered.");
                    return;
                } else {
                    break;
                }
            }
            //System.out.print("\033[H\033[2J");
            //System.out.flush();

            //Number 1: Number 2: Number 3: The largest number is 5.00
            //Number 1: Number 2: Number 3: The largest number is 5.00
            //Number 1: Number 2: Number 3: The largest number is 5.00

            //for (i = 1; i < d.length; i++)
            if (any > max) {
                max = any;
            }

        }
        System.out.printf("The largest number is %.2f",  max);
        System.out.println();




    }

    //todo Task 2
    public void stairs() {
        // input your solution here
        Scanner kb = new Scanner(System.in);
        System.out.print("n: ");
        int gz = kb.nextInt();
        int aus = 1;
        if (gz <= 0) {
            System.out.println("Invalid number!");
            return;
        }
        for (int f = 1; f <= gz; f++) {
            for (int n = 1; n < f; n++) {
                System.out.print(aus++ + " ");

            }
            //if (n = f) {
                System.out.println(aus++ + " ");

            //}
        }
    }

    //todo Task 3
    public void printPyramid() {
        // input your solution here

        int Konstante=6;

        for (int f = 1; f <= Konstante; f++) {

            for (int n = 1; n <= (Konstante-f); n++) {
                System.out.print(" ");

            }

            for (int n = 1; n < (f*2-1);n++) {
                System.out.print("*");

            }

            System.out.println("*");
        }





    }

    //todo Task 4
    public void printRhombus() {
        // input your solution here
Scanner kb=new Scanner(System.in);
        System.out.print("h: ");
        int h = kb.nextInt();
        System.out.print("c: ");
        if(h%2==0){
            h=h-1;
            System.out.println("Invalid number!");
            return;}
        h=(h-1)/2+1;



        String s= kb.next();
        char c=s.charAt(0);
        
        int as=c;

        // Creating a new variable of type int
        // and assigning the character value.

        for (int f = 1; f <= h; f++) {

            for (int n = 1; n <= (h - f); n++) {
                System.out.print(" ");
            }



            for (int n = 1; n < (f); n++) {

                System.out.print((char)(as -f+ n));

            }

            System.out.print((char)as);


            for (int n = 1; n < (f); n++) {

                System.out.print((char)(as -n));

            }



            System.out.println((char)(f * 2 - 1));

        }

        for (int f = h-1; f >0; f--) {

            for (int n = 1; n <=h-f; n++) {
                System.out.print(" ");
            }



            for (int n = 1; n < (f); n++) {

                System.out.print((char)(as -f+ n));

            }

            System.out.print((char)as);


            for (int n = 1; n < (f); n++) {

                System.out.print((char)(as -n));

            }



            System.out.print((char)(f * 2 - 1));
            System.out.println(" ");
//Versuche
        }






    }

    //todo Task 5
    public void marks(){
        // input your solution here

        Scanner kb=new Scanner(System.in);
        int i=1;
        int m;
       // List<int> schnitt= new ArrayList<int>();
        int n=0;
        int summarum=0;
        do {
            System.out.print("Mark "+i+": ");
        m= kb.nextInt();
         //   System.out.println(m);
            if(m>0 && m<6){
               // schnitt<i>=m;
                summarum=summarum+m;

                i++;
            }
            if(m==5){
                n++;
            }
        if(m>5){
            System.out.println("Invalid mark!");
        }
        }while(m>0);
        float f=(float) summarum/i;
        System.out.printf("Average: %.2f", f);
        System.out.println();
        System.out.println("Negative marks: "+n);



    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();
/*
        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();



        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();
        */


        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();
/*
        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();

 */
    }
}