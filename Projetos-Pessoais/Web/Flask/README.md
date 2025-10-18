# Aprendendo Flask

Esta pasta contém meus experimentos e projetos iniciais com o Flask através da documentação, um micro-framework web leve escrito em Python.

O objetivo aqui é documentar os passos fundamentais para criar e rodar uma aplicação Flask, seguindo as boas práticas recomendadas pela documentação oficial, como o uso de ambientes virtuais.

## 1. Configuração do Ambiente

Antes de instalar o Flask, é crucial criar um "ambiente virtual" (`venv`). Isso isola as dependências do seu projeto, evitando conflitos com outros projetos Python no seu computador.

**1.1. Criando o Ambiente Virtual**

No terminal, dentro desta pasta, execute:

```bash
# Comando para criar um diretório chamado "venv"
python -m venv venv

# No Windows (PowerShell/CMD):
.\venv\Scripts\activate

# No Linux ou macOS:
source venv/bin/activate


# Instalar o Flask
pip install flask
```

É uma boa pratica ter um arquivo requirements.txt no seus projetos python para que as dependências usadas sejam mais facilmente instaladas.

```bash
# Salvar as dependências no arquivo requirements.txt
pip freeze > requirements.txt
```

Como rodar uma aplicação Flask, depois de criar um arquivo como app.py e escrever o código inicial você consegue rodar ele com:

```bash
# Mude o segundo app com o nome da sua aplicação
flask --app app run
```
