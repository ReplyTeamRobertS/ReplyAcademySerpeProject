package eu.reply.academy.lesson27;

public class RunMe {

    public static final String PATH = "C:/Users/Robert Serpe/Desktop/";

    public static void main(String[] args) {

        String numeleFisierului = "Procesor.txt";
        String numeleFisierului2 = "Procesor2.txt";

//        Hypervisor hypervisor = new Hypervisor();
//        hypervisor.citesteFisierul(PATH, numeleFisierului, 1);
//        hypervisor.citesteFisierul(PATH, numeleFisierului2, 3);

        VirtualMachine virtualMachine1 = Hypervisor.citesteFisierul(PATH, numeleFisierului,1);
        VirtualMachine virtualMachine2 = Hypervisor.citesteFisierul(PATH, numeleFisierului2,1);
        Hypervisor.printingVirtualMachine();
        VirtualMachine virtualMachine3 = Hypervisor.citesteFisierul(PATH,numeleFisierului2 , 3);
        Processor processor1 = new Processor(new CoreScreen(), new CoreDisk());
        Processor processor2 = new Processor(new CoreDisk(), new CoreScreen(), new CoreScreen(), new CoreDisk());
        Hypervisor.addProcessor(processor1, processor2);
        Hypervisor.printingProcessors();
        Hypervisor.addApplication(virtualMachine1,"Internet Explorer","Microsoft Edge");
        System.out.println(virtualMachine1);

    }

}
