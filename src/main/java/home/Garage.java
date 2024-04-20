package home;

public class Garage extends HouseDecorator{
    House house;

    public Garage(House house) {
        this.house = house;
    }

    @Override
    public int getPrice() {
        return house.getPrice() + 10_000;
    }

    @Override
    public String getInfo() {
        return house.getInfo() + "гараж";
    }
}
