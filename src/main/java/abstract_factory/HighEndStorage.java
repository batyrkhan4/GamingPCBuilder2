package main.java.abstract_factory;

public class HighEndStorage implements Storage {
    @Override
    public String getName() {
        return "2TB NVMe SSD";
    }
}
