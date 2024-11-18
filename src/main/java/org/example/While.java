package org.example;

public class While {
    public String str;
    public While(String str){
        this.str = str;
    }
    public void strCounter(){
        int i=0;
        while (i<this.str.length()){
            System.out.println(this.str.charAt(i));
            if (this.str.charAt(i) == 'z'){
                break;
            }
            i += 3;
        }
    }
}
