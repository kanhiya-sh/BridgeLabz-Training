package Capgemini_Day17_ScenarioBased;

import java.util.*;
public class CafeteriaMenuApp {
    public static void main(String[] args) {
        String [] menu = { "Coffee", "Tea", "Sandwich", "Salad", "Juice", "Soda", "Dessert", "Soup", "Pasta", "Pizza" };
        DisplayMenu(menu);
        System.out.println("Enter your choice (1-10) or type 0 to exit : ");
        int num =1;
        int [] order=new int[10];
        while(num<11 && num>0) {
            Scanner myScan = new Scanner(System.in);
            num = myScan.nextInt();
            order  = GetItemByIndex(menu, num, order);
        }
        System.out.println("Your order summary is : ");
        for(int i = 0; i < order.length; i++){
            if(order[i] > 0){
                System.out.println(menu[i]+" : "+order[i]);
            }
        }
        System.out.println("Thank you !! Visit Again.");
    }
    public static void DisplayMenu (String [] menu){
        System.out.println("*** Cafetaria Menu ***");
        for(int i = 0; i < menu.length; i++){
            System.out.println((i + 1) + " . " + menu[i]);
        }
    }
    public static int[] GetItemByIndex (String [] menu, int index, int [] order){
        if(index > 0 && index <= menu.length){
            System.out.println("Your Selected item is : " + menu[index-1]);
            order[index-1]++;
        }
        return order;
    }
}
