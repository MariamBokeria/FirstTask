package org.example;

public class Length {
    public String striqoni;
    public Length(String striqoni){
        this.striqoni = striqoni;
    }
    public void evenOrOdd(){
        if (this.striqoni.length()%2 == 0){
            System.out.println("სტრიქონის სიგრძე ლუწია");
        }
        else {
            System.out.println("სტრიქონის სიგრძე კენტია");
        }
    }
}
