import java.util.*;

public class KnapSack {
    //easy code
    static double fractionalKnapsack(int val[], int weight[], int n, int m)
    {
      double sum=0;int j=-1;
         while(m>=0)  
          {  
              double max=0;  
              for(int i=0;i<n;i++)  
              {  
                  if(((double)val[i])/((double)weight[i])>max)  
                  {  
                      max=((double)val[i])/((double)weight[i]);  
                      j=i;  
                  }  
              }  
              if(weight[j]>m)  
              {  
                  sum+=m*max;  
                  m=-1;  
              }  
              else  
              {  
                  m-=weight[j];  
                  sum+=(double)val[j];  
                  val[j]=0;  
              }  
          } 
      return sum; 
    }

    private static double getMaxValue(int[] wt, int[] val,
            int capacity) {
        ItemValue[] iVal = new ItemValue[wt.length];

        for (int i = 0; i < wt.length; i++) {
            iVal[i] = new ItemValue(wt[i], val[i], i);
        }

        // sorting items by value;
        Arrays.sort(iVal, new Comparator<ItemValue>() {
            @Override
            public int compare(ItemValue o1, ItemValue o2) {
                return o2.cost.compareTo(o1.cost);
            }
        });

        double totalValue = 0d;

        for (ItemValue i : iVal) {

            int curWt = (int) i.wt;
            int curVal = (int) i.val;

            if (capacity - curWt >= 0) {
                // this weight can be picked while
                capacity = capacity - curWt;
                totalValue += curVal;
            } else {
                // item cant be picked whole
                double fraction = ((double) capacity / (double) curWt);
                totalValue += (curVal * fraction);
                capacity = (int) (capacity - (curWt * fraction));
                break;
            }
        }

        return totalValue;
    }

    // item value class
    static class ItemValue {
        Double cost;
        double wt, val, ind;

        // item value function
        public ItemValue(int wt, int val, int ind) {
            this.wt = wt;
            this.val = val;
            this.ind = ind;
            cost = new Double((double) val / (double) wt);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int val[] = new int[n];
        int wt[] = new int[n];
        for (int i = 0; i < n; i++) {
            val[i] = scn.nextInt();
        }
        for (int i = 0; i < n; i++) {
            wt[i] = scn.nextInt();
        }
        int cap = scn.nextInt();
        double maxValue = getMaxValue(wt, val, cap);
        System.out.println(maxValue);
        scn.close();
    }

}