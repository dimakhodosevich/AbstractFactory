package by.itstep.khodosevich.abstractfactory.controller;

import by.itstep.khodosevich.abstractfactory.module.factory.AbstractFactory;
import by.itstep.khodosevich.abstractfactory.module.factory.MelatWoodFactoryHouse;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new MelatWoodFactoryHouse();
        factory.createWindow().describeWindow();
        factory.createDoor().installDoor();
    }
}
