package com.education.patterns.chainofresponsibility;

import com.education.patterns.chainofresponsibility.militaries.Admiral;
import com.education.patterns.chainofresponsibility.militaries.Colonel;
import com.education.patterns.chainofresponsibility.militaries.Commander;
import com.education.patterns.chainofresponsibility.militaries.Soldier;

import java.util.List;

public class BattleCommandsSimulator {
    public static void main(String[] args) {
        Soldier soldier1 = new Soldier(Position.front, "Vasya");
        Soldier soldier2 = new Soldier(Position.front, "Petya");
        Soldier soldier3 = new Soldier(Position.leftFlank, "Kolya");
        Soldier soldier4 = new Soldier(Position.leftFlank, "John");
        Soldier soldier5 = new Soldier(Position.rightFlank, "Gans");
        Soldier soldier6 = new Soldier(Position.rightFlank, "Billy");

        Commander commander1 = new Commander(Position.rear, "Koko", List.of());
        Commander commander2 = new Commander(Position.front, "Pepe", List.of(soldier1, soldier2));
        Commander commander3 = new Commander(Position.leftFlank, "Nino", List.of(soldier3, soldier4));
        Commander commander4 = new Commander(Position.rightFlank, "Ivan", List.of(soldier5, soldier6));

        Colonel colonel1 = new Colonel(Position.base, "Olga", List.of(commander1, commander2));
        Colonel colonel2 = new Colonel(Position.rear, "Marsel", List.of(commander3, commander4));

        Admiral admiral = new Admiral(Position.base, "Stepan", List.of(colonel1, colonel2));

        System.out.println(admiral.getState());
        System.out.println("=======================");
        System.out.println(admiral.executeAnOrder(Order.retreat, Position.rightFlank));
        System.out.println("=======================");
        System.out.println(admiral.executeAnOrder(Order.attack, Position.front));
        System.out.println("=======================");
        System.out.println(admiral.getState());
    }
}
