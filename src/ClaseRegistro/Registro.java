package ClaseRegistro;
import java.io.*;

public class Registro 
{
    private int[] Cantidad;
    private String[] Palabra;
    
    public Registro(int Cantidad)
    {
        this.Cantidad = new int[Cantidad];
        this.Palabra = new String[Cantidad];
        for(int i=0; i<Cantidad; i++)
        {
            this.Cantidad[i]=0;
            this.Palabra[i]="%";
        }
    }

    public void insertarPalabra(String palabra)
    {
        //Flag para controlar si esta la palabra
        boolean Flag=false;
        //Recorrido del diccionario para encontrar la palabra
        for(int i=0; i<this.Palabra.length; i++)
        {
            if(this.Palabra[i].equals(palabra))
            {//Caso en que esta la palabra
                Flag = true;
                this.Cantidad[i] = this.Cantidad[i]+1;
            }
        }
        if(!Flag)
        {//Caso en que no esta la palabra
            for(int i=0; i<this.Palabra.length; i++)
            {
                if(this.Palabra[i] == "%")
                {
                    this.Palabra[i]=palabra;
                    this.Cantidad[i] = this.Cantidad[i]+1;
                    break;
                }
            }
        }
    }
    public void getDiccionaro()
    {
        int i=0;
        for(i=0; i<this.Palabra.length; i++)
        {
            if(this.Palabra[i].equals("%"))
                break;
        }
        QuickSort(this.Cantidad, this.Palabra, 0, i-1);//Ordenamiento del diccionario
        FileWriter ficheronuevo = null;
        PrintWriter pw = null;
        try
        {//Almacenamiento de las 10 palabras mas repetidas en un fichero
            ficheronuevo = new FileWriter("Diccionario.txt");
            pw = new PrintWriter(ficheronuevo);
            for(int j=i-1; j>(i-11); j--)
            {
                if(this.Palabra[j]=="%")
                    break;
                pw.print("Palabra: "+this.Palabra[j]+"   Cantidad: "+this.Cantidad[j]+"\n");
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
                if (null != ficheronuevo)
                   ficheronuevo.close();
           } 
           catch (Exception e2) 
           {
              e2.printStackTrace();
           }
        }
        System.out.println("Diccionario exportado");
    }
    
    private void QuickSort(int a[], String s[] , int l, int u)
    {
        int j;
        if(l<u)
        {
            j=partition(a, s,l,u);
            QuickSort(a,s ,l,j-1);
            QuickSort(a,s ,j+1,u);
        }
    }
    
    private int partition(int a[], String s[] ,int l,int u)
    {
        int v,i,j,temp;
        String c, b;
        v=a[l];
        b=s[1];
        i=l;
        j=u+1;
        do
        {
            do
                i++;
            while(a[i]<v&&i<=u);
            do
                j--;
            while(v<a[j]);
            if(i<j)
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;  
                
                c = s[i];
                s[i] = s[j];
                s[j] = c;
            }
        }while(i<j);
        s[1]=s[j];
        a[l]=a[j];
        a[j]=v;
        s[j]=b;
        return(j);
    }
}
