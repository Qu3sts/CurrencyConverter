package com.reconvince.me;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("\n" +
                "░█████╗░██╗░░░██╗██████╗░██████╗░███████╗███╗░░██╗░█████╗░██╗░░░██╗\n" +
                "██╔══██╗██║░░░██║██╔══██╗██╔══██╗██╔════╝████╗░██║██╔══██╗╚██╗░██╔╝\n" +
                "██║░░╚═╝██║░░░██║██████╔╝██████╔╝█████╗░░██╔██╗██║██║░░╚═╝░╚████╔╝░\n" +
                "██║░░██╗██║░░░██║██╔══██╗██╔══██╗██╔══╝░░██║╚████║██║░░██╗░░╚██╔╝░░\n" +
                "╚█████╔╝╚██████╔╝██║░░██║██║░░██║███████╗██║░╚███║╚█████╔╝░░░██║░░░\n" +
                "░╚════╝░░╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝╚══════╝╚═╝░░╚══╝░╚════╝░░░░╚═╝░░░\n" +
                "\n" +
                "░█████╗░░█████╗░███╗░░██╗██╗░░░██╗███████╗██████╗░████████╗███████╗██████╗░\n" +
                "██╔══██╗██╔══██╗████╗░██║██║░░░██║██╔════╝██╔══██╗╚══██╔══╝██╔════╝██╔══██╗\n" +
                "██║░░╚═╝██║░░██║██╔██╗██║╚██╗░██╔╝█████╗░░██████╔╝░░░██║░░░█████╗░░██████╔╝\n" +
                "██║░░██╗██║░░██║██║╚████║░╚████╔╝░██╔══╝░░██╔══██╗░░░██║░░░██╔══╝░░██╔══██╗\n" +
                "╚█████╔╝╚█████╔╝██║░╚███║░░╚██╔╝░░███████╗██║░░██║░░░██║░░░███████╗██║░░██║\n" +
                "░╚════╝░░╚════╝░╚═╝░░╚══╝░░░╚═╝░░░╚══════╝╚═╝░░╚═╝░░░╚═╝░░░╚══════╝╚═╝░░╚═╝");
        start();






    }

    public static void start(){
        System.out.println();
        String[] table = {"USD: ", "Euro: ", "Yen: ", "BP (British Pound): "};
        String[] table1 = {"1.00", "1.18", "0.0091", "1.37"};
        System.out.println("\n" +  "      USD" + "\n" + table[0] + table1[0] + "\n" + table[1] + table1[1] + "\n" + table[2] + table1[2] + "\n" + table[3] + table1[3] + "\n");
        String[] currency1 = {"USD", "EURO"};
        String[] currency2 = {"USD", "EURO"};
        System.out.println("What currency would you like to convert?");
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        if (first.equalsIgnoreCase(currency1[0])){
            usdConver();
        } else if (first.equalsIgnoreCase(currency1[1])) {
            euroConver();
        }
    }




    public static void usdConver(){
        System.out.println("How much USD are you wanting to convert?");
        Scanner scanner = new Scanner(System.in);
        double usd = scanner.nextDouble();
        double euro = 0.84;
        double euro1 = usd * euro;
        System.out.println("\n" + usd + " is " + euro1 + " Euros.");



    }

    public static void euroConver(){
    System.out.println("How many Euros do you want to convert?");
    Scanner scanner = new Scanner(System.in);
    double euro = scanner.nextDouble();
    double usd = 0.84;
    double usd1 = euro * usd;
    System.out.println("\n" + euro + " is " + usd1 + " USD.");
    }
    




}
