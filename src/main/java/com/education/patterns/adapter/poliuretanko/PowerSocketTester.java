package com.education.patterns.adapter.poliuretanko;

public class PowerSocketTester {
    public static void main(String[] args) {
        PowerInterface europeanPowerSocket = new EuropeanPowerSocket();
        PowerInterface americanPowerInterface = new AmericanPowerSocket();
        EuropeanPlug europeanPlug = new EuropeanPlug();
        AmericanPlug americanPlug = new AmericanPlug();

        europeanPowerSocket.connect(americanPlug);
        europeanPowerSocket.connect(europeanPlug);
        europeanPowerSocket.disconnect();

        americanPowerInterface.connect(europeanPlug);
        americanPowerInterface.connect(americanPlug);
        americanPowerInterface.disconnect();

        // Using the Adapter Pattern
        Plug adapter = new AmericanToEuropeanPlugAdapter(americanPlug);
        europeanPowerSocket.connect(adapter);
    }
}
