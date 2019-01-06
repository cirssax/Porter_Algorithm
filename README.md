# Porter_Algoritm
This is an implementation of the Porter’s Algoritm to make summaries of texts. This algortim has been implement for text in english, but this works for texts in spanish.
It’s use regex expretions for cut the diferents suffix, for example:
We define this public regex:

private static final String Sufijos38 =LETRAS+"*(ajo)"+FINPALABRA;

then on the function that delete that suffix, first it’s makes the pattern:

Pattern sufijo38 = Pattern.compile(Sufijos38);

And finally only repleace with blank space:

encaja = sufijo38.matcher(resultado);
resultado = encaja.replaceAll("");

The proyecte reads an *.txt file