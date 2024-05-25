package facade;

public class AccountServiceImpl implements AccountService {
    @Override
    public void openAccount(String accountName) {
        System.out.println(accountName + "の名義で口座を開設します。");
    }
}
