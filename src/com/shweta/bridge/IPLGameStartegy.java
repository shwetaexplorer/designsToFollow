package com.shweta.bridge;

public class IPLGameStartegy extends  GameStrategy{

    public IPLGameStartegy(RuleFollower ruleFollower) {
        super(ruleFollower);
    }

    @Override
    void run() {
        ruleFollower = new RunningRuleFollwer();
        ruleFollower.execute();
    }
}
