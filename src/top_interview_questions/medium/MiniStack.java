package top_interview_questions.medium;

public class MiniStack {

    public static void main(String[] args) {
//        MinStack obj = new MinStack();
//        obj.push(val);
//        obj.pop();
//        int param_3 = obj.top();
//        int param_4 = obj.getMin();
        // TODO: 03.10.2022 complete MiniStack problem
    }

    static class MinStack {

        Node top;
        int min;
        public MinStack() {
        }

        public void push(int val) {
            if(top==null) {
                top = new Node();
            }
            else{
                Node lower = new Node();
                lower.val = top.val;
            }
            top.val = val;
            if(val < min){
                min = val;
            }
        }

        public void pop() {
            if(top.lower != null){
                top = top.lower;
            }
            else{
                top = null;
            }
        }

        public int top() {
            return top.val;
        }

        public int getMin() {
            return min;
        }
    }

    public static class Node{
        int val;
        Node lower;
    }
}
