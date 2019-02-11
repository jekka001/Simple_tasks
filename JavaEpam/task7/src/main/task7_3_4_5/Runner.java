package main.task7_3_4_5;

import java.util.*;
import java.util.function.Predicate;
public class Runner {
    public void run(){
        Integer[] arrInt = createArrayInt(5);//73
        System.out.println("Array: " +
                Arrays.toString(arrInt));
        //Arrays.sort(arrInt,(obj1, obj2)->obj2.compareTo(obj1));
                Arrays.sort(arrInt,Comparator.reverseOrder());
        System.out.println("Sort: " +
        Arrays.toString(arrInt));

        List<String> stringList = createListString();
        System.out.println("List: " + stringList);
        Collections.sort(stringList, Comparator.reverseOrder());
        System.out.println("Sort: " + stringList);

        //74
        System.out.println("-------------------------------");
        //System.out.println("Sum = " + sum(arrInt, x -> x%2 == 0) );
        System.out.println("Sum = " + sum(arrInt,
                x -> x>10 && x%3 == 0) );

        System.out.println("----------------------------------");
        System.out.println("Select: " + selectString(stringList, x->x.startsWith("a")|| x.startsWith("c")));

        //75
        System.out.println("-----------------------------------");
        updateListString(stringList, x -> x.toUpperCase());
        System.out.println("new list: " + stringList);
        List<String> list = Arrays.asList("",null,"   ","  dsssd");
        updateListString(list,String::toUpperCase);
        System.out.println(list);


    }



    private Integer[] createArrayInt(int size){
        Integer[] array = new Integer[size];
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(20);
        }
        return array;
    }

    private List<String> createListString(){
        List<String> list = new ArrayList<>();
        for (char ch = 'a'; ch <='z' ; ch++){
            list.add("" + ch + ch);
        }
        Collections.shuffle(list);
        return list;
    }

    private int sum(Integer[] array, Predicate<Integer> filter){
        int ss = 0;
        for(Integer value : array){
            if(filter.test(value))
                ss +=value;
        }
        return ss;
    }

    private List<String> selectString(List<String> list,
                                      Predicate<String> filter){
        List<String> newList = new ArrayList<>();
            for(String value : list)
                if(filter.test(value)){
                    newList.add(value);
                }
        return newList;
    }

    public void updateListString(List<String> list, ConvertString convert){
        for(int i = 0; i < list.size(); i++){
            if(!convert.isNull(list.get(i))) {
                list.set(i, convert.convert(list.get(i)));
            }
        }
    }

}

