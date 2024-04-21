
public class Pruebas2 {

	public Pruebas2() {
	}
	
	public static void main(String[] args) {
		
		//1) Pruebo que un obj pasa siempre como ref (pero ojo q se genera una copia)
		
		String miString= new String();
		miString = "Original";
		System.out.println(miString);
		miFuncion(miString);
		System.out.println(miString);
		
		//QUE PASA SI QUIERO MODIF EL CONTENIDO DE LA VAR ORIG OSEA NO MODIF EL VAL DE PTRO 
		//ORIG PERO SI TRABAJAR SOBRE EL MISMO ESPACIO DE MEM CON UN PTRO EN OTRA FUNC?:
		
		//Ent:
		System.out.println("------------------------------------");
		
		Pru pru1=new Pru();
		pru1.strPru="original";
		System.out.println(pru1.strPru);
		
		Pru pru2 = pru1; //acá no hay un new de pru2 sino una asignacion directa de ptros 
						 //q trabajaran sobre exactamente la misma memoria! (pru2 y pru1 es "=")
		pru2.strPru="modificada";
		System.out.println(pru1.strPru);
		
		//Pruebo pasando a una func miFuncion2 pero que reciba un obj mio ej un Pru
		//Ent:
		System.out.println("------------------------------------");

		pru1.strPru="original";
		
		System.out.println(pru1.strPru);
		
		miFuncion(pru1);
		System.out.println(pru1.strPru);
		
		//Learning!!!
		//CONCLUSION!: tipos java nativos o incluso xa objetos Java wrappers (x mas q sean objs)
		//				Java crea una copia no asina ptros, Pero si es un obj no wrapper java,
		//				(ahí si asigna ptros y sus atributos internos son los del obj orig 
		//				 q recibe, osea, trabaj sobre la misma mem (modif el orig )! salvo como
		//				decia en tipos nativos (int etc) o wrappers (String, Integer, etc) en q
		//				xa esos Java xq funciona asi, no asigna ptros sino q genera un nuevo espacio
		//				en memoria osea en esos casos no se puede modif la original xq siempre 
		//				pasan x valor (java genera auto una copia ) pero sino los demas objs siempre
		//				pasan por referencia osea q se modifican los atribs del obj orig(misma mem)!
	}
	
	static void miFuncion(String objStr) { //Crea un ptr a un nuevo String (xq lo estoy def acá
		objStr="Modificado";			   //y eso crea, es una def, solo q local a la func
	 									   //y q apunta al mismo contenido (del mismo tipo, osea	
										   //a lo mismo q lo otro pero genera un espacio dist en mem!
		
	}
	
	public static class Pru{
		public Pru() {
			
		}
		public String strPru="";
	}
	
	static void miFuncion(Pru objMioPru) { //Crea un ptr a un nuevo String (xq lo estoy def acá
		objMioPru.strPru="Modificado";			   //y eso crea, es una def, solo q local a la func
	 									   //y q apunta al mismo contenido (del mismo tipo, osea	
										   //a lo mismo q lo otro pero genera un espacio dist en mem!
		
	}

}										   
