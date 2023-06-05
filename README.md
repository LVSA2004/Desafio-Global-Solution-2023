<h1 align="center">Desafio Global Solution 2023</h1>

<h1 align="center">Por motivos de segurança, a OpenAI destrói as chaves de API que são colocadas na internet e por isso nosso projeto não consta uma chave de API</h1>
<h2> Vídeo Pitch: https://youtu.be/H4WXcr8yHhM </h2>
<h2> Vídeo da API RESTful: </h2>
<h2> Vídeo da API com o Mapeamento Objeto Relacional JPA e Hibernate: </h2>

<h2> Solução desenvolvida para o projeto Global Solution do primeiro semestre com a criação de uma API REStful que ajude no combate a fome com o uso de inteligência artificial</h2>

<h2 align="center">🛠 Arquitetura do Projeto 🛠</h2>
<div align="center">
    <img height src="https://cdn.discordapp.com/attachments/963972218981847040/1114708385242284122/7b52304f-d844-4a4b-b4b6-2ca5f9f859e1.png"/>
</div>

<h2 align="center">📊 TOGAF 📊</h2>
<div align="center">
    <img height src="https://cdn.discordapp.com/attachments/963972218981847040/1114708246863822868/Captura_de_tela_2023-06-03_211102.png"/>
</div>

<h2 align="center">🧾 Diagrama de Classes 🧾</h2>
<div align="center">
    <img height src="![image](https://github.com/LVSA2004/Desafio-Global-Solution-2023/assets/101113009/f0567dbf-6956-452c-a972-35020a35f6d5)"/>
</div>

<h2 align="center">Endpoints 📋</h2>

### Cadastro com Autenticação e Token ╹Usuário╷ **`/usuario/registrar`**:

#### POST ➡️

**Exemplo 👇**
```js
{
	"nome": "Luan Sá",
	"email": "lvssfiap@gmail.com",
	"senha": "|(:oUuC<UZ",
	"cpf":"535.710.748-96",
	"telefone":"(11) 95954-0882"
}
```

**Saída 👇**

|  | <font color="#aa31f5">código</font> | <font color="#e0af0d">descrição</font> |
|:------:|:------:|-----------|
✔️ | `201` | Usuário cadastrado com sucesso.
❌ | `403` | Não foi possível cadastrar o usuário.


### Login com validação de Token ╹Usuário╷ **`/usuario/login`**:

#### POST ➡️

**Exemplo 👇**
```js
{
	"email": "lvssfiap@gmail.com",
	"senha": "|(:oUuC<UZ"
}
```

**Saída 👇**

|  | <font color="#aa31f5">código</font> | <font color="#e0af0d">descrição</font> |
|:------:|:------:|-----------|
| ✔️ | `200` | Login validado com sucesso.
| ❌ | `403` | Não foi possivel validar o login.


### Pesquisa Por ID ╹Cliente╷ **`/cliente/pesquisa/{id}`**:

#### GET ⬅️

**Exemplo 👇**
```js
http://localhost:8080/usuario/pesquisa/1
```

**Saída 👇**

|  | <font color="#aa31f5">código</font> | <font color="#e0af0d">descrição</font> |
|:------:|:------:|-----------|
| ✔️ | `200` | Cliente com o id {id} encontrado.
| ❌ | `404` | Cliente com o id {id} não foi encontrado.


### Mandar prompt para o ChatGPT ╹ChatGPT╷ **`/chatbot/api`**:

#### POST ➡️

**Exemplo 👇**
```js
{
	"pergunta": "Gere uma dieta para um Homem de 19 anos, 1.75cm de altura, 85 kg, que não prática nenhuma atividade física",
}
```

**Saída 👇**

|  | <font color="#aa31f5">código</font> | <font color="#e0af0d">descrição</font> |
|:------:|:------:|-----------|
✔️ | `201` | Prompt inserido com sucesso.
❌ | `403` | Não foi possívelinserir o prompt.

### Deletar Prompt ╹ChatGPT╷ **`/chatbot/{id}`**:

#### DELETE ⬇️

**Exemplo 👇**
```js
http://localhost:8080/chatbot/1
```

**Saída 👇**

|  | <font color="#aa31f5">código</font> | <font color="#e0af0d">descrição</font> |
|:------:|:------:|-----------|
| ✔️ | `204` | Prompt deletado com sucesso.
| ❌ | `404` | Medico com o id {id} não foi encontrado.
