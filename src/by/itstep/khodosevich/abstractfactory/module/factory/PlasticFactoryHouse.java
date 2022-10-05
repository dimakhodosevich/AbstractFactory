package by.itstep.khodosevich.abstractfactory.module.factory;

import by.itstep.khodosevich.abstractfactory.module.entity.door.Door;
import by.itstep.khodosevich.abstractfactory.module.entity.door.PlasticDoor;
import by.itstep.khodosevich.abstractfactory.module.entity.window.PlasticWindow;
import by.itstep.khodosevich.abstractfactory.module.entity.window.Window;

public class PlasticFactoryHouse extends AbstractFactory{
    @Override
    public Window createWindow() {
        return new PlasticWindow();
    }

    @Override
    public Door createDoor() {
        return new PlasticDoor();
    }
}
