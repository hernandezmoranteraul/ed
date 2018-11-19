using System;

namespace CSuma
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            Console.Write("Primer número: ");
            string stringPrimerNumero = Console.ReadLine();
            //int primerNumero = int.Parse(stringPrimerNumero);
            decimal primerNumero = decimal.Parse(stringPrimerNumero);
            Console.Write("Segundo número: ");
            string stringSegundoNumero = Console.ReadLine();
            //int segundoNumero = int.Parse(stringSegundoNumero);
            decimal segundoNumero = decimal.Parse(stringSegundoNumero);
            //int suma = primerNumero + segundoNumero;
            decimal suma = primerNumero + segundoNumero;
            Console.Write(suma);

        }
    }
}
