package com.example;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) {
        Konto instanzTestKonto = new Konto("hallo","Test", 3, 300);
        Konto instanzTestKonto1 = new Konto("hi","Test1", 4, 400);

        Scanner scan = new Scanner(System.in);

        String kontoinhaber = scan.nextLine();
        String namekonto = scan.nextLine();
        int nummerkonto = scan.nextInt();	
        Double saldo = scan.nextDouble();

        Konto instanzTestKonto2 = new Konto(kontoinhaber, namekonto, nummerkonto, saldo);

    }
}
