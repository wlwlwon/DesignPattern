package com.example.demo._01_singleton;

import java.io.*;

public class serialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Settings4 settings = Settings4.getInstance();

        Settings4 settings1 = null;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings1 = (Settings4) in.readObject();
        }

        System.out.println("instance1 = "+ settings);
        System.out.println("instance2 = "+ settings1);
        System.out.println(settings == settings1);
    }
}
