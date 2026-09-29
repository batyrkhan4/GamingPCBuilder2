package main.java.factory_method;

public class BudgetPCFactory implements GamingPCFactory {
    @Override
    public GamingPC createGamingPC() {
        return new BudgetGamingPC();
    }

}
