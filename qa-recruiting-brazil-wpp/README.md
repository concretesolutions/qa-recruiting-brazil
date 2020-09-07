# Especificação de duas funcionalidades do Whatsapp
> Utiliza a ferramenta Gherkin para construir cenários de teste.

É uma proposta de solução do desafio para o processo seletivo de **_QA Analista de Teste_** da empresa **_Concrete Solutions_** para analisar as habilidades do candidato a vaga na empresa.


## Desafio

- Especificação de duas funcionalidades do Whatsapp (não importa se o app é Android, iOS, Windows Phone ou versão Web) em Gherkin ou Gaug.

- Cada especificação deve conter ao menos um cenário de teste

## Método

Os procedimentos adotados foram utilizar Dispositivo com Sistema Android® 9.0 (_celular e/ou tablet_) e um computador com Sistema Operacional Windows 10 home Single Language (Desktop). Foram instalados algumas ferramentas responsável na criação dos Casos de Teste.

1. Aplicação Mobile _Whatsapp Versão 2.20.199.9_
2. IntelliJ IDEA Community Edition 2020.2
3. Dependências Maven do Projeto.
    - Cucumber-java 1.2.5 
    - Cucumber-junit 1.2.5

### Instalação

#### 1. Para instalar aplicação Mobile _Whatsapp Versão 2.20.199.9_ no (_celular e/ou tablet_)

1. Vá no aplicativo da `Loja do Google` [Play Store](https://play.google.com/store).

2. Pesquise por `WhatsApp Messenger`.

3. Clique na opção  e toque em `Instalar`.

#### 2. Para instalar IntelliJ IDEA Community Edition 2020.2
No site da [Jetbrains.com](https://confluence.jetbrains.com/pages/viewpage.action?pageId=54920165) você encontra os passos necessário para instalar o _IntelliJ IDEA Community Edition 2020.2_ em seu computador.

#### 3. Dependências Maven do Projeto
**_Cucumber Java:_**

```sh
<dependency>
    <groupId>info.cukes</groupId>
    <artifactId>cucumber-java</artifactId>
    <version>1.2.5</version>
</dependency>
```

**_Cucumber Junit:_**

```sh
<dependency>
    <groupId>info.cukes</groupId>
    <artifactId>cucumber-junit</artifactId>
    <version>1.2.5</version>
    <scope>test</scope>
</dependency>
```

## Histórico de lançamentos

* 0.1.0
    * O primeiro lançamento adequado
* 0.0.1
    * Trabalho em andamento

## Meta

Raul Batalha – [@raulbatalha ](https://twitter.com/raulbatalha)

[https://github.com/raulbatalha](https://github.com/raulbatalha/)