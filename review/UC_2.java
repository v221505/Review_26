package com.Snake;
import java.util.Random;
public class UC_2 {
    public static void main(String[] args){
        int pos =0;
        System.out.println("Single player at start position"+ pos);
        RollDice();
    }
    public static void RollDice(){

        Random r=new Random();
        int dice =r.nextInt(6);
        dice=dice+1;
        System.out.println("Dice Num:"+dice);
    }

}
