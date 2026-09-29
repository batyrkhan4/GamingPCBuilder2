package main.java.factory_method;

public class HighEndPCFactory implements GamingPCFactory {
    @Override
    public GamingPC createGamingPC() {
        return new HighEndGamingPC();
    }
}
