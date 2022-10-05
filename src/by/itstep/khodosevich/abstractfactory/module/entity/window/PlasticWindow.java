package by.itstep.khodosevich.abstractfactory.module.entity.window;

public class PlasticWindow extends Window{
    @Override
    public Window installWindow() {
        return new PlasticWindow();
    }

    @Override
    public void describeWindow() {
        System.out.println("House has plastic window");
    }
}
