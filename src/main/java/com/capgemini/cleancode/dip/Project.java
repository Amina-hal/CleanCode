package com.capgemini.cleancode.dip;


import java.util.ArrayList;
import java.util.List;

public class Project {
    private List<Developer> developers = new ArrayList<Developer>();


    public void implement() {
      for(Developer developer : developers){
          developer.writeCode();
      }
    }
}
