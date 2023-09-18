# Main
```
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
```

# Konto
```
package com.example;

public class Konto {
    private String kontoInhaber;
    private String nameKonto;
    private int nummerKonto;
    private double saldoKonto;

    public String getAttributKontoInhaber() {
        return this.kontoInhaber;
    }

    public void setAttributKontoInhaber(String kontoInhaber) {
        this.kontoInhaber = kontoInhaber;
    }

    public String getAttributNameKonto() {
        return this.nameKonto;
    }

    public void setAttributNummerKonto(int nummerKonto) {
        this.nummerKonto = nummerKonto;
    }

    public double getAttributSaldoKonto() {
        return this.saldoKonto;
    }

    public void setAttributSaldoKonto(double saldoKonto) {
        this.saldoKonto = saldoKonto;
    }

    public Konto(String kontoInhaber,String nameKonto, int nummerKonto, double saldoKonto) {
        this.kontoInhaber = kontoInhaber;
        this.nameKonto = nameKonto;
        this.nummerKonto = nummerKonto;
        this.saldoKonto = saldoKonto;
    }
}
```