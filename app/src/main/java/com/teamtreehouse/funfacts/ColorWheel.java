package com.teamtreehouse.funfacts;

import android.graphics.Color;

import java.util.Random;

public class ColorWheel {

    public String[] colors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7", // light gray
            //"ddca8b"  //gold
    };

    public int getColor(){

        //create a random number to show a color from the colors array
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(colors.length);

        return Color.parseColor(colors[randomNumber]);
    }

}//end of class ColorWheel
