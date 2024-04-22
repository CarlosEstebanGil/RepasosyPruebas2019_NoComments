
public class Pruebas2 {

	public Pruebas2() {
	}
	
	public static void main(String[] args) {
		
		
		String miString= new String();
		miString = "Original";
		System.out.println(miString);
		miFuncion(miString);
		System.out.println(miString);
		

		System.out.println("------------------------------------");
		
		Pru pru1=new Pru();
		pru1.strPru="original";
		System.out.println(pru1.strPru);
		
		Pru pru2 = pru1; 
						 
		pru2.strPru="modificada";
		System.out.println(pru1.strPru);
		
		System.out.println("------------------------------------");

		pru1.strPru="original";
		
		System.out.println(pru1.strPru);
		
		miFuncion(pru1);
		System.out.println(pru1.strPru);
		
	}
	
	static void miFuncion(String objStr) { 
		objStr="Modificado";			   
	 									   
										   
		
	}
	
	public static class Pru{
		public Pru() {
			
		}
		public String strPru="";
	}
	
	static void miFuncion(Pru objMioPru) { 
		objMioPru.strPru="Modificado";		
	 									   
										   
		
	}

}										   
