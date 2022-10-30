package handlers;

import common.Type;

/**
 * //TODO - If needed, validate logic and if possible optimize code
 */
public class Manager extends Approver {
    @Override
    public void approve(int id, double cost, Type type) {
        if (!canApprove(id, cost, type)) {
            next.approve(id, cost, type);
            return;
        }

        System.out.println("Manager approved purchase with id " + id + " that costs " + cost);
    }

    @Override
    protected boolean canApprove(int id, double cost, Type type) {
        boolean result;

        if (type == Type.CONSUMABLES && cost <= 300) {
            result = true;
            return result;
        } else if (type == Type.CLERICAL && cost <= 500) {
            result = true;
            return result;
        } else if (type == Type.GADGETS && cost <= 1000) {
            result = true;
            return result;
        } else if (type == Type.GAMING && cost <= 2000) {
            result = true;
            return result;
        } else if (type == Type.PC && cost <= 5000) {
            result = true;
            return result;
        } else {
            result = false;
            return result;
        }
    }
}
