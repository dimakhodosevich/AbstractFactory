package by.itstep.khodosevich.abstractfactory.module.entity.window;

public class WoodWindow extends Window{
    @Override
    public Window installWindow() {
        return new WoodWindow();
    }

    @Override
    public void describeWindow() {
        System.out.println("House has wood window");
    }
}
