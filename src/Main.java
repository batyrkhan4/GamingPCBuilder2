import main.java.abstract_factory.BudgetComponentFactory;
import main.java.abstract_factory.GamingPCAssembler;
import main.java.abstract_factory.HighEndComponentFactory;
import main.java.factory_method.BudgetPCFactory;
import main.java.factory_method.GamingPCClient;
import main.java.factory_method.GamingPCFactory;
import main.java.factory_method.HighEndPCFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== FACTORY METHOD =====");

        GamingPCFactory budgetFactory = new BudgetPCFactory();
        GamingPCClient budgetClient = new GamingPCClient(budgetFactory);

        System.out.println("\nBudget Gaming PC:");
        budgetClient.showPC();


        GamingPCFactory highEndFactory = new HighEndPCFactory();
        GamingPCClient highEndClient = new GamingPCClient(highEndFactory);

        System.out.println("\nHigh-End Gaming PC:");
        highEndClient.showPC();

        System.out.println("\n\n===== ABSTRACT FACTORY =====");

        GamingPCAssembler assembler = new GamingPCAssembler();
        System.out.println("\nBudget Component Family:");

        assembler.buildPC(new BudgetComponentFactory());

        System.out.println("\nHigh-End Component Family:");

        assembler.buildPC(new HighEndComponentFactory());
    }

}
