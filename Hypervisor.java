package eu.reply.academy.lesson27;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hypervisor {
    public static List<VirtualMachine> listOfCreatedVirtualMachine = new ArrayList<>();
    protected static List<Processor> processorsList = new ArrayList<>();
    private static final String NAME = "name";
    private static final String TYPE = "type";
    private static final String NUMBEROFCORES = "numar";
    public static final String APPLIST = "applist";


    public static VirtualMachine citesteFisierul(String path, String numeleFisierului, int prioritate) {
        VirtualMachine virtualMachine = new VirtualMachine();
        String line;

        try {
            BufferedReader br = new BufferedReader(new FileReader(path + numeleFisierului));

            while ((line = br.readLine()) != null) {
                if (NAME.equals(StringUtils.getKey(line))) {

                    virtualMachine.setName(StringUtils.getValue(line));
                } else if (TYPE.equals(StringUtils.getKey(line))) {
                    virtualMachine.setType(StringUtils.getValue(line));
                } else if (NUMBEROFCORES.equals(StringUtils.getKey(line))) {
                    virtualMachine.setNumberOfCores(StringUtils.getValue(line));
                } else if (APPLIST.equals(StringUtils.getKey(line))) {
                    virtualMachine.setAplicationList(StringUtils.getValue(line));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        virtualMachine.setPrioritate(prioritate);
        Hypervisor.listOfCreatedVirtualMachine.add(virtualMachine);
        return Hypervisor.validareObiectCreat(virtualMachine);
    }

    private static VirtualMachine validareObiectCreat(VirtualMachine virtualMachine) {
        if (virtualMachine.getName() == null && virtualMachine.getType() == null
                && virtualMachine.getNumberOfCores() == 0 && virtualMachine.getAplicationList() == null) {
            System.out.println("Masina virtuala nu s-a creat.");
        } else {
            System.out.println("Masina virtuala s-a creat cu succes.");
        }
        return virtualMachine;
    }

    public static void printingVirtualMachine() {

        for (VirtualMachine virtualMachine : Hypervisor.listOfCreatedVirtualMachine) {
            System.out.println(virtualMachine);
        }

    }


    protected static void printingProcessors(Processor... procesor) {

        for (VirtualMachine virtualMachine : Hypervisor.listOfCreatedVirtualMachine) {
            System.out.println(virtualMachine);
        }


    }

    protected static void addProcessor(Processor... processors) {
        List<Processor> list = Arrays.asList(processors);
        Hypervisor.processorsList.addAll(list);
    }

    protected static void printingProcessors() {
        for (Processor processor : Hypervisor.processorsList) {
            System.out.println(processor);
        }
    }

    protected static void addApplication(VirtualMachine virtualMachine, String... s) {
        virtualMachine.setAplicationList(s); ///de revizuit
    }

    public static VirtualMachine createVMachine(String path, String name, int priority) {
        VirtualMachine virtualMachine = new VirtualMachine();
        String linie;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path + "\\" + name))) {
            while ((linie = bufferedReader.readLine()) != null) {
                if (NAME.equals(StringUtils.getKey(linie))) {
                    virtualMachine.setName(StringUtils.getValue(linie));
                } else if (TYPE.equals(StringUtils.getKey(linie))) {
                    virtualMachine.setType(StringUtils.getValue(linie));
                } else if (NUMBEROFCORES.equals(StringUtils.getKey(linie))) {
                    virtualMachine.setNumberOfCores(StringUtils.getValue(linie));
                } else if (APPLIST.equals(StringUtils.getKey(linie))) {
                    virtualMachine.setAplicationList(StringUtils.getValue(linie));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        virtualMachine.setPrioritate(priority);
        Hypervisor.listOfCreatedVirtualMachine.add(virtualMachine);
        return Hypervisor.validareObiectCreat(virtualMachine);
    }

}
