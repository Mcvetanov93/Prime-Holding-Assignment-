package handlers;

import common.Type;

/**
 * //TODO - If needed, validate logic and if possible optimize code
 */
public class Manager extends Approver {
    private final int [] prices= new int[]{300,500,1000,3000,5000};
    @Override
    public void approve(int id, double cost, Type type) {
        if (!canApprove(cost, type, prices)) {
            next.approve(id, cost, type);
            return;
        }

        System.out.println("Manager approved purchase with id " + id + " that costs " + cost);
    }


}
