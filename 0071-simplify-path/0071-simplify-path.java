class Solution {
    public String simplifyPath(String path) {
        //store all the name inside the array
        String[] arr = path.split("/");

        //stack to store the name from the array
        Stack<String> st = new Stack<>();

        //we will iterate through each element in the array
        //try to put them inside the stack
        for(int i=0; i<arr.length; i++){
            String curr = arr[i];

            if(curr.equals("") || curr.equals(".")){
                //then skip
                continue;
            }else if(curr.equals("..")){
                // curr is // and st has element at the top 
                if(st.size() > 0){
                    st.pop();
                }
            }else{
                st.push(curr);
            }
        }
        StringBuilder sb = new StringBuilder();

        for(String ele: st){
            sb.append("/");
            sb.append(ele);
        }
        if(sb.length() == 0){
            return"/";
        }else{
            return sb.toString();
        }
    }
}