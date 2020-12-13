package PackageTo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ClassComp implements Comparable<ClassComp>{
    public int count;
    public ClassComp(int count)
    {
        this.count=count;
    }
    public int compareTo(ClassComp o)
    {
        return this.count=o.count;
    }



    public static void main(String[] args) {
        ArrayList<ClassComp>classComps=new ArrayList<>();
        classComps.add(new ClassComp(34));
        classComps.add(new ClassComp(121));
        classComps.add(new ClassComp(83));
        Collections.sort(classComps);


    }
}
