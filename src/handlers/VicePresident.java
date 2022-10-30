package handlers;

import common.Type;


/**
 * //TODO - Implement approval implementation for VicePresident level
 */
public class VicePresident extends Approver {

    private final int[] prices = new int[]{700, 1500, 2000, 4500, 6500};

    @Override
    public void approve(int id, double cost, Type type) {
        if (!canApprove(cost, type, prices)) {
            next.approve(id, cost, type);
            return;
        }
        System.out.println("VicePresident approved purchase with id " + id + " that costs " + cost);


    }

}

