package handlers;

import common.Type;


/**
 * //TODO - Implement approval implementation for VicePresident level
 */
public class VicePresident extends Approver{
    @Override
    public void approve(int id, double cost, Type type) {

        if (!canApprove(id, cost, type)) {
            next.approve(id, cost, type);
            return;
        }
        System.out.println("VicePresident approved purchase with id "+id+ " that costs " + cost);


    }

    @Override
    protected boolean canApprove(int id, double cost, Type type) {
        boolean result;

        if (type == Type.CONSUMABLES && cost <= 700) {
            result = true;
            return result;
        } else if (type == Type.CLERICAL && cost <= 1500) {
            result = true;
            return result;
        } else if (type == Type.GADGETS && cost <= 2000) {
            result = true;
            return result;
        } else if (type == Type.GAMING && cost <= 4500) {
            result = true;
            return result;
        } else if (type == Type.PC && cost <= 6500) {
            result = true;
            return result;
        } else {
            result = false;
            return result;
        }
    }
    }

