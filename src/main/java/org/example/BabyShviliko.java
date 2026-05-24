package org.example;

public class BabyShviliko extends Mom{
    public String tvalisFeri;
    String tmisFeri;
    private int kocna;

    public void setKocna(int kocna){
        this.kocna = kocna;
        if (kocna<10){
            System.out.println(kocna + " ცოტაა და უფრო მეტი კოცნაა საჭირო");
        }
    }

    @Override
    public void shviliko() {
        System.out.println("ბავშვის თვალის ფერი: " + tvalisFeri + ", ბავშვის თმის ფერი: " + tmisFeri + ", ბავშვი ჩავკოცნოთ ამდენჯერ: " + kocna);
    }
}
