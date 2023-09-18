#   Konto-01
Beim Auaftrag Konto-01 gab es 5 Schritte, die man machen musste.

# Schritt 1
Der erste Schritt:


***Erstellen Sie ein neues Java-Projekt Konto01. Erstellen Sie darin eine Klasse App, mit integriertem main() (oder übernehmen Sie einfach die App-Klasse aus dem Maven-Projekt). Erzeugen Sie bitte eine neue Klasse Konto mit den Attributen:
private String kontoInhaber;
public String nameKonto; //Öffentliche Variable
public int nummerKonto;
public double saldoKonto;***

Das macht man wie folgt:

```
public class Konto {
    private String kontoInhaber;
    public String nameKonto;
    public int nummerKonto;
    public double saldoKonto;
}

```

# Schritt 2
Der Auftrag vom 2. Schritt ist:

***Erstellen Sie einen Konstruktor für unsere Klasse Konto.***

Der Code dafür ist:

```
    public Konto(String kontoInhaber,String nameKonto, int nummerKonto, double saldoKonto) {
        this.kontoInhaber = kontoInhaber;
        this.nameKonto = nameKonto;
        this.nummerKonto = nummerKonto;
        this.saldoKonto = saldoKonto;
    }
```

# Schritt 3
Beim dritten Schritt ist das der Auftrag:

***Erstellen Sie im main() zwei neue Instanzen vom Typ Konto, mit den Namen instanzTestKonto und instanzTestKonto1.***

Und das macht man so:

```
Konto instanzTestKonto = new Konto("hallo","Test", 3, 300);
Konto instanzTestKonto1 = new Konto("hi","Test1", 4, 400);
```

# Schritt 4
Der Schritt 4 war nur ein Test und der lautet so:

***Testing: Versuchen Sie auf die Attribute von instanzTestKonto1 zuzugreifen (über instanzTestKonto1.ATTRIBUTNAME). Versuchen Sie dabei die Werte der Attribute zu verändern/setzen.***

# Schritt 5
Der letzte Schritt lautet wie folgt:

***Setzen Sie alle Attribute von Konto auf private und programmieren Sie die Get- und Set-Methoden dazu. Nutzen Sie dabei die folgende Nomenklatur setAttributName und getAttributName.***

Das macht man wie folgt:
```public class Konto {
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