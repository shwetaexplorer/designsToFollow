package com.shweta.bridge;

public class ISLGameStrategy extends GameStrategy {

    public ISLGameStrategy(RuleFollower ruleFollower) {
        super(ruleFollower);
    }

    @Override
    void run() {
        ruleFollower = new SquashRuleFollower();
        ruleFollower.execute();
    }
}
