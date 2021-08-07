package test.sogeti;

public class TestSogeti {

	public static int getNearToZero(int[] ints) {
		
		if(ints==null || ints.length==0 ) return 0;
		
		int near_zero = ints[0];

		for(int i = 0;i<ints.length;i++)
		   if( Math.abs(ints[i]) < Math.abs(near_zero) ) 
			   if(ints[i] == -near_zero) 
				   near_zero = Math.abs(ints[i]);
			   
			   else
				   near_zero = ints[i];
		return near_zero;
		   
		

	}

}
