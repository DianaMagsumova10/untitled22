package game;

public class Mag extends AbstractUnit{
    protected Mag(Unit unit) {
        super(unit);
    }

    @Override
    protected void loudScream() {
        System.out.println("Run, you fools");
    }
}
