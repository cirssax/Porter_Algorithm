package DiccionarioPalabras;

import java.util.Scanner;
import ClaseRegistro.Registro;
import java.util.regex.*;

public class Diccionario 
{
    private Registro Diccionario;
    
    private int LargoTexto(String Texto)
    {//Obtencion de la cantidad de palabras del texto resumido
        int contador=0;
        Scanner scannerTexto = new Scanner(Texto);
        while(scannerTexto.hasNext()) {
            scannerTexto.next();
            contador ++;
        }
        return contador;
    }
    
    public void CrearDiccionario(String Texto)
    {
        if(Texto.length()!=0)
        {
            Diccionario = new Registro(LargoTexto(Texto));//Creacion del diccionario
            String palabra="";
            int ASCII;
            for(int i=0; i<Texto.length(); i++)
            {   
                ASCII = (int)Texto.charAt(i);
                if(ASCII != 32 && ASCII != 45)
                {//Comparacion de ASCII para que sean palabras
                    palabra = palabra + Texto.charAt(i);
                }
                else
                {//Caso en que hay una palabra y se almacena en el diccionario
                    Diccionario.insertarPalabra(palabra);
                    palabra = "";
                }
            }//Obtencion del diccionario
            Diccionario.getDiccionaro();
        }
        else
        {
            System.out.println("Texto demasiado corto");
        }
        
    }
}
