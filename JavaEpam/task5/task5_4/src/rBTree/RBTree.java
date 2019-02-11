package rBTree;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class RBTree {
    private Map<Integer,Boolean> tree;

    public Map<Integer, Boolean> getTree() {
        return tree;
    }
    public void setTree(Map<Integer, Boolean> tree) {
        this.tree = tree;
    }

    public RBTree() {
        this(new LinkedHashMap<>());
    }

    public RBTree(Map<Integer, Boolean> tree) {
        this.tree = tree;
    }

    public void add(Integer number, Boolean color){

    }

    public int bypass(){
        Set<Integer> elements = tree.keySet();


    }


}
