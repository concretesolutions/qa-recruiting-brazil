 #language: pt

Funcionalidade: CONVERSAS

	A fim de enviar mensagens de mídia, áudio ou texto
        Os usuários devem ser capazes de criar uma nova conversa individual 
	ou em grupo, visualizar, arquivar ou excluir conversas.

Contexto: Dado que esteja na aba conversas

Cenário: Iniciar uma nova conversa

	Quando eu tocar no ícone para nova conversa
	E selecionar um contato
	Então deve ser exibida a tela para troca de mensagens

Cenário: Excluir uma conversa

	Quando eu selecionar uma conversa
	E realizar a exclusão
	Então a conversa não mais deve ser exibida

Funcionalidade: STATUS

	A fim de visualizar e postar atualizações de conteúdos
        Os usuários devem ser capazes de adicionar atualizações em mídia
        ou texto e visualizar o mesmo tipo de conteúdo originário dos seus contatos salvos.

Esquema do Cenário: Adicionar nova atualização de status com conteúdo de mídia

	Dado que esteja na aba STATUS
	Quando eu tocar em "Meu status"
	E selecionar <origem> como origem da mídia
	E confirmar o envio
	Então o conteúdo deve ficar disponível para visualização

Exemplos:

	|  origem  |
	|  câmera  |
	|  galeria |


