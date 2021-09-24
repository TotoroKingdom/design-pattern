package chain_of_responsibility_pattern;

/**
 * @author totoro
 * @date 2021-09-24 15:00
 */
public abstract class Approver {
    protected Approver successor;
    protected String name;

    public Approver(String name){
        this.name = name;
    }

    public void setSuccessor(Approver successor){
        this.successor = successor;
    }

    public abstract void processRequest(PurchaseRequest request);
}
