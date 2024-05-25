package noFacade;

public class NoFacadeMain {
    public static void main(String[] args) {
        // 各サービスのインスタンスを作成
        AccountService accountService = new AccountServiceImpl();
        LoanService loanService = new LoanServiceImpl();
        InvestmentService investmentService = new InvestmentServiceImpl();

        // 自分自身で各サービスを利用する
        String name1 = "前田";
        accountService.openAccount(name1);
        loanService.applyForLoan(name1, 50000000);
        investmentService.consultInvestment("nisa");

        // 自分自身で各サービスを利用する
        String name2 = "田中";
        accountService.openAccount(name2);
        loanService.applyForLoan(name2, 100000000);
        investmentService.consultInvestment("ideco");
    }
}
