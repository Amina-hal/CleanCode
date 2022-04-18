package com.capgemini.cleancode.dip;


import java.util.ArrayList;
import java.util.List;

public class Project {
    private List<Developer> developers = new ArrayList<Developer>();


    public void implement() {
        System.out.print("test jenkins");
      for(Developer developer : developers){
          developer.writeCode();
      }
    }
}
