package org.example;

public class Park {
    private String attractionName;
    private String attractionOpenTime;
    private String attractionCloseTime;
    private double attractionPrice;

    public Park(String attractionName, String attractionOpenTime, String attractionCloseTime, double attractionPrice){
        this.attractionName = attractionName;
        this.attractionOpenTime = attractionOpenTime;
        this.attractionCloseTime = attractionCloseTime;
        this.attractionPrice = attractionPrice;
    }
    public void printInfo() {
        System.out.println("Название: " + attractionName);
        System.out.println("Атракцион открывается в " + attractionOpenTime);
        System.out.println("Атракцион закрывается в " + attractionCloseTime);
        System.out.println("Стоимость атракциона: " + attractionPrice+" рублей.");
    }
}
