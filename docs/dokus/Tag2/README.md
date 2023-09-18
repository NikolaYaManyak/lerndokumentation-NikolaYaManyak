#   Dreieck/Viereck
Der erste Auftrag war es die folgende SItuation in Java nachzubilden:


***Ein Dreieck besteht aus 3 Punkten (ein Punkt besteht aus einer X-, und Y-Koordinate). Ein Viereck
besteht aus 4 Punkten. Erstellen Sie jeweils die Klassen und Getter- und Setter. Erstellen Sie
ebenfalls für jede Klasse einen Konstruktor, bei welchem Sie !alle! relevanten Parameter übergeben
können***

# Punkt

Als erstes fing ich mit der Punkt-Klasse an, da das Dreieck und Viereck auf sie aufbauen. Der Code für diese sieht wie folgt aus:

```
package com.example;

class Punkt {
    private double x;
    private double y;
    
    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    public double getY() {
        return y;
    }
    
    public void setY(double y) {
        this.y = y;
    }
}
```
In dieser Klasse initialisiert man als erstes zwei private Double, eine namens "x" und die andere namens "y". Danach macht man die eigentliche Funktion namens Punkt, 
die die beiden Variablen deklariert. Die Variabel, die "this." davor hat, ist die private die man vorher initialisiert hat. Die ohne dem "this."
ist die, die man zu der Funktion übergibt. Danach macht man doch die getter und setter für die "this." Variablen, um diese über das main übergeben zu können.

> [!TIP]
>Für die getter und setter Funktionen, gibt es eine Extention, die diese dann für dich schreibt. Man muss nur die richtigen Variablen markieren.

# Dreieck

Der Code für das Dreieck sieht wie folgt aus:

```
package com.example;

class Dreieck {
    private Punkt punkt1;
    private Punkt punkt2;
    private Punkt punkt3;
    
    public Dreieck(Punkt punkt1, Punkt punkt2, Punkt punkt3) {
        this.punkt1 = punkt1;
        this.punkt2 = punkt2;
        this.punkt3 = punkt3;
    }
    
    public Punkt getPunkt1() {
        return punkt1;
    }
    
    public void setPunkt1(Punkt punkt1) {
        this.punkt1 = punkt1;
    }
    
    public Punkt getPunkt2() {
        return punkt2;
    }
    
    public void setPunkt2(Punkt punkt2) {
        this.punkt2 = punkt2;
    }
    
    public Punkt getPunkt3() {
        return punkt3;
    }
    
    public void setPunkt3(Punkt punkt3) {
        this.punkt3 = punkt3;
    }
}
```

Wie bei der Punkt-Klasse initialisiert man erst die benötigten Variablen. In diesem Fall sind es nicht mehr Doubles, sondern Punkte. Jedoch hat jeder Punkt
dennoch eine x und eine y-Koordinate. Die Werte dieser Punkte werden beim aufrufen der Klasse übergeben und wieder mit der getter und setter Methode initialisiert.
Die Dreieck Funktion macht das selbe wie die Punkt-Funktion. Wie beim Punkt ist die Variabel mit dem "this." ist immer noch die, die auf private gestellt ist und die andere ist die, die der Funktion übergeben wird.

# Viereck

Das ist der Code des Vierecks:

``` 
package com.example;

class Viereck {
    private Punkt punkt1;
    private Punkt punkt2;
    private Punkt punkt3;
    private Punkt punkt4;
    
    public Viereck(Punkt punkt1, Punkt punkt2, Punkt punkt3, Punkt punkt4) {
        this.punkt1 = punkt1;
        this.punkt2 = punkt2;
        this.punkt3 = punkt3;
        this.punkt4 = punkt4;
    }
    
    public Punkt getPunkt1() {
        return punkt1;
    }
    
    public void setPunkt1(Punkt punkt1) {
        this.punkt1 = punkt1;
    }
    
    public Punkt getPunkt2() {
        return punkt2;
    }
    
    public void setPunkt2(Punkt punkt2) {
        this.punkt2 = punkt2;
    }
    
    public Punkt getPunkt3() {
        return punkt3;
    }
    
    public void setPunkt3(Punkt punkt3) {
        this.punkt3 = punkt3;
    }
    
    public Punkt getPunkt4() {
        return punkt4;
    }
    
    public void setPunkt4(Punkt punkt4) {
        this.punkt4 = punkt4;
    }
}
```
Dieser macht das gleiche wie die Klasse Dreieck, jedoch mit Vier anstatt Drei Punkte.

# Main
Für das Main schreibt man diesen Code:

``` 
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
```

Als erstes macht man die Vier Punkte. Danach schaut man, das der Punkt nicht grösser Als 100 ist. Das macht man mit der If-Anweisung. Falls es grösser als 100 ist, muss es ungültige Auswahl Ausgeben und das Programm mit "System.exit(0);" beenden. Danach erstellt man ein Dreieck und ein Viereck mit den eben initialisierten Punkten. Danach macht man noch optional noch Ausgaben der Koordinaten


# Klassendiagramm
Hier ist das Klassendiagramm des Auftrags, jedoch fehlen hier noch die ganzen getter und setter.
![Klassendiagramm](/klassendiagramm.png)