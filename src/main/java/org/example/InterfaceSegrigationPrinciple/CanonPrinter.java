package org.example.InterfaceSegrigationPrinciple;

import org.example.InterfaceSegrigationPrinciple.Interface.IPrint;

public class CanonPrinter implements IPrint {

    @Override
    public void print() {
        System.out.println("I am printing");
    }
}
