

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for(int i=0;i<strs.length;i++){

            if(visited[i])
                continue;

            List<String> list = new ArrayList<>();
            list.add(strs[i]);
            visited[i]=true;

            for(int j=i+1;j<strs.length;j++){

                if(!visited[j] && isana(strs[i],strs[j])){
                    list.add(strs[j]);
                    visited[j]=true;
                }
            }

            result.add(list);
        }

        return result;
    }

    private boolean isana(String str1,String str2){

        if(str1.length()!=str2.length())
            return false;

        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);
    }
}