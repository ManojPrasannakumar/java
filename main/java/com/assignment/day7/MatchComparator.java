package com.assignment.day7;

import java.util.Comparator;

public class MatchComparator implements Comparator<Match>{

    @Override
    public int compare(Match o1, Match o2) {
                   if(o1.getNumberOfMatches()==o2.getNumberOfMatches())
                      return 0;
                   else if(o1.getNumberOfMatches()>o2.getNumberOfMatches())
                      return 1;
                   else
                      return -1;
    }

}
