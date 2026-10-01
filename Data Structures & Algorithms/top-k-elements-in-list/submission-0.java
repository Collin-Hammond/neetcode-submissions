class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<>();

        for(int num: nums){
            if(!freq.containsKey(num)){
                freq.put(num,0);
            }
            freq.put(num,freq.get(num)+1);
        }

        List<Integer> bucket[] = new ArrayList[nums.length + 1];

        for(int key: freq.keySet()){
            int count = freq.get(key);

            if(bucket[count] == null){
                bucket[count] = new ArrayList<>();
            }

            bucket[count].add(key);
        }

        int result[] = new int[k];
        int pointer = 0;

        for(int i = bucket.length - 1; i >= 0 && k != pointer; i--){
            if(bucket[i] != null){
                for(int num: bucket[i]){
                    if(k != pointer){
                      result[pointer++] = num;  
                    }

                }
            }
            
        }

        return result;

    }
}