package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {

        List<String> result = new ArrayList<>();

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
