package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Light {
    public void start() {

        int[] lights = new int[3];
        String[] colors = {"красный", "желтый", "зеленый"};

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < lights.length; i++) {
                System.out.println("Введите время для цвета светофора: " + colors[i]);
                lights[i] = Integer.parseInt(reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < lights.length; i++) {
            System.out.println("Горит " + colors[i] + " свет");
            try {
                Thread.sleep(lights[i] * 1000 * 60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
