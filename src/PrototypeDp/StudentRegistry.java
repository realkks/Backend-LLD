package PrototypeDp;

import java.util.HashMap;
import java.util.Map;

// This class will be used to store objects.
public class StudentRegistry {
    private Map<String,Student> hm = new HashMap<>();

    public void register(String key, Student s){
        hm.put(key,s);
    }
    public Student get (String key){
        return hm.get(key).copy();               //It will return copy of the object instead of actual object .
    }
}
