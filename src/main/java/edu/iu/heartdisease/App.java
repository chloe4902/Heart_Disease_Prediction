
package edu.iu.heartdisease;

import weka.core.Version;

public class App {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("Heart Disease Prediction Project");
        System.out.println("=================================");

        System.out.println("Java version: "
                + System.getProperty("java.version"));

        System.out.println("Weka version: "
                + Version.VERSION);

        System.out.println("Weka dependency loaded successfully!");
    }
}
