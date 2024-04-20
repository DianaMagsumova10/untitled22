package lessons17;

public class Example25 {
    public static void main(String[] args) {
        Color color = Color.RED;
        color(color);
        System.out.println(color(color));
    }


    private static String color(Color color) {
        switch (color) {
            case RED -> {
                return "Red";
            }
            case GREEN -> {
                return "Green";
            }
            case ORANGE -> {
                return "Orange";
            }
            default -> {
                return  "Nothing";
            }
        }
    }
}


    enum Color {
        RED, GREEN, ORANGE;
    }