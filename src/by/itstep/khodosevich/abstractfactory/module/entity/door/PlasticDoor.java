package by.itstep.khodosevich.abstractfactory.module.entity.door;

public class PlasticDoor extends Door{
    @Override
    public Door createDoor() {
        return new PlasticDoor();
    }

    @Override
    public void installDoor() {
        System.out.println("Plastic door installed");
    }
}
