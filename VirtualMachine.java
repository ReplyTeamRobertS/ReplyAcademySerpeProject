package eu.reply.academy.lesson27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VirtualMachine {

    protected String name;
    protected String type;
    protected int numberOfCores;
    protected int prioritate;
    protected List<String> aplicationList;


    public void setAplicationList(String app) {

        this.aplicationList = new ArrayList<>();
        if (app == null) {

            System.out.println("is null");

        } else {

            List<String> list = Arrays.asList(app.split(", "));
            this.aplicationList.addAll(list);

        }
    }

    protected void setAplicationList(String... vector){
        if (vector == null){
            System.out.println("Valoarea este null");
        }else {
            List<String> list = Arrays.asList(vector);
            this.aplicationList.addAll(list);
        }
    }

    public List<String> getAplicationList() {
        return this.aplicationList;
    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        if (name == null) {

            System.out.println("Name is null");

        } else this.name = name;

    }

    public String getType() {

        return type;

    }

    public void setType(String type) {

        if (type == null) {

            System.out.println("Type is null");

        } else this.type = type;

    }

    public int getNumberOfCores() {

        return numberOfCores;

    }

    public void setNumberOfCores(String numberOfCores) {

        if (numberOfCores == null) {

            System.out.println("NumberOfCores is null");

        } else this.numberOfCores = Integer.parseInt(numberOfCores);


    }

    public void setPrioritate(int prioritate) {
        boolean isunique = true;
        if (prioritate < 0) {
            isunique = false;
        } else {
            if (!Hypervisor.listOfCreatedVirtualMachine.isEmpty()) {
                for (VirtualMachine virtualMachine : Hypervisor.listOfCreatedVirtualMachine) {
                    if (virtualMachine.prioritate == prioritate) {
                        isunique = false;
                    }
                }
            }

        }
        if (!isunique) {
            System.out.println("Dati alta valoare la prioritate.");
        }else{
                this.prioritate = prioritate;
            }
        }


        public String toString () {

            StringBuilder sb = new StringBuilder();
//            sb.append("Virtual Machine\n Name OS: " + this.name
//                    + ";\n Type OS: " + this.type
//                    + ";\n Number of processors " + this.numberOfCores
//                    + ";\n Number Prioritate: " + this.prioritate + ";\n Application List: "
//                    + Arrays.toString(this.aplicationList.toArray()).replace('[', ' ')
//                    .replace(']', ' ').trim() + ";\n");
            sb.append("Virtual Machine\n Name OS: ").append(this.name).append(";\n Type Os: ").append(this.type).append(";\n Number of processors ").append(this.numberOfCores).append(";\n Number Prioritate: ").append(this.prioritate).append(";\n Application List: ").append(Arrays.toString(this.aplicationList.toArray()).replace('[', ' ')
                    .replace(']', ' ').trim()).append(";\n");
            return sb.toString();

        }

    }
