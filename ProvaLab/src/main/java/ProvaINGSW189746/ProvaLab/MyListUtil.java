package ProvaINGSW189746.ProvaLab;

import java.util.Arrays;

public class MyListUtil {


	static int[] ordina(int v[],Boolean scelta) {
		int [] vOrdinato=v;
		Arrays.sort(vOrdinato);
		for(int i=0;i<vOrdinato.length;i++) {
			 System.out.println(vOrdinato[i]);
		}
		if(scelta==true)
			return vOrdinato;
		else {
			int temp;
			int len=vOrdinato.length;
			for(int i=0;i<len/2;i++) {
				temp=vOrdinato[i];
				vOrdinato[i]=vOrdinato[len-i-1];
				vOrdinato[len-i-1]=temp;
				
			}
		}
			
		
		return vOrdinato;
	}
	
}
