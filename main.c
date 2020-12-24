#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

typedef struct sProduto {
	int iCodProd;
	char szNome[64];
	float fValor;
}Produto;

typedef struct sDescontoProduto {
	Produto stProduto;
	int iCodProd;
	int iQtdProdDesconto;
	float fValorDesconto;
} DescontoProduto;

typedef struct sVenda {
	Produto lstProduto[1000];
	float fValorTotal;
	float fValorTotalComDesconto;
	float fTotalDescontado;
	DescontoProduto stDesconto[10];
} Venda;

Produto g_lstProdutos[1000];
int iContProduto = 0;

int iTotalDescontoProd = 0;
DescontoProduto g_lstDescontoProduto[100];

int giContProdVenda;
Venda gstVendas;


void CadastrarProduto(char* szNome, float fValor)
{
	strcpy( g_lstProdutos[iContProduto].szNome, szNome );
	g_lstProdutos[iContProduto].fValor = fValor;
	g_lstProdutos[iContProduto].iCodProd = iContProduto;
	iContProduto++;
}


void MostrarProduto( Produto stProduto ) 
{
	printf( "%s - R$ %.2f ", stProduto.szNome, stProduto.fValor );
}


void MostrarTodosProdutos()
{
	int i;

	printf( "Lista de produtos no estoque\n" );
	for ( i = 0; i < iContProduto; i++ )
	{
		printf("\nCod: %d,", i);
		MostrarProduto(g_lstProdutos[i]);
	}
}


void CadastroDeProdutos()
{
	int iOpt = 0;
	float fValor;
	char szNome[64];

	while ( !iOpt ) {
		puts( "\n\nCadastrar Produto" );
		printf( "Nome: " );
		fflush(stdin);
		gets( szNome );
		printf( "Valor: " );
		scanf( "%f",&fValor );
		CadastrarProduto( szNome, fValor );

		printf("\n\nDeseja continuar cadastrando produtos?\n 0 - Sim / 1 - Não \n");
		scanf("%d", &iOpt);
		
		MostrarTodosProdutos();
	}
}

void CarregarCadastroProdutos()
{
	CadastrarProduto( "Teste1", 1.4 );
	CadastrarProduto( "Teste2", 1.5 );
	CadastrarProduto( "Teste3", 2.3 );
	CadastrarProduto( "Teste4", 7 );
	CadastrarProduto( "Teste5", 0.90 );
}

void MostrarDesconto()
{
	int i;
	
	for (i = 0; i < iTotalDescontoProd; i++ )
	{
		printf("Qtd produto para desconto: %d\n", g_lstDescontoProduto[i].iQtdProdDesconto);
		printf("Preco desconto: %.2f\n", g_lstDescontoProduto[i].fValorDesconto);
		MostrarProduto( g_lstDescontoProduto[i].stProduto );
	}
}


void CadastroDesconto()
{
	int iOpt = 0;
	int iCod = 0;
	int iQtdProdDesc = 0;
	float fPrecoDesc = 0.0; 
	
	MostrarTodosProdutos();
	 
	while (!iOpt) {
		puts("\n\nCadastrar descontos");
		printf("\n\nCódigo do produto: ");
		scanf("%d",&iCod);
		printf("\nValor desconto R$:");
		scanf("%f",&fPrecoDesc);
		printf("Qtd produtos para ter desconto: ");
		scanf("%d", &iQtdProdDesc);
		
		g_lstDescontoProduto[iTotalDescontoProd].stProduto = g_lstProdutos[iCod];
		g_lstDescontoProduto[iTotalDescontoProd].iCodProd = iCod;
		g_lstDescontoProduto[iTotalDescontoProd].fValorDesconto = fPrecoDesc;
		g_lstDescontoProduto[iTotalDescontoProd].iQtdProdDesconto = iQtdProdDesc;
		iTotalDescontoProd++;
		
		MostrarDesconto();
		
		printf("\n\nDeseja cadastrar mais descontos?\n 0 - Sim / 1 - Não \n");
		scanf("%d", &iOpt);
		
	}
}

void MostrarVenda()
{
	int i;
	
	printf("\n\nProdutos na lista \n");
	puts("\n---------------------------");
	for (i=0; i < giContProdVenda; i++ )
	{
		MostrarProduto( gstVendas.lstProduto[i] );
		puts("\n---------------------------");
	}
	printf("\n Valor total: %.2f\n", gstVendas.fValorTotal);
	printf("Voce recebeu R$ %.2f de desconto.", gstVendas.fTotalDescontado );
	printf("\n Total a pagar: %.2f\n", gstVendas.fValorTotalComDesconto);
}

int ContaProdutosDesconto( int iCodProd)
{
	int i;
	int iRet = 0;
	
	for (i = 0; i < giContProdVenda; i++ )
	{
		if ( gstVendas.lstProduto[i].iCodProd == iCodProd ) {
			iRet++;	
		}
	}
	
	return iRet;
}

float CalculaDesconto()
{
	int i;
	int iTotalProd;
	float fRet = 0.0;
	
	for ( i = 0; i < iTotalDescontoProd; i++ )
	{
		iTotalProd = ContaProdutosDesconto( g_lstDescontoProduto[i].iCodProd );
		if ( iTotalProd >= g_lstDescontoProduto[i].iQtdProdDesconto ) {
			int iQntoDesco = iTotalProd / g_lstDescontoProduto[i].iQtdProdDesconto;
			fRet += iQntoDesco * g_lstDescontoProduto[i].fValorDesconto;
		}
	}
	
	return fRet;
}

void Vendas()
{
	int iOpt = 1;
	int iCodProd = 0;
	float fTotalDesconto = 0.0;
	
	giContProdVenda = 0;
	gstVendas.fValorTotal = 0.0;
	
	while ( iOpt )
	{
		MostrarTodosProdutos();
		
		printf("\nAdicionar o produto no carrinho.");
		printf("\nCódigo do produto: ");
		scanf("%d",&iCodProd);
		
		gstVendas.lstProduto[giContProdVenda] = g_lstProdutos[iCodProd];
		gstVendas.fValorTotal += g_lstProdutos[iCodProd].fValor;
		
		giContProdVenda++;

		printf("\n\nFechar as vendas?\n 0 - Sim / 1 - Não \n");
		scanf("%d", &iOpt);
	}
	
	fTotalDesconto = CalculaDesconto();
	
	gstVendas.fTotalDescontado = fTotalDesconto;
	gstVendas.fValorTotalComDesconto = gstVendas.fValorTotal - fTotalDesconto;
	MostrarVenda();
}


int main(int argc, char *argv[]) {
	int iOpt = 0;
	
	CarregarCadastroProdutos();
	
	while (6 != iOpt){
		puts("\n\nOpçoes do sistema");
		puts("1 - Cadastro de produtos");
		puts("2 - Mostrar produtos");
		puts("3 - Cadastro de descontos");
		puts("4 - Mostrar descontos");
		puts("5 - Vendas");
		puts("6 - Sair do sistema");
		printf("Digite a opção: ");
		scanf("%d",&iOpt);
		switch (iOpt){
			case 1:
				CadastroDeProdutos();
				break;
			case 2:
				MostrarTodosProdutos();
				break;
			case 3:
				CadastroDesconto();
				break;
			case 4:
				MostrarDesconto();
				
				break;
			case 5:
				Vendas();
				break;
		}
	}

		
		

return 0;
}

