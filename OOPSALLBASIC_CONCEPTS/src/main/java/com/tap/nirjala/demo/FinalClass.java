package com.tap.nirjala.demo;

final class FinalClass implements Cloneable{

    final int maxLeaves = 25;
    int performance = 8;

    final int calculateRemainingLeaves(int takenLeaves) {
        return maxLeaves - takenLeaves;
    }

    boolean isEligibleForBonus(int working_hours) {
        return performance >= 8;
    }

    
}
