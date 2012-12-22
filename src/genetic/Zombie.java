import java.io.*;
import java.util.*;

public class Zombie{
/* Each zombie object will have a gene with 16 bits */
  private int[] gene = new int[16];

/* Called with no brackets just assigns a random gene to this zombie*/
  public Zombie() {
    initialiseGene();
  }

/*
* Called with a seed will assign that zombie the corresponding gene, -1 will select from the Zomlist and evolve it
* error handling not dealt with so I don't know what will happen if the Zomlist is empty for example
*/
  public Zombie(int seed) {
    if(-1 == seed) {
      seed = Zomlist.findSeed();
    }
    interpretSeed(seed);
    evolveGene();
  }

/* Method to give the zombie an initial random gene */
  public void initialiseGene() {
    for(int i=0; i<gene.length; i++){
      gene[i] = (int) (2*Uni.uniform());
    }
  }

  public void printGene() {
    for(int i=0; i<gene.length; i++){
      System.out.print(gene[i]+" ");
    }
    System.out.println();
  }

/* Handles the evolution! Currently changes up to 2 sites with a probability of 0.2.*/
  public void evolveGene() {
    int site;
    float r;

    for(int j=0; j<2; j++) {
      site = (int) (gene.length*Uni.uniform());
      r = Uni.uniform();
      if(r > 0.8) {
        gene[site] = 1 - gene[site];
      }
    }
  }

/* returns the seed corresponding to the gene of the current zombie */
/* could probably be made better by not having to compute all the divisions and powers of 2 every time */
  public int translateGene() {
    int seed = 0;
    for(int i=0; i<gene.length; i++) {
      seed += gene[i]*Math.pow(2, i);
    }

    return seed;
  }

/* assigns a gene to the current zombie given a seed*/
  public void interpretSeed(int seed) {
    for(int i=gene.length-1; i>=0; i--) {
      gene[i] = (int) (seed/Math.pow(2,i));
      if(gene[i] == 1) {
        seed = seed - (int) Math.pow(2,i);
      }  
    }
  }
}
