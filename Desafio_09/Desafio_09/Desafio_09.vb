'Nome: Robson Mendes de Lima Filho
'e-mail: robsonmendes.dev@gmail.com

'Algoritmo desenvolvido em Vb.NET
Module Module1

    'Tabela problema
    'A 50 3 por 130 terceiro sai por 30 ***** 3º com 40% de desconto ***** será cobrado 60% do valor
    'B 30 2 por 45  segundo  sai por 15 ***** 2º com 50% de desconto ***** será cobrado 50% do valor
    'C 20
    'D 15
    Sub Main()

        Dim vQtd_A, vQtd_B, vQtd_C, vQtd_D, vBarato_A, vBarato_B As Integer
        Dim vValor_A, vValor_B, vValor_C, vValor_D, vValor_Final As Double
        Dim vTotal_Produtos, vFechar_Caixa As String

        'Conforme tabela, o mercado possui 4 produtos, de forma que os valores dos mesmos não devem ser fixos
        Console.WriteLine("SUPER MERCADO: Produtos de A a D !!!")
        Console.WriteLine("_____________________________________________________________________")
        Console.Write("Digite o valor de venda do produto A: ")
        vValor_A = Console.ReadLine

        Console.Write("Digite o valor de venda do produto B: ")
        vValor_B = Console.ReadLine

        Console.Write("Digite o valor de venda do produto C: ")
        vValor_C = Console.ReadLine

        Console.Write("Digite o valor de venda do produto D: ")
        vValor_D = Console.ReadLine
        Console.WriteLine("_____________________________________________________________________")

        vFechar_Caixa = "N"

        While vFechar_Caixa = "N"

            'Produtos devem ser digitados pelos nomes A,B,C e/ou D... ex: (aaabdda)
            Console.WriteLine("")

            Console.Write("Digite os produtos a serem comprados: ")
            vTotal_Produtos = Console.ReadLine
            vTotal_Produtos = UCase(vTotal_Produtos)

            'Contar Produtos 
            Dim vConta_Total_Produtos = 0
            For i = 1 To 4
                vConta_Total_Produtos = vConta_Total_Produtos + 1
                If vConta_Total_Produtos = 1 Then
                    Dim vTotal_A = vTotal_Produtos
                    vTotal_A = vTotal_A.Replace("B", "")
                    vTotal_A = vTotal_A.Replace("C", "")
                    vTotal_A = vTotal_A.Replace("D", "")
                    vQtd_A = Len(vTotal_A)

                ElseIf vConta_Total_Produtos = 2 Then
                    Dim vTotal_B = vTotal_Produtos
                    vTotal_B = vTotal_B.Replace("A", "")
                    vTotal_B = vTotal_B.Replace("C", "")
                    vTotal_B = vTotal_B.Replace("D", "")
                    vQtd_B = Len(vTotal_B)

                ElseIf vConta_Total_Produtos = 3 Then
                    Dim vTotal_C = vTotal_Produtos
                    vTotal_C = vTotal_C.Replace("A", "")
                    vTotal_C = vTotal_C.Replace("B", "")
                    vTotal_C = vTotal_C.Replace("D", "")
                    vQtd_C = Len(vTotal_C)

                ElseIf vConta_Total_Produtos = 4 Then
                    Dim vTotal_D = vTotal_Produtos
                    vTotal_D = vTotal_D.Replace("A", "")
                    vTotal_D = vTotal_D.Replace("B", "")
                    vTotal_D = vTotal_D.Replace("C", "")
                    vQtd_D = Len(vTotal_D)
                End If
            Next

            'Quantidade de produtos com desconto
            vBarato_A = Math.Floor(vQtd_A / 3)
            vBarato_B = Math.Floor(vQtd_B / 2)
            'Quantidade de produtos sem desconto
            vQtd_A = vQtd_A - vBarato_A
            vQtd_B = vQtd_B - vBarato_B

            'Cálculo do valor a ser cobrado
            vValor_Final = (vQtd_A * vValor_A) + (vQtd_B * vValor_B) + (vQtd_C * vValor_C) + (vQtd_D * vValor_D) +
                       (vBarato_A * (0.6 * vValor_A)) + (vBarato_B * (0.5 * vValor_B))

            Console.WriteLine("")
            Console.Write("VALOR TOTAL A COBRAR: " & vValor_Final)
            Console.WriteLine("")

            Console.Write("Deseja fechar o caixa ?  Digite 'N' para continuar ou 'S' para encerrar. ")
            vFechar_Caixa = Console.ReadLine
            vFechar_Caixa = UCase(vFechar_Caixa)
        End While

    End Sub

End Module
