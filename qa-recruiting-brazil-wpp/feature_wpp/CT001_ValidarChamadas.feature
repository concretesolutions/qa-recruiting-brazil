#language:pt
Caracteristica: Desafio do Processo Seletivo de Analista QA da Concrete

Funcionalidade: CT_001 - Realizar chamada de vídeo e voz no Whatsapp

  Contexto:
    Dado que o usuário esteja logado com um numero de celular válido no Whatsapp

  Esquema do Cenário: Validar chamada de video entre duas pessoas
    Quando tocar na aba chamadas
    E toque no ícone de Nova chamada.
    Entao pesquise o "<contato>" para o qual você deseja fazer a chamada tocando no ícone de Chamada de vídeo.

    Exemplos:
      | contato |
      | Teste A |
      | Teste B |

  Esquema do Cenário: Validar chamada de video em grupo pessoas
    Quando tocar na aba chamadas
    E toque no ícone de Nova chamada.
    E pesquise o "<contatoA>" para o qual você deseja fazer a chamada tocando no ícone de Chamada de vídeo.
    Entao adicione o segundo "<contatoB>" na chamada  tocando no ícone "+"

    Exemplos:
      | contatoA | contatoB |
      | Teste A  | Teste B  |
      | Teste C  | Teste D  |

  Esquema do Cenário: Validar mudança de uma chamada de vídeo para uma chamada de voz
    Quando durante a chamada de vídeo, toque no ícone de desativar câmera para notificar "<mensagem>" seu contato.
    Entao seu contato desligar a câmera e a chamada de vídeo passará a ser uma chamada de voz.

    Exemplos:
      | mensagem                    |
      | mudar para a chamada de voz |

  Esquema do Cenário: Validar mudança de uma chamada de voz para uma chamada de vídeo
    Quando durante a chamada de voz, toque em chamada de vídeo no "<mudarChamada>".
    Entao o contato verá uma solicitação "<mensagem>" para mudar para a chamada de vídeo e poderá aceitar a solicitação ou recusá-la.

    Exemplos:
      | mudarChamada | mensagem                      |
      | MUDAR        | mudar para a chamada de video |