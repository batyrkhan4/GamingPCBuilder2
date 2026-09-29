package main.java.abstract_factory;

import main.java.factory_method.BudgetPCFactory;
import main.java.factory_method.GamingPCClient;
import main.java.factory_method.GamingPCFactory;
import main.java.factory_method.HighEndPCFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Factory method ===");

        GamingPCFactory budgetFactory = new BudgetPCFactory();
        GamingPCClient budgetClient = new GamingPCClient(budgetFactory);

        System.out.println("Budget Gaming PC:");
        budgetClient.showPC();

        System.out.println();

        GamingPCFactory highEndFactory =
                new HighEndPCFactory();

        GamingPCClient highEndClient =
                new GamingPCClient(highEndFactory);

        System.out.println("HIGH-END GAMING PC:");
        highEndClient.showPC();

        System.out.println();

        // Abstract Factory
        System.out.println("=== ABSTRACT FACTORY ===");

        GamingPCAssembler assembler = new GamingPCAssembler();

        System.out.println("BUDGET COMPONENT FAMILY:");
        assembler.buildPC(new BudgetComponentFactory());

        System.out.println();

        System.out.println("HIGH-END COMPONENT FAMILY:");
        assembler.buildPC(new HighEndComponentFactory());
    }
}

