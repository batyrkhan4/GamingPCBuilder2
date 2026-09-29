import main.java.factory_method.BudgetPCFactory;
import main.java.factory_method.GamingPCClient;
import main.java.factory_method.GamingPCFactory;
import main.java.factory_method.HighEndPCFactory;

public class Main {
    public static void main(String[] args) {
        GamingPCFactory budgetFactory = new BudgetPCFactory();
        GamingPCClient budgetClient = new GamingPCClient(budgetFactory);
        budgetClient.showPC();

        System.out.println();

        GamingPCFactory highEndFactory = new HighEndPCFactory();
        GamingPCClient highEndClient = new GamingPCClient(highEndFactory);
        highEndClient.showPC();

    }
}