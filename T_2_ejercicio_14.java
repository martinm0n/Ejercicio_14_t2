package t_2_ejercicio_14;
import java.util.Scanner;

public class T_2_ejercicio_14 {

  
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de las ventas del departamento 1");
        double VD1 = sc.nextDouble();
        System.out.println("Ingrese el valor de las ventas del apartamento 2");
        double VD2 =sc.nextDouble();
        System.out.println("Ingrese el valor de las ventas del apartamento 3");
        double VD3 = sc.nextDouble();
        System.out.println("Ingrese el salario de los vendedores");
        double SALAR = sc.nextDouble();
        double TOTVEN = (VD1 + VD2 + VD3) ;
        double PORVEN = 0.33 * TOTVEN;
        double SALAR1,SALAR2,SALAR3 ;
        if (VD1 > PORVEN){
             SALAR1 = SALAR + 0.2 * SALAR;
        }else{
             SALAR1 = SALAR; 
        }
        if (VD2 > PORVEN){
             SALAR2 = SALAR + 0.2 * SALAR;
        }else{
             SALAR2 = SALAR;
        }
        if (VD3 > PORVEN){
             SALAR3 = SALAR + 0.2 * SALAR;
        }else{
             SALAR3 = SALAR;
        }
        
        System.out.println("Salario vendedores Depto.1: " + SALAR1 );
      
        System.out.println("Salario vendedores Depto.2: "+ SALAR2);
       
        System.out.println("Salario vendedores Depto.3: " + SALAR3 );
        
        
        }
        }
        
               
               
       
        
        
        
        
       
       
