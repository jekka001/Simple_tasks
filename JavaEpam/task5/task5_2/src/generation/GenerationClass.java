package generation;

import javax.naming.OperationNotSupportedException;
import java.util.*;

public class GenerationClass {
    private int leng;
    private int min;
    private int max;
    private Random random;

    public int getLeng() {
        return leng;
    }
    public void setLeng(int leng) {
        this.leng = leng;
    }
    public int getMin() {
        return min;
    }
    public void setMin(int min) {
        this.min = min;
    }
    public int getMax() {
        return max;
    }
    public void setMax(int max) {
        this.max = max;
    }

    public GenerationClass() {
        this(0,0,0);
    }

    public GenerationClass(int leng, int min, int max) {
        this.leng = leng;
        this.min = min;
        this.max = max;
        random = new Random();
    }

    public List<Integer> generList(){
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < leng; i++)
            result.add(random.nextInt(max - min + 1) + min);
        return result;
    }

    public Set<Integer> generSet() throws OperationNotSupportedException {
        Set<Integer> result = new TreeSet<>();
        if( max - min > leng) {
            for (int i = 0; i < leng; i++) {
                int temp = random.nextInt(max - min + 1) + min;
                if(result.contains(temp))
                    i--;
                else
                    result.add(temp);
            }
        }else{
            throw new OperationNotSupportedException();
        }
        return result;
    }

}
