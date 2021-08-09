class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> hasil = new ArrayList<>();
        List<Integer> subList;
            
        for(int i = 0; i < numRows; i++){
            subList = new ArrayList<>();
            for(int j = 0; j < i+1; j++){
                if(i >= 2 && (j > 0 && j < i)){
                    subList.add(hasil.get(i-1).get(j-1)+hasil.get(i-1).get(j));
                }
                else{
                    subList.add(1);
                }
            }
            hasil.add(subList);
        }
        return hasil;
    
    }
}
