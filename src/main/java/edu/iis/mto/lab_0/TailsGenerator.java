package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    private List<String> result = new ArrayList<>();

    public List<String> tails(String value) {

        if(value == null){
            return result;
        }

        int sizeOfString = value.length();

        for(int i=0; i<=sizeOfString; i++){
            result.add(value.substring(i,sizeOfString));
        }

        return result;
    }

}
