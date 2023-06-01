<h1 align="center">Desafio Global Solution 2023</h1>

<h1 align="center">Por motivos de segurança, a OpenAI destrói as chaves de API que são colocadas na internet e por isso nosso projeto não consta uma chave de API</h1>
<h2> Vídeo da API funcionando:https://youtu.be/b7Yxvw2rgec </h2>

<h2> Solução desenvolvida para o projeto Global Solution do primeiro semestre com a criação de uma API REStful que ajude no combate a fome com o uso de inteligência artificial</h2>

<h2 align="center">🛠 Arquitetura do Projeto 🛠</h2>
<div align="center">
    <img height src=""/>
</div>

<h2 align="center">📊 TOGAF 📊</h2>
<div align="center">
    <img height src=""/>
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
http://localhost:8080/baymax/chatbot/1
```

**Saída 👇**

|  | <font color="#aa31f5">código</font> | <font color="#e0af0d">descrição</font> |
|:------:|:------:|-----------|
| ✔️ | `204` | Prompt deletado com sucesso.
| ❌ | `404` | Medico com o id {id} não foi encontrado.
