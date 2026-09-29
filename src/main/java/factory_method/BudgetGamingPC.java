package main.java.factory_method;

public class BudgetGamingPC extends GamingPC {
    @Override
    public void showPC(){
        System.out.println("Budget Gaming PC");
        System.out.println("CPU: AMD Ryzen 5");
        System.out.println("GPU: NVIDIA RTX 4060");
        System.out.println("RAM: 16GB");
        System.out.println("Storage: 1TB SSD");
    }
}
