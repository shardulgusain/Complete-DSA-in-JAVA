// 503. Next Greater Element II
class Solution {
    public int[] nextGreaterElements(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
         int[] result = new int[n];
         for(int i = 2*n - 1; i >= 0; i--)
        { 
            while(!stack.isEmpty() && arr[i % n] >= stack.peek())
            {
                stack.pop();
            }
            if(i < n)
            {
                if(!stack.isEmpty())
                    result[i] = stack.peek();
                else
                    result[i] = -1;  }
            stack.push(arr[i % n]);
        }
        return result;
    }
}