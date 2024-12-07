package com.shweta.bridge;

import java.lang.reflect.GenericArrayType;

public class BridgePatternDemo {

    public static void main(String[] args) {
        RuleFollower ruleFollower = new RunningRuleFollwer();
        GameStrategy  gameStrategy = new IPLGameStartegy(ruleFollower);
        gameStrategy.run();


    }
}
