package algporter;
import DiccionarioPalabras.Diccionario;
import java.util.regex.*;
import java.io.*;
import DiccionarioRegex.Regex;
public class AlgPorter 
{
    public static void CrearArchivoDiccionario()
    {
        String Titulo = "Diccionario.txt";
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(Titulo);
            System.out.println("Archivo: "+Titulo+" creado");
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
           try 
           {
                if (null != fichero)
                   fichero.close();
           } 
           catch (Exception e2) 
           {
              e2.printStackTrace();
           }
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException 
    {        
        Regex x = new Regex();
        Diccionario d = new Diccionario();
        CrearArchivoDiccionario();
        String cadena, archivo="Texto4.txt", aux=""; //Here you can select the text
        FileReader f = new FileReader(archivo);
        try (BufferedReader b = new BufferedReader(f)) 
        {
            while((cadena = b.readLine())!=null) 
            {
                aux = aux+cadena;
            } 
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
           try 
           {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
            if (null != f)
              f.close();
           } 
           catch (Exception e2) 
           {
              e2.printStackTrace();
           }
        }
        //String aux = "";
        aux = aux.toLowerCase();
        System.out.println("Texto convertido a letras minusculas");
        aux = x.EliminarCaracteresUnitariosResiduales(aux);
        System.out.println("Eliminacion de monosilabos");
        aux = x.EliminarPuntuacion(aux);
        System.out.println("Eliminacion de signos de puntuación");
        aux = x.EliminarTildes(aux);
        System.out.println("Eliminación de carateres con tildes");
        aux = x.EliminarPronombres(aux);
        System.out.println("Eliminación de pronombres");
        aux = x.EliminarSufijos(aux);
        System.out.println("Eliminación de sufijos");
        //aux = x.EliminarPrefijos(aux);
        //System.out.println("Eliminacion de prefijos");
        aux = x.EliminarCaracteresUnitariosResiduales(aux);
        System.out.println("Eliminación de caracteres residuales");
        System.out.println("Inicio de creación de diccionario");
        d.CrearDiccionario(aux);
        
    }
    
}
