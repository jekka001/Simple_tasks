package main.task8_4;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Runner {
    private static long N = 1_000_000;
    private static final int NUM_THREADS = 8;
    private static int[] array;

    public void run(){
        array = createArray((int)N);
        ForkJoinPool pool = new ForkJoinPool(NUM_THREADS);
        long computedSum = pool.invoke(new RecSumOfN(0, N));
        System.out.printf("Sum for range 1..%d; computed sum = %d", N,computedSum);
    }

    private int[] createArray(int length){
        int[] array = new int[length];
        int max = 100;
        int min = 0;
        Random random = new Random();
        for(int i = 0; i < length; i++) {
            array[i] = min + random.nextInt(max - min + 1);
        }
        return array;
    }

    static class RecSumOfN extends RecursiveTask<Long>{
        long from, to;
        public RecSumOfN(long from, long to){
            this.from = from;
            this.to = to;
        }
        public Long compute(){
            if((to - from) < 20){
                long localSum = 0;
                for(int i = (int)from; i < to; i++)
                    localSum += array[i];
                System.out.printf("\t Summing of range %d to %d is %d %n", from, to, localSum);
                return localSum;
            }else {
                long mid = (to + from) / 2;
                System.out.printf("Forking into two ranges: %d to %d and %d to %d %n", from, mid, mid + 1, to);
                RecSumOfN firstHalf = new RecSumOfN(from, mid);
                firstHalf.fork();
                RecSumOfN secondHalf = new RecSumOfN(mid + 1, to);
                long resultSecond = secondHalf.compute();
                return firstHalf.join() + resultSecond;
            }
        }
    }

}

