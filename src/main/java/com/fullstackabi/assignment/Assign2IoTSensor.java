package com.fullstackabi.assignment;//        Concepts: Primitive types, bitwise operators, logical operators, wrapper methods
//        A smart sensor sends 8-bit integers. Each bit has a signal. Use bitwise & logical operators to extract
//        values and take actions (e.g., motion + light off = turn on light). Use wrapper methods like
//        Integer.toBinaryString(). Output human-readable statuses and alerts.

import java.util.Scanner;

public class Assign2IoTSensor {
    public static void main(String[] args) {

        System.out.println("IoT Sensor Normalization");

        int light = 1;
        int motion = 2;
        int temperature = 3;
        int sound = 4;
        int gas = 5;

        System.out.println("Enter the Sensor Signal number ranging from 1 to 5 only");
        Scanner scan =  new Scanner(System.in);
        int signal = scan.nextInt();

        // Masking the action for the signal
        Integer lightSignal = signal & light;
        Integer motionSignal = signal &  motion;
        Integer temperatureSignal = signal & temperature;
        Integer soundSignal = signal & sound;
        Integer gasSignal = signal & gas;

        // Action taken for each sensors

//        if( motion && lightSignal) {
//
//        }

        System.out.println("Signal Entered by the user in bit format:" +Integer.toBinaryString(signal));
        System.out.println("Light on: " +motionWithLightOn);
        System.out.println("Temp on: " +lightWithTempOn);
        // Using Bitwise operators and Logical Operators to dete
        // ct the actions.

//        int motionWithLightOn = motion >> 1 ;
//        int lightWithTempOn = temperature >> 1;
//        int motionWithGasOn = gas >> 2;
//        int gasWithSoundOn = sound >> 2;
//        int gasWithTempOn = temperature >> 1;
//
//        System.out.println(motionWithLightOn);
//        System.out.println(lightWithTempOn);
//        System.out.println(motionWithGasOn);
//        System.out.println(gasWithSoundOn);
//        System.out.println(gasWithTempOn);

            }
}
