package eu.reply.academy.lesson27;

public abstract class Core {

    protected int id;
    protected String type;
    public abstract void createUniqueId();
    protected abstract void action(String application);
}
