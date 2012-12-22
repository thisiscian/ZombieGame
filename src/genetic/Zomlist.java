import java.io.*;
import java.util.*;

public class Zomlist{
/*
* Create two linked lists, the first is a list of the fitnesses and is ordered by Collections.sort().
* The second is a list of the seed corresponding to those fitness and is managed via the sortArray() method
* static is used everywhere as there should only be one copy of these lists and methods are accessed with 
* Zomlist.[method]
* At the moment the fitness is just an integer and the fitness list contains the largest fitness values with the last
* being the largest. This should be easy to change.
* Duplicate seeds are not stored.
*/
  static LinkedList<Integer> fitnessList = new LinkedList<Integer>();
  static LinkedList<Integer> seedList = new LinkedList<Integer>();
  static Iterator iterator;

/* Constructor does nothing */
  public Zomlist(){
  }

/*
* Method to add values to the Zomlist. This adds the fitness value to the fitness list and then sorts and cuts the tail
* the sortArray() method is then called to sort the seed list
*/
  public static void add(int seed, int fitness) {

    if(-1 == seedList.indexOf(seed)) {
      if(fitnessList.size() < 5) {
        fitnessList.add(fitness);
        Collections.sort(fitnessList);
        sortArray(seed, fitness);
      }
      else if(fitness > fitnessList.getLast()) {
        fitnessList.add(fitness);
        Collections.sort(fitnessList);
        fitnessList.removeFirst();
        sortArray(seed, fitness);
      }
    }
  }

/*
* A method to allow direct adding of a Zombie without first translating the seed.
*/
  public static void add(Zombie z, int fitness) {
    int seed = z.translateGene();
    Zomlist.add(seed, fitness);
  }

/*
* The seedList is sorted by finding the position of the fitness just inserted into the fitnessList and inserting
* the seed in the same place. Removal is done first since add(index) adds such that the position after adding is the index
*/
  private static void sortArray(int seed, int fitness) {
    int position;
    position = fitnessList.indexOf(fitness);
    
    if(position == -1) {
    }
    else if(seedList.size() < 5) {
      seedList.add(position, seed);
    }
    else {
      seedList.removeFirst();
      seedList.add(position, seed);
    }
  }

  public static int size() {
    return fitnessList.size();
  }

  public static void printFList() {
    iterator = fitnessList.iterator();
    System.out.print("Fitness list: ");
    while(iterator.hasNext()) {
      System.out.print(iterator.next()+" ");
    }
    System.out.println();
  }

  public static void printSList() {
    iterator = seedList.iterator();
    System.out.print("Seed list: ");
    while(iterator.hasNext()) {
      System.out.print(iterator.next()+" ");
    }
    System.out.println();
  }

/*
* Randomly selects one of the values from the seed list and returns it
*/
  public static int findSeed() {
    if(fitnessList.size() != 5) {
      int pos = (int) (fitnessList.size()*Uni.uniform());
      return seedList.get(pos);
    }
    else {
      float rnd = Uni.uniform();
      if(rnd < 0.333) {
        return seedList.get(4);
      }
      else if(rnd < 0.6) {
        return seedList.get(3);
      }
      else if(rnd < 0.8) {
          return seedList.get(2);
      }
      else if(rnd < 0.933) {
        return seedList.get(1);
      }
      else {
        return seedList.get(0);
      }
    }
  }
}

