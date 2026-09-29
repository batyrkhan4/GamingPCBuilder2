package main.java.abstract_factory;

import main.java.factory_method.GamingPC;
import main.java.factory_method.GamingPCFactory;

public class GamingPCClient {

    private GamingPC pc;

    public GamingPCClient(GamingPCFactory factory) {
        pc = factory.createGamingPC();
    }

    public void showPC() {
        pc.showPC();
    }
}