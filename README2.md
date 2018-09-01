## Requerimentos
* Python 3.6
* Behave

## Instalação Behave
pip install behave

## Arquivos de teste
    dir: 
        .
        ├── Kata09.md
        ├── README.md
        ├── README2.md
        ├── __pycache__
        │   ├── supermarket.cpython-36.pyc
        │   └── test_Checkout.cpython-36.pyc
        ├── features
        │   ├── __pycache__
        │   ├── envio_foto_video_whatsappweb.feature
        │   ├── envio_mensagem_whatsappweb.feature
        │   └── steps
        │       ├── envio_foto_video_whatsappweb_steps.py
        │       └── envio_mensagem_whatsappweb_steps.py
        ├── supermarket.py
        └── test_Checkout.py 

### Execução dos testes do WhatsAppWeb   
* Executa todos os testes: 
$ behave
* Executa apenas os testes com a tag: 
$ behave --tags=@enviar_msg_contato features/envio_mensagem_whatsappweb.feature
* Executa todos os testes de uma feature:
$ behave features/envio_mensagem_whatsappweb.feature

### Execução dos testes do KATA09

python -m unittest test_Checkout.CheckoutTest

### Resposta do exercicio do Kata 09

    Resposta exercicio: supermarket.py
    Arquivo de teste: test_Checkout.py