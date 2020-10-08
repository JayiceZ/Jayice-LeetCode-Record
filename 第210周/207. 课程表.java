class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[]count=new int[numCourses];
        List<List<Integer>>list=new ArrayList(numCourses);
        for(int i=0;i<numCourses;i++){
            list.add(new ArrayList());
        }
        for(int[] nums:prerequisites){
            count[nums[0]]++;
            list.get(nums[1]).add(nums[0]);
        }
        Queue<Integer>queue=new LinkedList();
        for(int i=0;i<count.length;i++){
            if(count[i]==0){
                queue.add(i);
            }
        }
        while(queue.size()!=0){
            numCourses--;
            int num=queue.poll();
            List<Integer>temp=list.get(num);
            for(int i=0;i<temp.size();i++){
                int val=temp.get(i);
                if(--count[val]==0){
                    queue.add(val);
                }
            }
        }
        return numCourses==0;
    }
}