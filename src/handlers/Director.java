package handlers;

import common.Type;

/**
 * //TODO - If needed, validate logic and if possible optimize code.
 */
public class Director extends Approver {
    private final int [] prices= new int[]{500,1000,1500,3500,6000};
    @Override
    public void approve(int id, double cost, Type type) {
        if (!canApprove(cost, type, prices)) {
            next.approve(id, cost, type);
            return;
        }
        System.out.println("Director approved purchase with id " + id + " that costs " + cost);
    }


}
