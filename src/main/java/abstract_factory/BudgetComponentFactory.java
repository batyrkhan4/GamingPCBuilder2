package main.java.abstract_factory;

public class BudgetComponentFactory implements GamingPCComponentFactory {

    @Override
    public CPU createCPU() {
        return new BudgetCPU();
    }

    @Override
    public GPU createGPU() {
        return new BudgetGPU();
    }

    @Override
    public RAM createRAM() {
        return new BudgetRAM();
    }

    @Override
    public Storage createStorage() {
        return new BudgetStorage();
    }
}