/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daysinmonth;

import java.util.Scanner;

/**
 *
 * @author geneivaocampo
 */
public class DaysInMonth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year = input.nextInt();
        for (int month = 1; month<12 ; month ++)
        {
        switch(month)
        {
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
                System.out.println("30 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                System.out.println("31 days");
                break;
            case 2:
                if (year % 4==0){
                    System.out.println("28 days");
                }
                else
                {
                    System.out.println("29 days because it is a leap year ");
                }
                break;
        }
        System.out.printf("Number of day in each month for this year are %s\n" + month);
        }
        
    }
    
}
