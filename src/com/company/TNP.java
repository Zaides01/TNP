package com.company;

public class TNP {
    double x;
    double y;
    //служебные методы

    public TNP(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public TNP(){
        x = 0;
        y = 0;
    }


    //вычислительные методы

    public double disBP(TNP secondp){
        double rez;
        rez = Math.sqrt((this.x - secondp.x)*(this.x - secondp.x) + (this.y - secondp.y)*(this.y - secondp.y));
        return rez;
    }

    public TNP change(TNP secondp){
        TNP rez = new TNP();
        rez.x = secondp.x;
        rez.y = secondp.y;
        return rez;
    }

    public TNP mid (TNP secondp){
        TNP rez = new TNP();
        rez.x = (this.x + secondp.x)/2;
        rez.y = (this.y + secondp.y)/2;
        return rez;
    }

    //методы поддержки
    public void print(){
        System.out.println("(" + x + ";" + y + ")");
    }

    @Override
    public String toString() {
        return "(" + x + ";" + y + ")";
    }
}
