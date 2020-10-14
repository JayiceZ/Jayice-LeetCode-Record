class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<int[]>queue=new PriorityQueue<int[]>(new Comparator<int[]>(){
            public int compare(int[]a,int[]b){
                return a[1]-b[1];
            }
        });

        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            int key=entry.getKey();
            int value=entry.getValue();
            int[]arr=new int[2];
            arr[0]=key;
            arr[1]=value;
            if(queue.size()==k){
                if(queue.peek()[1]<value){
                    queue.poll();
                    queue.offer(arr);
                }
            }else{
                queue.offer(arr);
            }
        }

        int[]ans=new int[k];
        int index=0;
        while(queue.size()!=0){
            ans[index++]=queue.poll()[0];
        }
        return ans;
    }
}