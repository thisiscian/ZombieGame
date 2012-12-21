import java.io.*;
import java.util.*;

public class Test {

/*
* Currently implemented is an experiment with gene "evolution".
* One zombie is used to create an initial entry to the the Zomlist.
* The genetic evolution should produce numbers that are closer to 0 (further away from 2^16)
*/
  public static void main (String args[]) /*throws IOException */{
    int num;
/* I edited Uni.java so that it has class methods */
    Uni.rinit(5678);

    Zombie z = new Zombie();
    num = z.translateGene();
    Zomlist.add(num, 63356-num);

    System.out.println("lists after first zombie");
    Zomlist.printFList();
    Zomlist.printSList();

    Zombie[] y = new Zombie[5];

    for(int j=0; j<10000; j++) {
      for (int i=0; i<5; i++) {
        y[i] = new Zombie(-1);
      }

      for(int i=0; i<5; i++) {
        num = y[i].translateGene();
        Zomlist.add(num, 63356-num);
       // System.out.print("y["+i+"]= "+y[i].translateGene()+"\t\t");
      }
     //System.out.println();
    }

    System.out.println("\nLists after all zombies");
    Zomlist.printFList();
    Zomlist.printSList();

  }
}
