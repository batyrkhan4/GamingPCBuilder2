package main.java.abstract_factory;

public class BudgetStorage implements Storage {
    @Override
    public String getName() {
        return "1TB SSD";
    }

}
