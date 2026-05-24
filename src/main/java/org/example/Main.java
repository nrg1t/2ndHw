package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("სავარჯიშო #1");
        System.out.println("-------------");

        Student student1 = new Student();
        student1.printInfo("უშანგი", 22);
        student1.printStudentInfo("web/api automation");


        System.out.println();
        System.out.println("სავარჯიშო #2");
        System.out.println("^_^ ^_^ ^_^ ^_^ ");

        BabyAnimal babyAnimal1 = new BabyAnimal();
        babyAnimal1.makeSound();


        System.out.println();
        System.out.println("სავარჯიშო #3");
        System.out.println("++++++++++++++");

        int[] studentScores= {75, 57, 86, 25, 99, 88};
        System.out.println("სტუდენტების ქულები, რომლებიც მეტია 75-ზე:");
        for (int i=0; i<studentScores.length; i++){
            if (studentScores[i] > 75){
                System.out.println(studentScores[i]);
            }
        }


        System.out.println();
        System.out.println("სავარჯიშო #4");
        System.out.println("++++++++++++++");

        BabyShviliko babyShviliko1 = new BabyShviliko();
        babyShviliko1.gogoa();

        babyShviliko1.tvalisFeri = "მწვანე";
        babyShviliko1.tmisFeri = "ყავისფერი";
        babyShviliko1.setKocna(200);
        babyShviliko1.shviliko();


        System.out.println();
        System.out.println("სავარჯიშო #5");
        System.out.println("->->->->->->->");

        Aircraft myAircraft= new Aircraft("Boeing 777-300ER");
        myAircraft.startEngine();
        myAircraft.radarContact();
        myAircraft.startAutoPil();


        System.out.println();
        System.out.println("სავარჯიშო #6");
        System.out.println("^_^ ^_^ ^_^ ^_^ ");

        InfoAnimal infoAnimal1 = new InfoAnimal();
        int[] animalAges = {5,3,7,11,1};
        String[] animalNames = {"დობი", "მაქსი", "ჩაპი", "თედო", "ოტო"};
        infoAnimal1.animalArray(animalAges);
        infoAnimal1.animalArray(animalNames);
    }
}