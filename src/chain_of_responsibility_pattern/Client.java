package chain_of_responsibility_pattern;

/**
 * @author totoro
 * @date 2021-09-24 15:18
 */
public class Client {
    public static void main(String[] args) {
        Approver director,vicePresident,president,congress;
        director = new Director("张无忌");
        vicePresident = new VicePresident("杨过");
        president = new President("郭靖");
        congress = new Congress("董事会");

        //创建职责链
        director.setSuccessor(vicePresident);
        vicePresident.setSuccessor(president);
        president.setSuccessor(congress);

        PurchaseRequest p1 = new PurchaseRequest(20000,001,"苹果笔记本");
        director.processRequest(p1);

        PurchaseRequest p2 = new PurchaseRequest(75000,002,"五菱宏光");
        director.processRequest(p2);

        PurchaseRequest p3 = new PurchaseRequest(350000,003,"特斯拉");
        director.processRequest(p3);

        PurchaseRequest p4 = new PurchaseRequest(666666,004,"梅赛德斯");
        director.processRequest(p4);


    }
}
