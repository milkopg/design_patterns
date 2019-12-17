package design_patterns.com.milko.training.java_interfaces_abstraction.m1.after.interfaces.impl;

import design_patterns.com.milko.training.java_interfaces_abstraction.m1.after.interfaces.api.RevenueCalculator;
import design_patterns.com.milko.training.java_interfaces_abstraction.m1.common.ClientEngagement;

public class RoyaltyShareCalculator implements RevenueCalculator
{
    public static final double STANDARD_ROYALTY_PERCENTAGE = 0.15;

    private final double royaltyPercentage;

    public RoyaltyShareCalculator(final double royaltyPercentage)
    {
        this.royaltyPercentage = royaltyPercentage;
    }

    @Override
    public double calculate(final ClientEngagement clientEngagement)
    {
        return royaltyPercentage * clientEngagement.getAnticipatedRevenue();
    }
}
