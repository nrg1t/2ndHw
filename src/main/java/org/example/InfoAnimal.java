package org.example;

public class InfoAnimal {
    public void animalArray(int[] ages){
        System.out.println("ცხოველების ასაკი:");
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i] + " წლის");
        }
    }

    public void animalArray(String[] names){
        System.out.println("ცხოველების სახელები:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
