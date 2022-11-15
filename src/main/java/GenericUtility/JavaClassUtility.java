package GenericUtility;

import java.util.Random;

import com.graphbuilder.math.func.RandFunction;

public class JavaClassUtility {
	
	public int generaterandomNum() {
		Random ran=new Random();
		int ranNum=ran.nextInt(100);
		return ranNum;
	}
	
	

}
