package home;

public class Build {
    public static void main(String[] args) {
        House brickHouse = new BrickHouse();
        System.out.println(brickHouse.getInfo());
        System.out.println(brickHouse.getPrice());
        brickHouse = new SecondFloor(brickHouse);

        System.out.println(brickHouse.getInfo());
        System.out.println(brickHouse.getPrice());

        brickHouse = new Garage(brickHouse);
        System.out.println(brickHouse.getInfo());
        System.out.println(brickHouse.getPrice());

        House woodenHouse = new WoodenHouse();
        System.out.println(woodenHouse.getInfo());
        System.out.println(woodenHouse.getPrice());

        woodenHouse = new Garage(woodenHouse);
        System.out.println(woodenHouse.getPrice());
        System.out.println(woodenHouse.getInfo());


    }
}
