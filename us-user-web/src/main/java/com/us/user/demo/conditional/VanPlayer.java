package com.us.user.demo.conditional;

/**
 * Created by Loren on 2018/10/8.
 */
public class VanPlayer {

    private IFighter fighter;

    public VanPlayer(IFighter fighter) {
        this.fighter = fighter;
    }

    public void fightSomeOne() {
        fighter.fight();
    }

}
