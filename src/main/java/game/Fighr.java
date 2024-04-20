package game;

public class Fighr {
    public static void main(String[] args) {
        Unit[] units = {new Knight(),
                new Mag(new Knight()),
                new Mag(new Elf(new Knight())),
                new Ork(),
                new Ork(),
                new Knight()};
        for (Unit unit : units) {
            unit.go();
        }
    }
}
