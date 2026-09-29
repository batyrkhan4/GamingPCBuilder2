package main.java.abstract_factory;

public class HighEndComponentFactory implements GamingPCComponentFactory {
    @Override
    public CPU createCPU() {
        return new HighEndCPU();
    }
    @Override
    public GPU createGPU() {
        return new HighEndGPU();
    }

    @Override
    public RAM createRAM() {
        return new HighEndRAM();
    }

    @Override
    public Storage createStorage() {
        return new HighEndStorage();
    }
}
