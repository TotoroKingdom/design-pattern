package chain_of_responsibility_pattern;

/**
 * @author totoro
 * @date 2021-09-24 15:17
 */
public class Congress extends Approver{
    public Congress(String name){
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("董事会" + this.name + "审批采购单：" + request.getNumber() +
                "金额：" + request.getAmount() + "元，采购目的：" + request.getPurpose() + ".");
    }
}
