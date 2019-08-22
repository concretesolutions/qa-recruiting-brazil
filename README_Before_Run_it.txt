Author: Pablo Berzoini
=============================
README
=============================

Nas implementações dos testes no Whatsapp utilizando BDD usei duas linguagens: Python e JavaScript.
As bibliotecas do python a serem instaladas, caso necessário:
pip install behave
pip install selenium
pip install nose_tools

OBS.: É necessário adicionar o driver do chrome ou outro navegador padrão nas variáveis de ambiente do Windows para que o Selenium rode os testes em Python.

OBS2: As implementações foram feitas utilizando Whatsapp Web. Em ambas implementações foi adicionado um tempo para a leitura do QR-Code pelo celular, portanto, é necessário realizar este "step" manual para que os testes sejam executados com sucesso.

Para rodar os testes em JavaScript é necessário ter o NodeJS instalado e as seguintes bibliotecas:
npm install protractor
npm install — save-dev cucumber
npm install — save-dev protractor-cucumber-framework
npm install chai
npm install chai-as-promised

=====================================================================================================================================================

Para rodar ambos os testes, a estrutura padrão do BDD deve ser seguida:

folder/features/*.feature -> Todos os feature files estarão aqui dentro
folder/features/step_definitions/*.js (JavaScript) ou folder/features/step_definitions/*.py -> Todos os arquivos que contém os steps de execução

====================================================================================================================================================

PARA RODAR O CÓDIGO EM PYTHON:

na pasta que contém as features, rode o seguinte comando no prompt:

behave "feature_name.feature"

PARA RODAR O CÓDIGO EM JAVASCRIPT:

na pasta raiz, onde está localizado o "protractor.conf.js", rode:

protractor protractor.conf.js

OBS: é necessário configurar a pasta onde os se encontram os arquivos .feature e os .js. Essa configuração é feita no arquivo protractor.conf.js