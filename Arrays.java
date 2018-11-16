package arrays;
import java.util.ArrayList;


public class Arrays {

    
    public static void main(String[] args) {
        
        
        int numArray[]={3,9,15,20,65,23,18,4,2,14};
        
        System.out.print("Elements: {" );
        
        for(int i = 0; i < numArray.length-1; i++){
            System.out.print(numArray[i]);
            System.out.print(", ");
        
        }
        System.out.print(numArray[numArray.length-1]+"} \n");
        
        

        
        ArrayList<Integer> even = new ArrayList();
        ArrayList<Integer> odd = new ArrayList();
        
        for (int i = 0; i < numArray.length; i++){
            
            if(numArray[i]%2==0){
                even.add(numArray[i]);
            }
            else if(numArray[i]%2!=0){
                odd.add(numArray[i]);
            }
        }
        System.out.println("\nEven"+"\tOdd");
        for(int j=0;j<even.size()&& j< odd.size();j++){
            System.out.println(even.get(j)+"\t"+odd.get(j));
            
        }
        
        if(even.size()>odd.size()){
            int diff=(even.size()-odd.size())+1;
            for(int i=1;i<diff;i++){ 
            System.out.println(""+even.get(even.size()-i));
            }
        }
        if(odd.size() > even.size()){
            int diff=(odd.size()-even.size())+1;
            for(int i=1;i<diff;i++){
                
                System.out.println("\t"+odd.get(odd.size()-i));
                
            }
        }
    }
       
}
    