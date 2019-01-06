package DiccionarioRegex;
import java.util.regex.*;
public class Regex 
{
    //Conjunto de todas las letras
    private static final String LETRAS = "(a-z)";
    //Fin de palabra
    private static final String FINPALABRA ="\\b";
    
    //Regex para eliminar los signos de puntuacion
    private static final String PUNTUACION = "\\p{Punct}";
    //Regex para eliminar los digitos
    private static final String DIGITOS = "\\d";
    
    //Regex para sustituir las letras con tildes
    private static final String Atilde = "[á|ä|à]";
    private static final String AtildeRemplazo = "a";
    
    private static final String Etilde ="[é|ë|è]";
    private static final String EtildeRemplazo = "e";
    
    private static final String Itilde ="[í|ï|ì]";
    private static final String ItildeRemplazo = "i";
    
    private static final String Otilde ="[ó|ö|ò]";
    private static final String OtildeRemplazo = "o";
    
    private static final String Utilde ="[ú|ü|ù]";
    private static final String UtildeRemplazo = "u";
    
    //Regex para los articulos
    private static final String Articulo1 = FINPALABRA+"en"+FINPALABRA;
    private static final String Articulo2 = FINPALABRA+"el"+FINPALABRA;
    private static final String Articulo3 = FINPALABRA+"la"+FINPALABRA;
    private static final String Articulo4 = FINPALABRA+"los"+FINPALABRA;
    private static final String Articulo5 = FINPALABRA+"las"+FINPALABRA;
    private static final String Articulo6 = FINPALABRA+"lo"+FINPALABRA;
    private static final String Articulo7 = FINPALABRA+"un"+FINPALABRA;
    private static final String Articulo8 = FINPALABRA+"unos"+FINPALABRA;
    private static final String Articulo9 = FINPALABRA+"una"+FINPALABRA;
    private static final String Articulo10 = FINPALABRA+"unas"+FINPALABRA;
    
    //Regex para los pronombres demostrativos
    private static final String Pronombre1 = FINPALABRA+"((estes|estas)|esto|este|esta)"+FINPALABRA;
    private static final String Pronombre2 = FINPALABRA+"((esos|esas)|ese|eso|esa)"+FINPALABRA;
    private static final String Pronombre3 = FINPALABRA+"((aquellos|aquellas)|aquello|aquella|aquel)"+FINPALABRA;
    
    //Regex para los pronombres posesivos
    private static final String Pronombres4 = FINPALABRA+"(vuestro(s*)|nuestro(s*)|mio(s*)|tuyo(s*)|vuestra(s*)|nuestra(s*)|mia(s*)|tuya(s*)|suya(s*)|suyo(s*))"+FINPALABRA;
    
    //Regex para los pronombres numerales
    private static final String Pronombres5 = FINPALABRA+"((uno|una)(s*)|(dos)|(tres)|(cuatro)|(terceras|terceros)|(segundas|segundos)|(primeras|primeros)|tercera|tercero|segunda|segundo|primera|primero|tercer|primer)"+FINPALABRA;
    
    //Regex para los probombes indefinidos
    private static final String Pronombres6= FINPALABRA+"(alguien|nadie|nada|algo|(un(o|a)(s*))|(algun(o|a)(s*))|(ningun(o|a)(s*))|otr(o|a)(s*)|vari(os|as)|tod(o|a)(s*)|much(o|a)(s*)|poc(o|a)(s*)|bastante(s*)|(para))"+FINPALABRA;
    
    //Regex para los probombres personales
    private static final String Pronombres7= FINPALABRA+"(yo|m(e|i)|con(migo|sigo)|((nos|vos)(otros|otras)*)|t(u|e|i)|el(la|lo)*(s*)|s(e|i)|l(o|a|e)(s*))"+FINPALABRA;
    
    //Regex para sufijos mas usados
    private static final String Sufijos0 =LETRAS+"*(mente)"+FINPALABRA;
    private static final String Sufijos1 =LETRAS+"*(aje)"+FINPALABRA;
    private static final String Sufijos2 =LETRAS+"*((a|e)ncia)"+FINPALABRA;
    private static final String Sufijos3 =LETRAS+"*(ante)"+FINPALABRA;
    private static final String Sufijos4 =LETRAS+"*(a(l|r))"+FINPALABRA;
    private static final String Sufijos5 =LETRAS+"*(ario)"+FINPALABRA;
    private static final String Sufijos6 =LETRAS+"*(cion)"+FINPALABRA;
    private static final String Sufijos7 =LETRAS+"*(dad)"+FINPALABRA;
    private static final String Sufijos8 =LETRAS+"*(eria)"+FINPALABRA;
    private static final String Sufijos9 =LETRAS+"*(ero)"+FINPALABRA;
    private static final String Sufijos10 =LETRAS+"*(ez)"+FINPALABRA;
    private static final String Sufijos11 =LETRAS+"*(ista)"+FINPALABRA;
    private static final String Sufijos12 =LETRAS+"*(ura)"+FINPALABRA;
    
    private static final String Sufijos13 =LETRAS+"*((a|i)(ble))"+FINPALABRA;
    private static final String Sufijos14 =LETRAS+"*((a|i)(do))"+FINPALABRA;
    private static final String Sufijos15 =LETRAS+"*(ano)"+FINPALABRA;
    private static final String Sufijos16 =LETRAS+"*(ense)"+FINPALABRA;
    private static final String Sufijos17 =LETRAS+"*(eño)"+FINPALABRA;
    private static final String Sufijos18 =LETRAS+"*(iento)"+FINPALABRA;
    private static final String Sufijos19 =LETRAS+"*(il)"+FINPALABRA;
    private static final String Sufijos20 =LETRAS+"*(ino)"+FINPALABRA;
    private static final String Sufijos21 =LETRAS+"*(izo)"+FINPALABRA;
    private static final String Sufijos22 =LETRAS+"*(oso)"+FINPALABRA;
    private static final String Sufijos23 =LETRAS+"*(udo)"+FINPALABRA;
    
    private static final String Sufijos24 =LETRAS+"*(ear)"+FINPALABRA;
    private static final String Sufijos25 =LETRAS+"*(ecer)"+FINPALABRA;
    private static final String Sufijos26 =LETRAS+"*(ificar)"+FINPALABRA;
    private static final String Sufijos27 =LETRAS+"*(izar)"+FINPALABRA;
    
    private static final String Sufijos28 =LETRAS+"*(azo)"+FINPALABRA;
    private static final String Sufijos29 =LETRAS+"*(on)"+FINPALABRA;
    private static final String Sufijos30 =LETRAS+"*(ote)"+FINPALABRA;
    
    private static final String Sufijos31 =LETRAS+"*(it(a|o))"+FINPALABRA;
    private static final String Sufijos32 =LETRAS+"*(ill(a|o))"+FINPALABRA;
    private static final String Sufijos33 =LETRAS+"*(ic(a|o))"+FINPALABRA;
    private static final String Sufijos34 =LETRAS+"*(uel(o|a))"+FINPALABRA;
    
    private static final String Sufijos35 =LETRAS+"*(in)"+FINPALABRA;
    private static final String Sufijos36 =LETRAS+"*(ac(o|a))"+FINPALABRA;
    private static final String Sufijos37 =LETRAS+"*(ach(a|o)(n*))"+FINPALABRA;
    private static final String Sufijos38 =LETRAS+"*(ajo)"+FINPALABRA;
    private static final String Sufijos39 =LETRAS+"*(astro)"+FINPALABRA;
    private static final String Sufijos40 =LETRAS+"*(ucho)"+FINPALABRA;
    
    //Regex de prefijos
    private static final String Prefijo1 =FINPALABRA+"(a)"+LETRAS+"*";
    private static final String Prefijo2 =FINPALABRA+"(ante)"+LETRAS+"*";
    private static final String Prefijo3 =FINPALABRA+"(anti)"+LETRAS+"*";
    private static final String Prefijo4 =FINPALABRA+"(b(is*))"+LETRAS+"*";
    private static final String Prefijo5 =FINPALABRA+"(c(on*))"+LETRAS+"*";
    private static final String Prefijo6 =FINPALABRA+"(contra)"+LETRAS+"*";
    private static final String Prefijo7 =FINPALABRA+"(d(es*))"+LETRAS+"*";
    private static final String Prefijo8 =FINPALABRA+"(en)"+LETRAS+"*";
    private static final String Prefijo9 =FINPALABRA+"(entre)"+LETRAS+"*";
    private static final String Prefijo10 =FINPALABRA+"(ex(tra)*)"+LETRAS+"*";
    private static final String Prefijo11 =FINPALABRA+"(hip(er|o))"+LETRAS+"*";
    private static final String Prefijo12 =FINPALABRA+"(in(ter)*)"+LETRAS+"*";
    private static final String Prefijo13 =FINPALABRA+"(post*)"+LETRAS+"*";
    private static final String Prefijo14 =FINPALABRA+"(p*re)"+LETRAS+"*";
    private static final String Prefijo15 =FINPALABRA+"(sub)"+LETRAS+"*";
    private static final String Prefijo16 =FINPALABRA+"(super)"+LETRAS+"*";
    
    public String EliminarPuntuacion(String Texto)
    {
        String resultado;
        //Seteo de los Regex
        Pattern puntuacion = Pattern.compile(PUNTUACION);
        Pattern numeros = Pattern.compile(DIGITOS);
        Pattern Signos = Pattern.compile("(\\s)*[.,\\/#!$%\\^&\\*;:{}=\\-_`~()”“\"…?¿!¡\\[\\]\\\\](\\s)*");
        //Matches con el texto
        //eliminacion de caracteres
        Matcher encaja = puntuacion.matcher(Texto);
        resultado = encaja.replaceAll("");
        //eliminacion de digitos
        encaja = numeros.matcher(resultado);
        resultado = encaja.replaceAll("");
        //Casos especiales
        encaja = Signos.matcher(resultado);
        resultado = encaja.replaceAll("");
        resultado = resultado.replaceAll("-", "");
        resultado = resultado.replaceAll("\\s-\\s", "");
        return resultado;
    }
    public String EliminarTildes(String Texto)
    {
        String resultado;
        //Seteo de los Regex
        Pattern patternAtilde = Pattern.compile(Atilde);
        Pattern patternEtilde = Pattern.compile(Etilde);
        Pattern patternItilde = Pattern.compile(Itilde);
        Pattern patternOtilde = Pattern.compile(Otilde);
        Pattern patternUtilde = Pattern.compile(Utilde);
        //Matches con el texto
        //cambio de de los tildes de a
        Matcher encaja = patternAtilde.matcher(Texto);
        resultado = encaja.replaceAll(AtildeRemplazo);
        //cambio de los tildes de e
        encaja = patternEtilde.matcher(resultado);
        resultado = encaja.replaceAll(EtildeRemplazo);
        //cambio de los tildes i
        encaja = patternItilde.matcher(resultado);
        resultado = encaja.replaceAll(ItildeRemplazo);
        //cambio de los tildes o
        encaja = patternOtilde.matcher(resultado);
        resultado = encaja.replaceAll(OtildeRemplazo);
        //cambio de los tildes u
        encaja = patternUtilde.matcher(resultado);
        resultado = encaja.replaceAll(UtildeRemplazo);   
        return resultado;
    }
    public String EliminarPronombres(String Texto)
    {
        String resultado;
        //Seteo de los Regex de los pronombes
        Pattern patternPronombre1 = Pattern.compile(Pronombre1);
        Pattern patternPronombre2 = Pattern.compile(Pronombre2);
        Pattern patternPronombre3 = Pattern.compile(Pronombre3);
        Pattern patternPronombre4 = Pattern.compile(Pronombres4);
        Pattern patternPronombre5 = Pattern.compile(Pronombres5);
        Pattern patternPronombre6 = Pattern.compile(Pronombres6);
        Pattern patternPronombre7 = Pattern.compile(Pronombres7);
        //Comparacion con los pronombres 1
        Matcher encaja = patternPronombre1.matcher(Texto);
        resultado = encaja.replaceAll("");
        //Comparacion con los probombres 2
        encaja = patternPronombre2.matcher(resultado);
        resultado = encaja.replaceAll("");
        //Comparacion con los pronombres 3
        encaja = patternPronombre3.matcher(resultado);
        resultado = encaja.replaceAll("");
        //Comparacion con los pronombres 4
        encaja = patternPronombre4.matcher(resultado);
        resultado = encaja.replaceAll("");
        //Comparacion con los pronombres 5
        encaja = patternPronombre5.matcher(resultado);
        resultado = encaja.replaceAll("");
        //Comparacion con los pronombres 6
        encaja = patternPronombre6.matcher(resultado);
        resultado = encaja.replaceAll("");
        //Comparacion con los pronombres 7
        encaja = patternPronombre7.matcher(resultado);
        resultado = encaja.replaceAll("");
        return resultado;
    }
    public String EliminarSufijos(String Texto)
    {
        String resultado;
        //Seteo de los Rejex para cada caso de sufijo
        Pattern sufijo0 = Pattern.compile(Sufijos0);
        Pattern sufijo1 = Pattern.compile(Sufijos1);
        Pattern sufijo2 = Pattern.compile(Sufijos2);
        Pattern sufijo3 = Pattern.compile(Sufijos3);
        Pattern sufijo4 = Pattern.compile(Sufijos4);
        Pattern sufijo5 = Pattern.compile(Sufijos5);
        Pattern sufijo6 = Pattern.compile(Sufijos6);
        Pattern sufijo7 = Pattern.compile(Sufijos7);
        Pattern sufijo8 = Pattern.compile(Sufijos8);
        Pattern sufijo9 = Pattern.compile(Sufijos9);
        Pattern sufijo10 = Pattern.compile(Sufijos10);
        Pattern sufijo11 = Pattern.compile(Sufijos11);
        Pattern sufijo12 = Pattern.compile(Sufijos12);
        Pattern sufijo13 = Pattern.compile(Sufijos13);
        Pattern sufijo14 = Pattern.compile(Sufijos14);
        Pattern sufijo15 = Pattern.compile(Sufijos15);
        Pattern sufijo16 = Pattern.compile(Sufijos16);
        Pattern sufijo17 = Pattern.compile(Sufijos17);
        Pattern sufijo18 = Pattern.compile(Sufijos18);
        Pattern sufijo19 = Pattern.compile(Sufijos19);
        Pattern sufijo20 = Pattern.compile(Sufijos20);
        Pattern sufijo21 = Pattern.compile(Sufijos21);
        Pattern sufijo22 = Pattern.compile(Sufijos22);
        Pattern sufijo23 = Pattern.compile(Sufijos23);
        Pattern sufijo24 = Pattern.compile(Sufijos24);
        Pattern sufijo25 = Pattern.compile(Sufijos25);
        Pattern sufijo26 = Pattern.compile(Sufijos26);
        Pattern sufijo27 = Pattern.compile(Sufijos27);
        Pattern sufijo28 = Pattern.compile(Sufijos28);
        Pattern sufijo29 = Pattern.compile(Sufijos29);
        Pattern sufijo30 = Pattern.compile(Sufijos30);
        Pattern sufijo31 = Pattern.compile(Sufijos31);
        Pattern sufijo32 = Pattern.compile(Sufijos32);
        Pattern sufijo33 = Pattern.compile(Sufijos33);
        Pattern sufijo34 = Pattern.compile(Sufijos34);
        Pattern sufijo35 = Pattern.compile(Sufijos35);
        Pattern sufijo36 = Pattern.compile(Sufijos36);
        Pattern sufijo37 = Pattern.compile(Sufijos37);
        Pattern sufijo38 = Pattern.compile(Sufijos38);
        Pattern sufijo39 = Pattern.compile(Sufijos39);
        Pattern sufijo40 = Pattern.compile(Sufijos40);
        //Comparacion de sufijo 0
        Matcher encaja = sufijo0.matcher(Texto);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 1
        encaja = sufijo1.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 2
        encaja = sufijo2.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 3
        encaja = sufijo3.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 4
        encaja = sufijo4.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 5
        encaja = sufijo5.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 6
        encaja = sufijo6.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 7
        encaja = sufijo7.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 8
        encaja = sufijo8.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 9
        encaja = sufijo9.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 10
        encaja = sufijo10.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 11
        encaja = sufijo11.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 12
        encaja = sufijo12.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 13
        encaja = sufijo13.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 14
        encaja = sufijo14.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 15
        encaja = sufijo15.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 16
        encaja = sufijo16.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 17
        encaja = sufijo17.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 18
        encaja = sufijo18.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 19
        encaja = sufijo19.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 20
        encaja = sufijo20.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 21
        encaja = sufijo21.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 22
        encaja = sufijo22.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 23
        encaja = sufijo23.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 24
        encaja = sufijo24.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 25
        encaja = sufijo25.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 26
        encaja = sufijo26.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 27
        encaja = sufijo27.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 28
        encaja = sufijo28.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 29
        encaja = sufijo29.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 30
        encaja = sufijo30.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 31
        encaja = sufijo31.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 32
        encaja = sufijo32.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 33
        encaja = sufijo33.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 34
        encaja = sufijo34.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 35
        encaja = sufijo35.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 36
        encaja = sufijo36.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 37
        encaja = sufijo37.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 38
        encaja = sufijo38.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 39
        encaja = sufijo39.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Comparacion de sufijo 40
        encaja = sufijo40.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        return resultado;
    }
    public String EliminarPrefijos(String Texto)
    {
        String resultado;
        //Seteo de los Regex
        Pattern prefijo1 = Pattern.compile(Prefijo1);
        Pattern prefijo2 = Pattern.compile(Prefijo2);
        Pattern prefijo3 = Pattern.compile(Prefijo3);
        Pattern prefijo4 = Pattern.compile(Prefijo4);
        Pattern prefijo5 = Pattern.compile(Prefijo5);
        Pattern prefijo6 = Pattern.compile(Prefijo6);
        Pattern prefijo7 = Pattern.compile(Prefijo7);
        Pattern prefijo8 = Pattern.compile(Prefijo8);
        Pattern prefijo9 = Pattern.compile(Prefijo9);
        Pattern prefijo10 = Pattern.compile(Prefijo10);
        Pattern prefijo11 = Pattern.compile(Prefijo11);
        Pattern prefijo12 = Pattern.compile(Prefijo12);
        Pattern prefijo13 = Pattern.compile(Prefijo13);
        Pattern prefijo14 = Pattern.compile(Prefijo14);
        Pattern prefijo15 = Pattern.compile(Prefijo15);
        Pattern prefijo16 = Pattern.compile(Prefijo16);
        
        //Eliminacion prefijo 1
        Matcher encaja = prefijo1.matcher(Texto);
        resultado = encaja.replaceAll("");
        
        //Eliminación prefijo 2
        encaja = prefijo2.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Eliminación prefijo 3
        encaja = prefijo3.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Eliminación prefijo 4
        encaja = prefijo4.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Eliminación prefijo 5
        encaja = prefijo5.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Eliminación prefijo 6
        encaja = prefijo6.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Eliminación prefijo 7
        encaja = prefijo7.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Eliminación prefijo 8
        encaja = prefijo8.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Eliminación prefijo 9
        encaja = prefijo9.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Eliminación prefijo 10
        encaja = prefijo10.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Eliminación prefijo 11
        encaja = prefijo11.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Eliminación prefijo 12
        encaja = prefijo12.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Eliminación prefijo 13
        encaja = prefijo13.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Eliminación prefijo 14
        encaja = prefijo14.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Eliminación prefijo 15
        encaja = prefijo15.matcher(resultado);
        resultado = encaja.replaceAll("");
        
        //Eliminación prefijo 16
        encaja = prefijo16.matcher(resultado);
        resultado = encaja.replaceAll("");
        return resultado;
    }
    public String EliminarCaracteresUnitariosResiduales(String Texto)
    {
        String resultado;
        //Eliminacion de caracteres monosilabos residuales
        Pattern Caracter = Pattern.compile("\\b[a-z]{1,3}\\b");
        Matcher encaja = Caracter.matcher(Texto);
        resultado = encaja.replaceAll("");
        //Eliminacion de caracteres especiales
        Pattern Tabuluaciones = Pattern.compile("[\\n|\t]*");
        encaja = Tabuluaciones.matcher(resultado);
        resultado = encaja.replaceAll("");
        //Eliminacion de espacios innecesarios
        resultado = resultado.replaceAll("\\s{1,}", " ");
        resultado = resultado.replaceAll("como", " ");
        resultado = resultado.replaceAll("[«|»]", " ");
        //Eliminacion de espacios al inicio y final
        resultado = resultado.trim();
        return resultado;
    }
}