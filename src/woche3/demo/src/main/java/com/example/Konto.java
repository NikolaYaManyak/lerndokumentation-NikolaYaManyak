package com.example;

public class Konto {
    private String kontoInhaber;
    private String nameKonto;
    private int nummerKonto;
    private double saldoKonto;

    public String getKontoInhaber() {
        return this.kontoInhaber;
    }

    public void setKontoInhaber(String kontoInhaber) {
        this.kontoInhaber = kontoInhaber;
    }

    public String getNameKonto() {
        return this.nameKonto;
    }

    public void setNameKonto(String nameKonto) {
        this.nameKonto = nameKonto;
    }

    public int getNummerKonto() {
        return this.nummerKonto;
    }

    public void setNummerKonto(int nummerKonto) {
        this.nummerKonto = nummerKonto;
    }

    public double getSaldoKonto() {
        return this.saldoKonto;
    }

    public void setSaldoKonto(double saldoKonto) {
        this.saldoKonto = saldoKonto;
    }



    public Konto(String kontoInhaber,String nameKonto, int nummerKonto, double saldoKonto) {
        this.kontoInhaber = kontoInhaber;
        this.nameKonto = nameKonto;
        this.nummerKonto = nummerKonto;
        this.saldoKonto = saldoKonto;
    }
}
