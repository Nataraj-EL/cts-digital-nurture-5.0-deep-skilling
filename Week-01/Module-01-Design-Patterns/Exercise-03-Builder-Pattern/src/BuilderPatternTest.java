public class BuilderPatternTest {

    public static void main(String[] args) {

        // basic office computer
        Computer officePC = new Computer.Builder()
                .setCpu("Intel i5")
                .setRam(8)
                .setStorage(512)
                .setOs("Windows 11")
                .build();

        officePC.showConfig();


        // gaming setup
        Computer gamingPC = new Computer.Builder()
                .setCpu("AMD Ryzen 7")
                .setRam(16)
                .setStorage(1024)
                .setGpu("NVIDIA RTX 4060")
                .setOs("Windows 11 Pro")
                .build();

        gamingPC.showConfig();


        // minimal development machine
        Computer devPC = new Computer.Builder()
                .setCpu("Intel i7")
                .setRam(16)
                .setStorage(512)
                .build();

        devPC.showConfig();
    }
}