//package com.Snake;
import java.util.Random;

public class UC_3 {

    public static void main(String[] args){
        int pos =0;
        int dice=0;
        System.out.println("Single player at start position"+ pos);
        dice = rollDice();
        map(dice, pos);
    }
    public static int rollDice(){

        Random r=new Random();
        int dice =r.nextInt(6);
        dice=dice+1;
        System.out.println("Dice Num:"+dice);
        return dice;
    }
    public static void map(int dice, int pos){
        Random r=new Random();
        int map=r.nextInt(2);
        map= map+1;
        System.out.println("Maping Method:"+map);

        switch (map){
            case 1:
                System.out.println("no play you stay in same position");
                break;
            case 2:
                pos =pos+dice;
                System.out.println("player move after recived in the die:" +pos);
                break;
            case 3:
                    pos= pos-dice;
                System.out.println("position after snake:" +pos);
                break;

        }

    }

}
