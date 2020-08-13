# Solução Kata09

Proposta de solução para o desafio da concrete solutions,
utilizado no recrutamento de QA's.

## Desafio

* Resposta do exercício 09 do site [CodeKata](http://www.codekata.com), ou [aqui](Kata09.md), na linguagem de programação que lhe for mais conveniente

## Proposta de Solução

### Setup (Pré configuração) do ambiente

Toda a solução foi desenvolvida no sistema operacional Ubuntu Linux (18.04 LTS).

Foi utilizado o ambiente virtual do Python (venv), para que a instalação de ferramentas adicionais
não afete outras aplicações do sistema. Além disto, todas as dependências estão no arquivo [requirements.txt](requirements.txt).

Para instalar as dependências, utilizando o gerenciador de pacotes do Python (pip)

```console
user@linux:~$ pip install -r requirements.txt
```

### Pytest

O framework escolhido para a execução dos testes, foi o [pytest](https://docs.pytest.org/en/stable/index.html)

Para o funcionamento correto do pytest, algumas regras sobre nomenclatura de casos de testes e pastas devem ser respeitadas.

Após a [instalação e configuração](https://docs.pytest.org/en/stable/getting-started.html#) dos diretórios, basta executar o pytest no diretório raiz

```console
user@linux:~$ python -m pytest
```

Obs: Para execução detalhada (*full verbose*), basta adicionar -vv ao pytest

```console
user@linux:~$ python -m pytest -vv
```

## Autor

[Gustavo Dias A.](https://www.linkedin.com/in/gustavo-dias-alexandre-543568157/)
