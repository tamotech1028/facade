package facade;

public class FacadeMain {
    public static void main(String[] args) {
        // 窓口のインスタンスのみを作成
        CustomerServiceFacade customerServiceFacade = new CustomerServiceFacade();

        // 銀行窓口に必要な情報だけを伝える
        String name1 = "前田";
        customerServiceFacade.openAccount(name1);
        customerServiceFacade.applyForLoan(name1, 50000000);
        customerServiceFacade.consultInvestment("nisa");

        // 銀行窓口に必要な情報だけを伝える
        String name2 = "田中";
        customerServiceFacade.openAccount(name2);
        customerServiceFacade.applyForLoan(name2, 100000000);
        customerServiceFacade.consultInvestment("ideco");
    }
}
