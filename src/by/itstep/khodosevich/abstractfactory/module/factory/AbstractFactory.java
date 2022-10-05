package by.itstep.khodosevich.abstractfactory.module.factory;

import by.itstep.khodosevich.abstractfactory.module.entity.door.Door;
import by.itstep.khodosevich.abstractfactory.module.entity.window.Window;

public abstract class AbstractFactory {
    public abstract Window createWindow();
    public abstract Door createDoor();

}
