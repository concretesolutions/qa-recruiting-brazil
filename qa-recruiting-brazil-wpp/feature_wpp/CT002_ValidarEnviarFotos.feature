#language:pt
Caracteristica: Desafio do Processo Seletivo de Analista QA da Concrete

Funcionalidade: CT_002 - Realizar envio de fotos

  Contexto:
    Dado que o usuário esteja logado com um numero de celular válido no Whatsapp
    Quando tocar na opção fotos e vídeos

  Esquema do Cenario: Validar envio de fotos
    E escolha a "<foto>" preferida clicando no botão "+" selecionar uma "<qtd_fotos>"
    Então a "<qtd_fotos>" de fotos deve ser exibida!

    Exemplos:
      | foto         | qtd_fotos |
      | imageTeste1  | 1         |
      | imageTeste5  | 3         |
      | imageTeste10 | 5         |

  Esquema do Cenario: Validar envio acima de 30 fotos
    E escolha a "<foto>" preferida clicando no botão "+" selecionar uma "<qtd_fotos>"
    Então uma "<mensagem>" de fotos deve ser exibida!

    Exemplos:
      | foto         | qtd_fotos | mensagem                         |
      | imageTeste30 | 30        | Você só pode enviar até 30 fotos |