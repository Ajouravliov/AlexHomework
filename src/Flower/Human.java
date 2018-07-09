package Flower;

class Human {

    void takeWateringCan(WateringCan wateringCan) {
        wateringCan.setTaken(true);
    }

    void wateringFlower(Flower flower, WateringCan wateringCan) {
        if (wateringCan.getTaken()) {
            flower.setWatered(true);
        }else{
            System.out.println("Take watering can first");
        }
    }

}
