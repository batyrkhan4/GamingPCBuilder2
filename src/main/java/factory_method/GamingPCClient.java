package main.java.factory_method;

public class GamingPCClient {
    private GamingPC pc;

    public GamingPCClient(GamingPCFactory factory) {
        pc = factory.createGamingPC();
    }

    public void showPC() {
        pc.showPC();
    }
}
