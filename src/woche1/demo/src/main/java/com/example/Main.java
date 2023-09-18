package com.example;

public class Main 
{
    public static void main(String[] args) {


        Punkt punktA = new Punkt(100.0, 2.0);
        Punkt punktB = new Punkt(3.0, 4.0);
        Punkt punktC = new Punkt(5.0, 6.0);
        Punkt punktD = new Punkt(7.0, 8.0);
        
        if (punktA.getX() > 100 || punktA.getY() > 100 || punktB.getX() > 100 || punktB.getY() > 100 || punktC.getX() > 100 || punktC.getY() > 100 || punktD.getX() > 100 || punktD.getY() > 100){
            System.out.println("Ungültige Auswahl");
            System.exit(0);
        }
        Dreieck dreieck = new Dreieck(punktA, punktB, punktC);
        Viereck viereck = new Viereck(punktA, punktB, punktC, punktD);
        
        System.out.println("Koordinaten von Punkt A: (" + punktA.getX() + ", " + punktA.getY() + ")");
        System.out.println("Koordinaten von Punkt B: (" + punktB.getX() + ", " + punktB.getY() + ")");
        System.out.println("Koordinaten von Punkt C: (" + punktC.getX() + ", " + punktC.getY() + ")");
        System.out.println("Koordinaten von Punkt D: (" + punktD.getX() + ", " + punktD.getY() + ")");
        
    }
}
