
package ejercicio7;

/**
 *
 * @author dark_
 */
public class Main {


    public static void main(String[] args) {
    Persona[] vectorPersona = new Persona[4];
     
        double bajoPeso = 0;
        double pesoIdeal = 0;
        double sobrePeso = 0;
        double esMayor = 0;
        double esMenor= 0;
        int valor;
        
       
        for (int i = 0; i < 4; i++) {
            vectorPersona[i]= new Persona();
            vectorPersona[i].crearPersona();
            
            System.out.printf("Nombre: %s\n", vectorPersona[i].getNombre()); 
            System.out.printf("Edad: %s\n", vectorPersona[i].getEdad()); 
            System.out.printf("Sexo: %s\n", vectorPersona[i].getSexo()); 
            System.out.printf("Peso: %s\n", vectorPersona[i].getPeso()); 
            System.out.printf("Altura: %s\n", vectorPersona[i].getAltura()); 
            
            
            valor = vectorPersona[i].calcularIMC();
            
            switch (valor){
                case -1:
                bajoPeso++;
                break;
                case 0:
                pesoIdeal++;
                break;
                case 1:
                sobrePeso++;
                break;
            }
            
            if ((vectorPersona[i].esMayorDeEdad()) == true){
                esMayor++;
            } else {
                esMenor++;
            }
        }

        
        System.out.printf("El porcentaje de las personas con bajo peso es %.0f \n", ((bajoPeso/2)*100));
        System.out.printf("El porcentaje de las personas con peso ideal es %.0f \n", ((pesoIdeal/2)*100));
        System.out.printf("El porcentaje de las personas con sobrepeso es %.0f \n", ((sobrePeso/2)*100));
        System.out.printf("El porcentaje de las personas mayores es %.0f \n", ((esMayor/2)*100));
        System.out.printf("El porcentaje de las personas menores es %.0f \n", ((esMenor/2)*100));
        
    
    }
    
}
