package facade;

public class LoanServiceImpl implements LoanService {
    @Override
    public void applyForLoan(String accountName, double amount) {
        System.out.println(accountName + "の名義で" + amount + "円のローンを申請します。");
    }
}
