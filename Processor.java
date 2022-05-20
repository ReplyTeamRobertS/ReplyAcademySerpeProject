package eu.reply.academy.lesson27;

import java.util.Arrays;
import java.util.List;

public class Processor {

  private static int NUMBER_RANDOM = 9999;
  private static final int C = 1;

  public int id;
  public List<Core> coreList;

  public Processor(Core... lista){

    this.createUniqueId();
    List<Core> list = Arrays.asList(lista);
    this.coreList=list;

  }

  public void createUniqueId() {

    this.id = Processor.NUMBER_RANDOM + Processor.C;
    Processor.NUMBER_RANDOM += Processor.C;

  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
//    sb.append("Processor: ID: " + this.id + Arrays.toString(this.coreList.toArray()).replace('[', ' ')
//            .replace(']', ' ').trim() + ";\n");
    sb.append("Processor: ID: ").append(this.id).append(Arrays.toString(this.coreList.toArray()).replace('[', ' ')
            .replace(']', ' ').trim()).append(";\n");
    return sb.toString();


  }

}
