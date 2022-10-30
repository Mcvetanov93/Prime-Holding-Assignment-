package handlers;

import common.Type;




public abstract class Approver {

    protected Approver next;

    /**
     * If needed, be free to change signature of abstract methods.
     */
    public abstract void approve(int id, double cost, Type type);
    protected  boolean canApprove( double cost, Type type, int [] prices){
        if(Type.CONSUMABLES==type && cost<= prices[0]){
            return true;
        } else if (Type.CLERICAL==type && cost<= prices[1]) {
            return true;
        } else if (Type.GADGETS==type && cost<= prices[2]) {
            return true;
        } else if (Type.GAMING==type && cost<= prices[3]) {
            return true;
        } else if (Type.PC==type && cost<= prices[4]) {
            return true;
        }
        else
            return false;
    }

    /**
     * Method used for registering next approver level.
     * DO NOT CHANGE IT.
     */
    public Approver registerNext(Approver next) {
        this.next = next;
        return next;
    }
}
