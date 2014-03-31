package ChiffresRomains;

/**
 * 
 * @author John
 *
 */
public class Roman {
	public int decode(String chiffre){
		int rt = 0;
	    int tmp = 0;
	    
	    String romanNumeral = chiffre.toUpperCase();
	    for (int x = romanNumeral.length() - 1; x >= 0 ; x--) {
	        char convertToDecimal = romanNumeral.charAt(x);

	        switch (convertToDecimal) {
	            case 'M':
	                rt = processDecimal(1000, tmp, rt);
	                tmp = 1000;
	                break;

	            case 'D':
	                rt = processDecimal(500, tmp, rt);
	                tmp = 500;
	                break;

	            case 'C':
	                rt = processDecimal(100, tmp, rt);
	                tmp = 100;
	                break;

	            case 'L':
	                rt = processDecimal(50, tmp, rt);
	                tmp = 50;
	                break;

	            case 'X':
	                rt = processDecimal(10, tmp, rt);
	                tmp = 10;
	                break;

	            case 'V':
	                rt = processDecimal(5, tmp, rt);
	                tmp = 5;
	                break;

	            case 'I':
	                rt = processDecimal(1, tmp, rt);
	                tmp = 1;
	                break;
	        }
	    }
	    return rt;
	}

	private static int processDecimal(int decimal, int lastNumber, int lastDecimal) {
	    if (lastNumber > decimal) {
	        return lastDecimal - decimal;
	    } else {
	        return lastDecimal + decimal;
	    }
	}
}
