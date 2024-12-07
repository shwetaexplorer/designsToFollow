package com.shweta.bridge;

public abstract class GameStrategy {
    protected RuleFollower ruleFollower;

    public GameStrategy(RuleFollower ruleFollower) {
        this.ruleFollower = ruleFollower;
    }
    abstract void run();

}
