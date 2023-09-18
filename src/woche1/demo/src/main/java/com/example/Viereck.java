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

