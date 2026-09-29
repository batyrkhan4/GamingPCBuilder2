package main.java.abstract_factory;



public class GamingPCAssembler {

    public void buildPC(GamingPCComponentFactory factory) {

        CPU cpu = factory.createCPU();
        GPU gpu = factory.createGPU();
        RAM ram = factory.createRAM();
        Storage storage = factory.createStorage();

        System.out.println("Gaming PC");
        System.out.println("CPU: " + cpu.getName());
        System.out.println("GPU: " + gpu.getName());
        System.out.println("RAM: " + ram.getName());
        System.out.println("Storage: " + storage.getName());
    }
}