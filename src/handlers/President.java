package handlers;

import common.Type;

/**
 * //TODO - Implement approval implementation for President level
 */
public class President extends Approver{
    @Override
    public void approve(int id, double cost, Type type) {
        if (!canApprove(id, cost, type)) {
            next.approve(id, cost, type);
            return;
        }
        System.out.println("President approved purchase with id "+id+ " that costs " + cost);

    }

    @Override
    protected boolean canApprove(int id, double cost, Type type) {
        boolean result;

        if (type == Type.CONSUMABLES && cost <= 1000) {
            result = true;
            return result;
        } else if (type == Type.CLERICAL && cost <= 2000) {
            result = true;
            return result;
        } else if (type == Type.GADGETS && cost <= 3000) {
            result = true;
            return result;
        } else if (type == Type.GAMING && cost <= 5000) {
            result = true;
            return result;
        } else if (type == Type.PC && cost <= 8000) {
            result = true;
            return result;
        } else {
            result = false;
            return result;
        }
    }
}