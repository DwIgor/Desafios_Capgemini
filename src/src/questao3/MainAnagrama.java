package src.questao3;



public class MainAnagrama {
	 public static void main(String[] args) 
	    {
	        String str = "ovo"; 
	        
	        
	        int size = str.length(); 
	        Anag a = new Anag(); 
	        StringUt c = new StringUt();
	        a.anagm(str, 0, size - 1);
	               
	        c.compararSubstring(c.geradorNSubstring(str));
	
		}
	}
