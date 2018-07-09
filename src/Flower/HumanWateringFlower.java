package Flower;

public class HumanWateringFlower {

    private static void wateringResult(Flower flower) {
        if (flower.getWatered()) {
            System.out.println("The flower is watered");
        } else {
            System.out.println("The flower is NOT watered");
        }

    }

    public static void main(String[] args) {
        Human human = new Human();
        WateringCan wateringCan = new WateringCan();
        Flower flower = new Flower();

        human.takeWateringCan(wateringCan);
        human.wateringFlower(flower, wateringCan);
        wateringResult(flower);
    }
}
