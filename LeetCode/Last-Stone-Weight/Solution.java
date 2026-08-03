1class Solution {
2    public int lastStoneWeight(int[] stones)
3     {
4        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
5        for(int i=0;i<stones.length;i++)
6        {
7            pq.add(stones[i]);
8        }
9        int t3=0;
10        while(pq.size()>1)
11        {
12            int t1=pq.remove();
13            int t2=pq.remove();
14            if(t1!=t2)
15             { 
16                t3=t1-t2;
17              pq.add(t3);
18             }
19            
20        }
21        if(pq.isEmpty())
22        return 0;
23        else
24        return pq.peek();
25    }
26}