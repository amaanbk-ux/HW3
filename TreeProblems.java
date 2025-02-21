/*
 * *** Amaan Khan / 001 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {
  TreeSet<Integer> commonE = new TreeSet<Integer>(setA);

  commonE.retainAll(setB);

  TreeSet<Integer> treeResult = new TreeSet<Integer>(setA);

  treeResult.addAll(setB);

  treeResult.removeAll(commonE);


    return treeResult;
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {
  ArrayList<Integer> keys = new ArrayList<Integer>();

  for(Map.Entry<Integer, String> mapElement : treeMap.entrySet()){
    int k = (int) mapElement.getKey();
    if (k % 2 == 0){
      keys.add(k);
    }
  }
  for (Integer k : keys){
    treeMap.remove(k);
  }

  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1, Map<Integer, String> tree2) {

    if (tree1.size() != tree2.size()) {
      return false;
    }
    for (Map.Entry<Integer, String> mapElement : tree1.entrySet()) {
      int key = (int) mapElement.getKey();
      String tree1Value = mapElement.getValue();
      String tree2Value = tree2.get(key);

      if (!tree1Value.equals(tree2Value)) {
        return false;
      }
    }

    return true;
  }

} // end treeProblems class
