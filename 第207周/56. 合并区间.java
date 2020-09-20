class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,new Comparator<int[]>(){
            @Override
            public int compare(int[]a,int[]b){
                return a[0]-b[0];
            }
        });
        if(intervals==null||intervals.length==0)
            return new int[0][0];
        int searchIndex=1;
        int ans=0;
        while(searchIndex<intervals.length){
            int[]arr=intervals[searchIndex];
            int[]last=intervals[ans];
            if(last[1]>=arr[0]){
                last[1]=Math.max(last[1],arr[1]);
            }else{
                intervals[++ans]=arr;
            }
            searchIndex++;
        }
        return Arrays.copyOfRange(intervals,0,ans+1);
    }
}
