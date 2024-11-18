package org.example;

public class Main {
    public static void main(String[] args) {
        // Task #1
        int [] array = {4,5,8,10,11,12,13,15,17,18,20,21,24,27,30};
        int count=0;
        for (int i=0; i < array.length; i++){
            if (array[i]%2 == 0){
                count++;
            }
        }
        if (count > 0){
            System.out.println("ამ მასივში არის " + count + " ლუწი რიცხვი");
        }
        else {
            System.out.println("მასივში არ არის ლუწი რიცხვი");
        }

        // Task #2
        While obj = new While("qjkfsdjdrzawr");
        obj.strCounter();

        // Task #3
        Length obj1 = new Length("sdghfskskjdfhsjda");
        obj1.evenOrOdd();

        // Task #4 --> Method call
        checkNumber(5);

        // Task #5 --> Method call
        hasTeen(12, 20, 30);
    }
    // Task #4
    static void checkNumber(int x){
        if (x > 0){
            System.out.println("დადებითი");
        }else if (x < 0){
            System.out.println("უარყოფითი");
        }else {
            System.out.println("ნოლი");
        }
    }

    // Task #5
    static void hasTeen(int x, int y, int z){
        if ((x >= 13 && x <= 19) || (y >= 13 && y <= 19) || (z >= 13 && z <= 19)){
            System.out.println(true);
        } else if ((x < 13 || x > 19) && (y < 13 || y > 19) && (z < 13 || z > 19)) {
            System.out.println(false);
        }
    }
}