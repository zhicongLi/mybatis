package test;

import java.util.ArrayList;
import java.util.List;

public class InstanceTest {

    public static void main(String[] args) {
        List list = new ArrayList<String>();
        if(list instanceof ArrayList){
            System.out.println("true");
        }
        ArrayList<String> arrayList = (ArrayList<String>) list;
    }
}
