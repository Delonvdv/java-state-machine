package com.company;

public class Main{

    public static void main(String[] args) {
        FanController con = new FanController();
        con.getCurrentDirection();
        con.getCurrentSpeed();
        P("Current Direction and Speed: " + con.toString());
        P("Start fan\n");
        int i = 1;
        while(i <= 4){
            con.changeFanSpeed();
            P(con.toString());
            i++;
        }
        P("\nChange fan direction");
        con.changeDirection();
        con.getCurrentDirection();
        P("Current Direction and Speed: " + con.toString());
        P("Start fan\n");
        while(i <= 8){
            con.changeFanSpeed();
            P(con.toString());
            i++;
        }
    }

    public static void P(String msg){
        System.out.println(msg);
    }

}
