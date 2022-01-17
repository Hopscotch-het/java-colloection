import java.util.*;

public class stack{
    public static void main(String args[]){
        Stack<Integer> st =new Stack();
        System.out.println("is stack empty: "+st.isEmpty());

        st.push(1);
        st.push(10);
        st.push(6);
        st.push(4);

        Iterator it =st.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("Searching 6 in stack: "+st.search(6));

        st.pop();
        st.pop();

        System.out.println("After poping 2 elements: "+st);

        System.out.println("top of the stack: "+st.peek());

    }
}
