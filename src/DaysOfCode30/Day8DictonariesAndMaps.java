package DaysOfCode30;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8DictonariesAndMaps {
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String name = null;
        int phone = 0;
        Map<String, Integer> phoneNumber = new HashMap<String, Integer>();
        
        for(int i = 0; i < n; i++){
            name = in.next();
            phone = in.nextInt();
            phoneNumber.put(name, phone);
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            if(phoneNumber.containsKey(s)) {
                System.out.println(s+"="+phoneNumber.get(s));
            }
            else {
                System.out.println("Not found");
            }
            // Write code here
            
        }
        in.close();
    }
	}

