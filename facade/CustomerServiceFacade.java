package facade;

// 銀行窓口クラス(Facadeクラス)
public class CustomerServiceFacade {

    private final AccountService accountService;
    private final LoanService loanService;
    private final InvestmentService investmentService;

    // コンストラクタでそれぞれのサービスを生成
    public CustomerServiceFacade() {
        this.accountService = new AccountServiceImpl();
        this.loanService = new LoanServiceImpl();
        this.investmentService = new InvestmentServiceImpl();
    }

    public void openAccount(String accountName) {
        accountService.openAccount(accountName);
    }

    public void applyForLoan(String accountName, double amount) {
        loanService.applyForLoan(accountName, amount);
    }

    public void consultInvestment(String investor) {
        investmentService.consultInvestment(investor);
    }
}
