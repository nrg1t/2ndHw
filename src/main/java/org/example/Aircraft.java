package org.example;

public class Aircraft implements Engine, Nav, Autopilot{
    String model;
    public Aircraft(String model){
        this.model = model;
    }

    @Override
    public void startEngine() {
        System.out.println("ძრავები ჩართულია, მზად ვართ ასაფრენად");
    }

    @Override
    public void radarContact() {
        System.out.println("მეთვალყურესთან კავშირი დამყარებულია");
    }

    @Override
    public void startAutoPil() {
        System.out.println("ავტოპილოტი ჩაირთო");
    }
}
