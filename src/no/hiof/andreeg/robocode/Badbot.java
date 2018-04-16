package no.hiof.andreeg.robocode;

import robocode.Robot;

public class Badbot extends Robot {

    @Override
    public void run() {
        while(true) {
            ahead(100);
            turnRadarLeft(25);
        }
    }
}
