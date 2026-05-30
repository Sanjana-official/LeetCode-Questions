class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        Set<String> ban= new HashSet<>();
        for(String b: banned){
            ban.add(b.toLowerCase());
        }
        Map<String, Integer> mymap= new HashMap<>();
        int start=0;

        paragraph= paragraph.toLowerCase()+" ";
        for(int i=0; i<paragraph.length(); ++i){
            if(!Character.isLetter(paragraph.charAt(i))){
                if(start<i){
                    String temp= paragraph.substring(start,i);
                    if(!ban.contains(temp)){
                      mymap.put(temp,mymap.getOrDefault(temp,0)+1);
                    }
                }
                start=i+1;
            }
        }
        int max=0;
        String ans="";
        
        for(Map.Entry<String, Integer> entry: mymap.entrySet()){
            if(entry.getValue() >max){
                max= entry.getValue();
                ans= entry.getKey();
            }
        }

        return ans;
    }
}
