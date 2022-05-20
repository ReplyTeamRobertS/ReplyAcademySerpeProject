package eu.reply.academy.lesson27;

public class CoreDisk extends Core {

    private static int NUMBER_RANDOM = 111;
    private static final int C = 1;

    public CoreDisk() {

        this.createUniqueId();
        this.type="Core Disk";
    }


    public void createUniqueId() {
        this.id = CoreDisk.NUMBER_RANDOM + CoreDisk.C;
        CoreDisk.NUMBER_RANDOM += CoreDisk.C;


    }

    protected void action(String application) {



    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
    //    sb.append("Core: ID: " + this.id + "Core type" + this.type + "\n");
        sb.append("Core: ID: ").append(this.id).append(", Core Type:").append(this.type).append("\n");
        return sb.toString();


    }
}
