package com.education.patterns.adapter.poliuretanko;

public class EuropeanPowerSocket implements PowerInterface {

    private EuropeanPlug plug;

    @Override
    public void connect(Plug plug) {
        if (!(plug instanceof EuropeanPlug)) {
            System.out.println("The plug " + plug.getName() + " cannot be connected with " + this.getName());
            return;
        }
        System.out.println("The plug " + plug.getName() + " connected with " + this.getName());
        this.plug = (EuropeanPlug) plug;
    }

    @Override
    public void disconnect() {
        System.out.println("The plug " + plug.getName() + " disconnected from " + this.getName());
        this.plug = null;
    }

    @Override
    public String getName() {
        return "European Power Socket";
    }
}
