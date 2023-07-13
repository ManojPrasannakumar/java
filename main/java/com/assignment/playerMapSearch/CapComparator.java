package com.assignment.playerMapSearch;

import java.util.Comparator;

public class CapComparator implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
                   if(o1.getCapNumber()==o2.getCapNumber())
                      return 0;
                   else if(o1.getCapNumber()>o2.getCapNumber())
                      return -1;
                   else
                      return 1;
    }

}
