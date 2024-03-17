
import java.util.*;


public class balanced_parantheseis {
    public static void main(String[] args) { 
    ArrayDeque<Character> s1 = new  ArrayDeque<>();
        String str = "(())";
        char[] ch = str.toCharArray();
        System.out.println(ch);
        boolean a=true;
        for (int i=0;i<ch.length;i++){
            if (ch[i]=='('){
                s1.add('(');
            }
            else{
                if (ch[i] == ')')
                    if (s1.isEmpty()){
                        a = false;
                        break;
                    }
                    else{ 
                        s1.pop();
                    }
                    
                else{
                    System.out.println("invalid expression");
                }
            }
        }
        if (a==true){
            System.out.println("It is a balanced paranthesis");
        }
        else{
            System.out.println("It is a unbalanced paranthesis");
        }

        
    }

    
            
}
        
    

