import java.util.Random;

public class mergeApp {
    public static void main (String[] arg) {
        int[] n = {1000,2000,3000,4000,5000,10000,20000,30000,40000,50000,70000,90000,100000,200000,400000,600000,800000,1000000};
        Random rand = new Random();
        int[] seeds = new int[]{100,200,300,400,500};

        for (int i = 0; i < n.length; i++) {
            int size = n[i];
            System.out.println("=========MODIFIED MERGESORT=========");
            System.out.println("n is " + size);
            int[] arr = new int[size];
                long totalTime = 0;
                int totalComp = 0;
                int[] arr1 = new int[size];
                for(int k=0; k<5; k++){

                    rand.setSeed(seeds[k]);
                    for(int z=0; z < size; z++)
                        arr[i] = rand.nextInt(size);

                    for(int count=0; count<100; count++) {
                        for(int m =0; m<size; m++) {
                            arr1[i] = arr[i]; }

                        long time = System.nanoTime();
                        IntegSort.mergeSort(arr1, 0, size-1, 10);
                        time = System.nanoTime()- time;
                        totalTime += time;
                        totalComp += IntegSort.count;
                        IntegSort.count = 0;
                    }
                }

                double avgComp = (double)totalComp/500;
                double avgTime = (double)totalTime/500;
                System.out.println("s = 10");
                System.out.println("Average number of key comparisons is: " + avgComp);
                System.out.println("Average CPU time is: " + avgTime + "ns");
            }

        for (int i = 0; i < n.length; i++) {
            int size = n[i];
            System.out.println("=========ORIGINAL MERGESORT=========");
            System.out.println("n is " + size);
            int[] arr2 = new int[size];
            long totalTime1 = 0;
            int totalComp1 = 0;
            int[] arr1 = new int[size];
            for(int k=0; k<5; k++){

                rand.setSeed(seeds[k]);
                for(int z=0; z < size; z++)
                    arr1[i] = rand.nextInt(size);

                for(int count=0; count<100; count++) {
                    for(int m =0; m<size; m++) {
                        arr2[i] = arr1[i]; }

                    long time = System.nanoTime();
                    MergeSort.mergeSort(arr2, 0, size-1);
                    time = System.nanoTime()- time;
                    totalTime1 += time;
                    totalComp1 += MergeSort.count1;
                    MergeSort.count1 = 0;
                }
            }

            double avgComp1 = (double)totalComp1/500;
            double avgTime1 = (double)totalTime1/500;
            System.out.println("s = 10");
            System.out.println("Average number of key comparisons is: " + avgComp1);
            System.out.println("Average CPU time is: " + avgTime1 + "ns");

        }
        }
    }
