import java.util.Random;

public class trialApp {

		public static void main (String[] arg) {
				int[] s = {10,20,30,50,100,120,130,140,150,160,170,180,190,200,300};
				int[] n = {1000,2000,3000,10000,20000,30000};
				Random rand = new Random();
				int[] seeds = new int[]{100,200,300,400,500};
			    
				for (int i = 0; i < n.length; i++) {
					int size = n[i];
					System.out.println("=========MODIFIED MERGESORT=========");
					System.out.println("n is " + size);
					int[] arr = new int[size];
					       
					for(int j=0; j < s.length; j++) {

						System.out.println("s = " + s[j]);
						int S = s[j];
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
								IntegSort.mergeSort(arr1, 0, size-1, S);
								time = System.nanoTime()- time;
								totalTime += time;
								totalComp += IntegSort.count;
								IntegSort.count = 0;
								}
						}
 
						double avgComp = (double)totalComp/500;
						double avgTime = (double)totalTime/500;

						System.out.println("Average number of key comparisons is: " + avgComp);
						System.out.println("Average CPU time is: " + avgTime + "ns");
			       
				}
			}
		}
}
