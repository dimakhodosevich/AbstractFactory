package by.itstep.khodosevich.abstractfactory.module.factory;

import by.itstep.khodosevich.abstractfactory.module.entity.door.Door;
import by.itstep.khodosevich.abstractfactory.module.entity.door.MetalDoor;
import by.itstep.khodosevich.abstractfactory.module.entity.window.Window;
import by.itstep.khodosevich.abstractfactory.module.entity.window.WoodWindow;

public class MelatWoodFactoryHouse extends AbstractFactory{
    @Override
    public Window createWindow() {
        return new WoodWindow();
    }

    @Override
    public Door createDoor() {
        return new MetalDoor();
    }
}
