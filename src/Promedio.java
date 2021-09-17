import java.util.Scanner;
public class Promedio {

    public static void main (String[]args){

    
    Scanner s=new Scanner(System.in);

        String Nombre;
        int Calificaciones[] = new int [5];
        float promedio;
        int suma=0;
        
        System.out.println("Calificaciones \n");
        System.out.println("Dijite su Nombre: ");
        Nombre = s.nextLine();
        System.out.println("Dijite su primer calificacion: ");
        Calificaciones[0]=s.nextInt();
        

        System.out.println("Dijite su segunda calificacion: ");
        Calificaciones[1]=s.nextInt();
        

        System.out.println("Dijite su tercer calificacion: ");
        Calificaciones[2]=s.nextInt();
        

        System.out.println("Dijite su cuarta calificacion: ");
        Calificaciones[3]=s.nextInt();
        

        System.out.println("Dijite su quinta calificacion: ");
        Calificaciones[4]=s.nextInt();
        

        for(int i=0; i<Calificaciones.length; i++){
            suma+=Calificaciones[i];
        }
        promedio = (suma/Calificaciones.length);
        System.out.println("Nombre del estudiante: " + Nombre);
        System.out.println("Calificación 1: " + Calificaciones[0]);
        System.out.println("Calificación 2: " + Calificaciones[1]);
        System.out.println("Calificación 3: " + Calificaciones[2]);
        System.out.println("Calificación 4: " + Calificaciones[3]);
        System.out.println("Calificación 5: " + Calificaciones[4]);
        System.out.println("Su promedio es: " + promedio);

        if(promedio >= 0 && promedio <= 50){
            System.out.println("Su calificación es : F");
        }else if(promedio >= 51 && promedio <= 60){
                System.out.println("Su calificación es : E");
            }else if(promedio >= 61 && promedio <= 70){
                    System.out.println("Su calificación es : D");
                }else if(promedio >= 71 && promedio <= 80){
                        System.out.println("Su calificación es : C");
                    }else if(promedio >= 81 && promedio <= 90){
                            System.out.println("Su calificación es : B");
                        }else if(promedio >= 91 && promedio <= 100){
                            System.out.println("Su calificación es : A");
            }
            }
        
    }
    
    

        
        

        
 
 
     
         
             
         
     
 
 
    
