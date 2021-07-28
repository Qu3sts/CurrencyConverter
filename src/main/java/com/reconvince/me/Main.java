package com.reconvince.me;

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
        String[] currency1 = {"USD", "EURO", "YEN", "BP"};
        String[] currency2 = {"USD", "EURO", "YEN"};
        System.out.println("What currency would you like to convert?");
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        if (first.equalsIgnoreCase(currency1[0])){
            usdConver();
        } else if (first.equalsIgnoreCase(currency1[1])) {
            euroConver();
        } else if (first.equalsIgnoreCase(currency1[2])) {
            yenConver();
        } else if (first.equalsIgnoreCase(currency1[3])) {
            bpConver();
        }
    }




    public static void usdConver(){
        System.out.println("What currency are you wanting to convert USD into?");
        Scanner scanner1 = new Scanner(System.in);
        String currency = scanner1.nextLine();
        String[] currencies = {"USD", "Euros", "Euro", "Yen","BP", "British Pound"};
        if (currency.equalsIgnoreCase(currencies[0])) {
            System.out.println("I think you messed up. Restarting...");
            start();
        } else if (currency.equalsIgnoreCase(currencies[1])){
            System.out.println("How much USD are you wanting to convert?");
            Scanner scanner = new Scanner(System.in);
            double usd = scanner.nextDouble();
            double euro = 1.18;
            double euro1 = usd * euro;
            System.out.println("\n" + usd + " USD is " + euro1 + " Euros.");
        } else if (currency.equalsIgnoreCase(currencies[2])) {
            System.out.println("How much USD are you wanting to convert?");
            Scanner scanner = new Scanner(System.in);
            double usd = scanner.nextDouble();
            double euro = 1.18;
            double euro1 = usd * euro;
            System.out.println("\n" + usd + " USD is " + euro1 + " Euros.");
        } else if (currency.equalsIgnoreCase(currencies[3])) {
            System.out.println("How much USD are you wanting to convert?");
            Scanner scanner = new Scanner(System.in);
            double usd = scanner.nextDouble();
            double yen = 110.55;
            double yen1 = usd * yen;
            System.out.println("\n" + usd + " USD is " + yen1 + " Yen.");
        } else if (currency.equalsIgnoreCase(currencies[4])) {
            System.out.println("How much USD are you wanting to convert?");
            Scanner scanner = new Scanner(System.in);
            double usd = scanner.nextDouble();
            double euro = 1.37;
            double euro1 = usd * euro;
            System.out.println("\n" + usd + " USD is " + euro1 + " BP.");
        } else if (currency.equalsIgnoreCase(currencies[5])) {
            System.out.println("How much USD are you wanting to convert?");
            Scanner scanner = new Scanner(System.in);
            double usd = scanner.nextDouble();
            double euro = 1.37;
            double euro1 = usd * euro;
            System.out.println("\n" + usd + " USD is " + euro1 + " British Pounds.");
        }
    }

    public static void euroConver(){
        System.out.println("What currency are you wanting to convert Euros into?");
        Scanner scanner1 = new Scanner(System.in);
        String currency = scanner1.nextLine();
        String[] currencies = {"USD", "Euros", "Euro", "Yen","BP", "British Pound"};
        if (currency.equalsIgnoreCase(currencies[1])) {
            System.out.println("I think you messed up. Restarting...");
            start();
        } else if (currency.equalsIgnoreCase(currencies[0])){
            System.out.println("How many Euros are you wanting to convert?");
            Scanner scanner = new Scanner(System.in);
            double usd = scanner.nextDouble();
            double euro = 0.84;
            double euro1 = usd * euro;
            System.out.println("\n" + usd + " Euros, is " + euro1 + " USD");
        } else if (currency.equalsIgnoreCase(currencies[2])) {
            System.out.println("I think you might of messed up. Restarting...");
            start();
        } else if (currency.equalsIgnoreCase(currencies[3])) {
            System.out.println("How many Euros are you wanting to convert?");
            Scanner scanner = new Scanner(System.in);
            double usd = scanner.nextDouble();
            double yen = 152;
            double yen1 = usd * yen;
            System.out.println("\n" + usd + " Euros, is " + yen1 + " Yen.");
        } else if (currency.equalsIgnoreCase(currencies[4])) {
            System.out.println("How many Euros are you wanting to convert?");
            Scanner scanner = new Scanner(System.in);
            double usd = scanner.nextDouble();
            double euro = 1.37;
            double euro1 = usd * euro;
            System.out.println("\n" + usd + " Euros, is " + euro1 + " BP.");
        } else if (currency.equalsIgnoreCase(currencies[5])) {
            System.out.println("How many Euros are you wanting to convert?");
            Scanner scanner = new Scanner(System.in);
            double usd = scanner.nextDouble();
            double euro = 1.37;
            double euro1 = usd * euro;
            System.out.println("\n" + usd + " Euros, is " + euro1 + " British Pounds.");
        }

    }

    public static void yenConver() {
        System.out.println("What currency are you wanting to convert Yen into?");
        Scanner scanner1 = new Scanner(System.in);
        String currency = scanner1.nextLine();
        String[] currencies = {"USD", "Euros", "Euro", "Yen","BP", "British Pound"};
        if (currency.equalsIgnoreCase(currencies[1])) {
            System.out.println("I think you messed up. Restarting...");
            start();
        } else if (currency.equalsIgnoreCase(currencies[0])){
            System.out.println("How much Yen are you wanting to convert?");
            Scanner scanner = new Scanner(System.in);
            double usd = scanner.nextDouble();
            double euro = 110.55;
            double euro1 = usd * euro;
            System.out.println("\n" + usd + " Yen, is " + euro1 + " USD.");
        } else if (currency.equalsIgnoreCase(currencies[2])) {

            System.out.println("How much Yen are you wanting to convert?");
            Scanner scanner = new Scanner(System.in);
            double usd = scanner.nextDouble();
            double euro = 129.83;
            double euro1 = usd * euro;
            System.out.println("\n" + usd + " Yen, is " + euro1 + " Euros.");

        } else if (currency.equalsIgnoreCase(currencies[3])) {
            System.out.println("I think you messed up. Restarting...");
            start();
        } else if (currency.equalsIgnoreCase(currencies[4])) {
            System.out.println("How much Yen are you wanting to convert?");
            Scanner scanner = new Scanner(System.in);
            double usd = scanner.nextDouble();
            double euro = 152.46;
            double euro1 = usd * euro;
            System.out.println("\n" + usd + "Yen, is " + euro1 + " BP.");
        } else if (currency.equalsIgnoreCase(currencies[5])) {
            System.out.println("How much Yen are you wanting to convert?");
            Scanner scanner = new Scanner(System.in);
            double usd = scanner.nextDouble();
            double euro = 152.46;
            double euro1 = usd * euro;
            System.out.println("\n" + usd + " Yen, is " + euro1 + " British Pounds.");
        }

    }

    public static void bpConver() {

        System.out.println("What currency are you wanting to convert British Pounds into?");
        Scanner scanner1 = new Scanner(System.in);
        String currency = scanner1.nextLine();
        String[] currencies = {"USD", "Euros", "Euro", "Yen","BP", "British Pound"};
        if (currency.equalsIgnoreCase(currencies[1])) {
            System.out.println("How many British are you wanting to convert?");
            Scanner scanner = new Scanner(System.in);
            double usd = scanner.nextDouble();
            double euro = 1.17;
            double euro1 = usd * euro;
            System.out.println("\n" + usd + " British Pounds, is " + euro1 + " Euros.");
        } else if (currency.equalsIgnoreCase(currencies[0])){
            System.out.println("How many British Pounds are you wanting to convert?");
            Scanner scanner = new Scanner(System.in);
            double usd = scanner.nextDouble();
            double euro = 1.39;
            double euro1 = usd * euro;
            System.out.println("\n" + usd + " British Pounds, is " + euro1 + " USD.");
        } else if (currency.equalsIgnoreCase(currencies[2])) {

            System.out.println("How many British are you wanting to convert?");
            Scanner scanner = new Scanner(System.in);
            double usd = scanner.nextDouble();
            double euro = 1.17;
            double euro1 = usd * euro;
            System.out.println("\n" + usd + " British Pounds, is " + euro1 + " Euros.");

        } else if (currency.equalsIgnoreCase(currencies[3])) {
            System.out.println("How many British are you wanting to convert?");
            Scanner scanner = new Scanner(System.in);
            double usd = scanner.nextDouble();
            double euro = 152.49;
            double euro1 = usd * euro;
            System.out.println("\n" + usd + " British Pounds, is " + euro1 + " Yen.");
        } else if (currency.equalsIgnoreCase(currencies[4])) {

            System.out.println("I think you messed up... Restarting.");
            start();
        } else if (currency.equalsIgnoreCase(currencies[5])) {

            System.out.println("I think you messed up... Restarting.");
            start();
        }


    }





}
