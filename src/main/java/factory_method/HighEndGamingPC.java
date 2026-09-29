package main.java.factory_method;

public class HighEndGamingPC extends GamingPC {
    @Override
    public void showPC() {
        System.out.println("High-End Gaming PC");
        System.out.println("CPU: AMD Ryzen 7");
        System.out.println("GPU: NVIDIA RTX 5090");
        System.out.println("RAM: 64GB");
        System.out.println("Storage: 2TB NVMe SSD");
    }
}
