class Solution {
    public String simplifyPath(String path) {
        //store all the name inside the array
        String arr[] = path.split("/");

        //stack to store all the names from arr (array)
        Stack<String> st = new Stack<>();

        for(int i=0; i<arr.length; i++){
            String curr = arr[i];
            if(curr.equals("") || curr.equals(".")){
                //skip
                continue;
            }else if(curr.equals("..")){
                if(st.size()>0){
                    st.pop();
                }
            }else{
                st.push(curr);
            }
        }

        StringBuilder ans = new StringBuilder();
        for(String ele : st){
            ans.append("/");
            ans.append(ele);
        }
        if(ans.length()==0){
            return "/";
        }else{
            return ans.toString();
        }
    }
}