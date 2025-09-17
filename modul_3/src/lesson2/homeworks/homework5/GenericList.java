package lesson2.homeworks.homework5;

import java.util.ArrayList;

public class GenericList <K,V>{
  private ArrayList<K> keys = new ArrayList<>();
  private ArrayList<V> values = new ArrayList<>();
  private int index = 0;

  public void add(K key, V value){
    keys.add(key);
    values.add(value);
    index++;
  }

  public void  get(K key){
    for (int i = 0; i < index; i++) {
      if(keys.get(i).equals(key)) {
        System.out.println(values.get(i));
      }
    }
  }


}
