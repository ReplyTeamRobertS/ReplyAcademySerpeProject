package eu.reply.academy.lesson27;

public class CoreScreen extends Core {

    private static int NUMBER_RANDOM = 111;
    private static final int C = 1;

    public CoreScreen() {

        this.createUniqueId();
        this.type="Core Screen";
    }


    public void createUniqueId() {
        this.id = CoreScreen.NUMBER_RANDOM + CoreScreen.C;
        CoreScreen.NUMBER_RANDOM += CoreScreen.C;


    }

    @Override
    protected void action(String application) {

    }

//    protected void action(String application) {
//
//        CoreScreen.createVMachine(PATH,"nu.txt",1);
//    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
//        sb.append("Core: ID: " + this.id + ", Core Type: " + this.type + "\n");
        sb.append("Core: ID: ").append(this.id).append(", Core Type: ").append(this.type).append("\n");
        return sb.toString();
    }


}

