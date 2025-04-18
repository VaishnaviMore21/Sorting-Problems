class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long sum=0;
        int n=happiness.length;
        int turns=0;
        for(int i=n-1;i>=0;i--)
        {
            sum=sum+Math.max(happiness[i]-turns,0);
            turns++;
            if(turns>=k)break;

        }
        return sum;

    }
}
