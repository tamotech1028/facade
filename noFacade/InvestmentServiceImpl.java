package noFacade;

public class InvestmentServiceImpl implements InvestmentService {
    @Override
    public void consultInvestment(String investor) {
        System.out.println(investor + "の投資先を紹介します。");
    }
}
