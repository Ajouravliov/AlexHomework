package Flower;

public class Human {

    public void takeWateringCan (WateringCan wateringCan){

        wateringCan.setTaked(true);

    }

    public void wateringFlower (Flower flower, WateringCan wateringCan){
        if (wateringCan.getTaked()) {
            flower.setWatered(true);
            System.out.println("The flower is watered !");

        }else {
            System.out.println("Take watering can before !");
        }
    }

}
