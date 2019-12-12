using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using static System.Console;


namespace DesafioConcreteLeo

{
    class Program
    {





        static void Main(string[] args)
        {

            string[] produto = new string[10];
            double item1 = 0;
            double item2 = 0;
            double item3 = 0;
            double item4 = 0;
            double totaGeral = 0;
            double totalItemA = 0;
            double totalItemB = 0;
            double contador = 0;
            double contadoritem2 = 0;
            int valorUnitarioItemA = 50;
            double valorUnitarioItemB = 30;
            double total = 0;
            int mult = 0;
            string[] r = new string[10];
            int[] s = new int[10];
            int[] v = new int[20];
            int[] repeticao = new int[10];
            var j = 0;


            Write($"Seja bem vindo\n");
            Write($" \n");
            Write($" \n");
            Write($"Este projeto tem como função calcular o valor total de 10 itens \n");
            Write($" \n");
            Write($" \n");
            Write($"Vamos começar \n");


            // CLIENTE DEVERÁ INFORMAR 10 ITENS E ESSE FOR QUE CONTROLA OS ITENS 
            for (var i = 0; i < 10; i++)
            {
                Write($"Informe o item {i + 1} \n");
                Write($"1-A , 2-B , 3-C , 4-D                 \n");

                if (!int.TryParse(ReadLine(), out s[i]) || s[i] > 4 || s[i] < 1)
                {
                    Write($"Informe um produto válido \n");
                    i--;
                    continue;
                }

                if (!EhRepetido(v, s[i], j))
                {
                    v[j++] = s[i];

                }


                // REPONSAVEL POR VERIFICAR QUAL ITEM O CLIENTE SELECIONOU 
                switch (s[i])
                {
                    case 1:
                        item1++;
                        break;
                    case 2:
                        item2++;
                        break;
                    case 3:
                        item3++;
                        break;
                    case 4:
                        item4++;
                        break;

                }

            }




            // TOTAL DE ITENS SELECIONADOS 
            double totals = item1 + item2 + item3 + item4;





            /*-------------------------------------------VALIDAÇÃO DO ITEM A------------------------------------------------------------------>*/
            totalItemA = item1;
            if (item1 == 0)
            {
                total = 0;

            }if (item2 == 0)
            {
                    totalItemB = 0;
                    valorUnitarioItemB = 0;
                    contadoritem2 = 0;              
            }


            if (item1 == 1)
            {
                total = 50;

            }

                if (item1 >= 3)
                {

                    while (item1 % 3 != 0)
                    {
                        item1--;
                        contador = contador + 50;
                    }

                    if (item1 % 3 == 0)
                    {


                        for (int i = 0; i < item1; i++)
                        {
                            mult++;
                            valorUnitarioItemA = mult / 3;

                        }

                        valorUnitarioItemA = valorUnitarioItemA * 130;

                    }

                    total = valorUnitarioItemA + contador;
                  
                }
            
                

                /*-------------------------------------------------------------------VALIDAÇÃO DO ITEM B--------------------------------------------------------------*/


              
                if (item2 == 1)
                {
                    valorUnitarioItemB = 30;
                    WriteLine($"VALOR TOTAL A PAGAR É {valorUnitarioItemB}");

                }
                if (item2 >= 2)
                {
                    while (item2 % 2 != 0)
                    {
                        item2--;
                        contadoritem2++;
                    }

                    if (item2 % 2 == 0)
                    {

                        contadoritem2 = contadoritem2 * 30;
                        valorUnitarioItemB = item2 * 22.5;
                        totalItemB = valorUnitarioItemB + contadoritem2;

                    }

              }

                WriteLine($"ITEM A, QUANTIDADE:     {totalItemA }");
                WriteLine($"ITEM B, QUANTIDADE:     {item2 }");
                WriteLine($"ITEM C, QUANTIDADE:     {item3 }");
                WriteLine($"ITEM D, QUANTIDADE:     {item4 }");
                Write($" \n");
                Write($" \n"); ;

                totalItemB = valorUnitarioItemB + contadoritem2;
                totaGeral = total + totalItemB + (item3 * 20) + (item4 * 15);
                WriteLine($"VALOR TOTAL A PAGAR É---------------------------- {totaGeral}");
                WriteLine($"FIM");
                Console.ReadKey();
    


        }
        public static bool EhRepetido(int[] vetor, int item, int posicao)
        {
            for (int i = 0; i < posicao; i++)
                if (vetor[i] == item)


                    return true;
            return false;

        }


    }

}



