package array2;

import java.util.ArrayList;

public class Array2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int num[]={3,9,15,20,65,23,18,4,2,14};
        
        System.out.println("Elements: {"
        +num[0]+", "
        +num[1]+", "
        +num[2]+", "
        +num[3]+", "
        +num[4]+", "
        +num[5]+", "
        +num[6]+", "
        +num[7]+", "
        +num[8]+", "
        +num[9]+"} ");
        

        
        ArrayList<Integer> even = new ArrayList();
        ArrayList<Integer> odd = new ArrayList();
        
        for (int i = 0; i < num.length; i++){
            
            if(num[i]%2==0){
                even.add(num[i]);
            }
            else if(num[i]%2!=0){
                odd.add(num[i]);
            }
        }
        
        for(int a=0;a<even.size()&& a< odd.size();a++){
            System.out.println(even.get(a)+"\t"+odd.get(a));
        
        }
        
       
    }
    
}
    
