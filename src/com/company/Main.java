package com.company;

public class Main {

    public static void main(String[] args) {
        int counter = 0;
        String[] mango= {"m", "a", "n", "g", "o"};
        for (int i = 0; i < mango.length; i++) {
            if (mango[i] == "a") {
                counter += 1;
            }if (mango[i] == "e") {
                counter += 1;
            }if (mango[i] == "i") {
                counter += 1;
            }if (mango[i] == "o") {
                counter += 1;
            }if (mango[i] == "u") {
                counter += 1;
            }
        }
        System.out.println("The number of vowels in mango: " + counter);
    }
}
