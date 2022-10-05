package by.itstep.khodosevich.abstractfactory.module.entity.door;

public class MetalDoor extends Door{
    @Override
    public Door createDoor() {
        return new MetalDoor();
    }

    @Override
    public void installDoor() {
        System.out.println("Metal door installed");
    }
}
