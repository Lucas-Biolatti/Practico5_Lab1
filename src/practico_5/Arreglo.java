
package practico_5;

public class Arreglo {

    public Arreglo() {
    }
    
    
    
    public static void sumarLista(int lista[]){
        int total=0;
        for(int i=0;i< lista.length;i++){
         total+=lista[i];
             
          }
        System.out.println("La suma es: "+total);
        System.out.println("El promedio es: "+total/lista.length);
     }
    
   public static void buscarMayor(int lista[]){
        int mayor=lista[0];
        for(int i=0;i<lista.length;i++){
          if(mayor<lista[i]){
              mayor=lista[i];
          }  
        }
    
       System.out.println("El numero mayor es: "+mayor);
    } 
    
   public static void cuantasVocales(String f){
     int vocales=0;
     char[] x= new char[f.length()];
     
      for(int i=0;i<x.length;i++){
          x[i]=f.charAt(i);
         }
    
      for(int i=0;i<x.length;i++){
     
        switch (x[i]){
            case 'a':{vocales++;} break;
            case 'e':{vocales++;} break;
            case 'i':{vocales++;} break;
            case 'o':{vocales++;} break;
            case 'u':{vocales++;} break;
            case 'A':{vocales++;} break;
            case 'E':{vocales++;} break;
            case 'I':{vocales++;} break;
            case 'O':{vocales++;} break;
            case 'U':{vocales++;} break;
            default:{}
          
         }
      }
        System.out.println("La frace cuenta con: "+vocales);
    }
    
    
    

    }


