package chain_of_responsibility_pattern;

/**
 * @author totoro
 * @date 2021-09-24 15:08
 */
public class President extends Approver{

    public President(String name){
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 500000){
            System.out.println("董事长" + this.name + "审批采购单：" + request.getNumber() +
                    "金额：" + request.getAmount() + "元，采购目的：" + request.getPurpose() + ".");
        }else {
            this.successor.processRequest(request);
        }
    }
}
