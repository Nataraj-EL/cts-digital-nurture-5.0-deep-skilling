public class Computer {

    // Required fields
    private String cpu;
    private int ram;          
    private int storage;     
    private String gpu;
    private String os;

    // Private constructor - only Builder can create object
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.os = builder.os;
    }

    // Just for displaying the output clearly
    public void showConfig() {
        System.out.println("Computer Configuration:");
        System.out.println("CPU     : " + cpu);
        System.out.println("RAM     : " + ram + " GB");
        System.out.println("Storage : " + storage + " GB");
        System.out.println("GPU     : " + (gpu != null ? gpu : "Not included"));
        System.out.println("OS      : " + (os != null ? os : "Not installed"));
        System.out.println();
    }

    // Static Builder class
    public static class Builder {

        private String cpu;
        private int ram;
        private int storage;
        private String gpu;
        private String os;

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder setOs(String os) {
            this.os = os;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}