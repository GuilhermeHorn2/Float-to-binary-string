package misc;





public class main_misc {
    
	
	public static void main(String[] args) {
	  
	/*double x = 1.5;
	System.out.println(Math.floor(x));*/
	System.out.println(binary_floating_point(0.125));
	
	  

	 
	}
	public static String binary_floating_point(double n){
		//n is a real number between 0 and 1
		
		
		StringBuilder bits = new StringBuilder();
		bits.append("0.");
		
		int c = 0;
		while(true) {
			
			n *= 2;
			if(Math.floor(n) == 1.0) {
				bits.append(1);
			}
			else if(Math.floor(n) == 0) {
				bits.append(0);
			}
	        if(n == 1.0) {
	        	break;
	        }
			n -= Math.floor(n);//here i want to subtract the non decimal part of n
			c++;
			if(c >= 30) {
				//max of 32 characters,but i have 2 in the initial string(0. + ...).
				return"ERROR";
				
			}
			
			
		}
		
		return bits.toString();
		
	}
	
		
	
	}
	
	
