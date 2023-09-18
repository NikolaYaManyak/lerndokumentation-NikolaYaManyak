# Main

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

# Punkt
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

# Dreieck

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

# Viereck

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