package no.hiof.andreeg.robocode;

import robocode.HitWallEvent;
import robocode.Robot;

public class Badbot extends Robot {

    @Override
    public void run() {
        while(true) {
            ahead(100);
            turnRadarLeft(25);
        }
    }

    @Override
    public void onHitWall(HitWallEvent event) {
        System.out.println("hit wall");
    }
}
