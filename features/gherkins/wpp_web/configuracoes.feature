# language:pt

Funcionalidade: Whatsapp Web - Validar alterações de configuração no menu
  Eu como um usuário final do whatsapp web
  Quero poder chegar no menu de configurações
  Para que seja possível realizar alterações de tema e notificações

  Contexto:
    Dado que estou logado no whatsapp web
    E seleciono "Configurações" em "Mais opções"

  @alterar_tema
  Esquema do Cenário: Validar alteração de tema no menu de configuração
    E clico em "Tema"
    Quando seleciono o tema <tema>
    Então valido que a configuração de tema foi alterada para o tema <tema>

    Exemplos:
      | tema   |
      | escuro |
      | claro  |

  @desativar_notificoes_e_sons
  Esquema do Cenário: Validar alteração de desativar notificações e sons por determinado período de tempo
    E clico em "Notificações"
    Quando seleciono desativar notificações e sons por <periodo>
    Então valido que a configuração de notificações e sons foi alterada para o periodo de <periodo>

    Exemplos:
      | periodo  |
      | 1 hora   |
      | 1 dia    |
      | 1 semana |
      | nunca    |
