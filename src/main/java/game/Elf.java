package game;

public class Elf extends AbstractUnit{
    protected Elf(Unit unit) {
        super(unit);
    }

    @Override
    protected void loudScream() {
        System.out.println("Where my pendants");
    }
}
