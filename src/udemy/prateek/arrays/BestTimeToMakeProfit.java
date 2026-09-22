package udemy.prateek.arrays;

public class BestTimeToMakeProfit {

    static void main(String[] args) {
        int nums[]={1,1,2,4,7};
        System.out.println(maxProfit(nums));

    }
    //[7,1,2,4,6]
    public static int maxProfit(int stockProcies[]){
        int answer=0;
        if(stockProcies==null||stockProcies.length==0){
            return  answer;
        }
        int minSofar=stockProcies[0];
        for(int startDayIndex=1;startDayIndex<stockProcies.length;startDayIndex++){
            int profit=stockProcies[startDayIndex]-minSofar;
            if(profit>answer){
                answer=profit;
            }
            minSofar=Math.min(stockProcies[startDayIndex],minSofar);
        }
        return answer;

    }
}
