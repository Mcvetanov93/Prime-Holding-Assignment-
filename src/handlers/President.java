package handlers;

import common.Type;

/**
 * //TODO - Implement approval implementation for President level
 */
public class President extends Approver{

    private final int[] prices = new int[]{1000, 2000, 3000, 5000, 8000};
    @Override
    public void approve(int id, double cost, Type type) {
        if (!canApprove(cost, type, prices)) {
            next.approve(id, cost, type);
            return;
        }
        System.out.println("President approved purchase with id "+id+ " that costs " + cost);

    }

}