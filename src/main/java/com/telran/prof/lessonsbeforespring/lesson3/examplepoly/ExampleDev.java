package com.telran.prof.lessonsbeforespring.lesson3.examplepoly;

public class ExampleDev {

    public static void main(String[] args) {
       // Developer dev = new Developer();
        AbstractDeveloper sDev = new BackendDeveloper();
        AbstractDeveloper fDev = new FrontendDeveloper();
        AbstractDeveloper dbDev = new DatabaseDeveloper();

//        dev.writeTheCode();
//        sDev.writeTheCode();
//        fDev.writeTheCode();
//        dbDev.writeTheCode();

        //askDevToWriteCode(dev);
        askDevToWriteCode(sDev);
        askDevToWriteCode(fDev);
    }

    private static void askDevToWriteCode(AbstractDeveloper abstractDeveloper) {
        abstractDeveloper.writeTheCode();
    }
}
