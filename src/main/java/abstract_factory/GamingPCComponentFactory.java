package main.java.abstract_factory;

public interface GamingPCComponentFactory {
    CPU createCPU();
    GPU createGPU();
    RAM createRAM();
    Storage createStorage();
}
