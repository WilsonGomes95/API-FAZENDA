# API para Fazenda Urbana

Este projeto consiste em uma API RESTful para o gerenciamento de uma fazenda urbana. A API foi desenvolvida em Java com Spring Boot e permite o controle de diversos aspectos da fazenda, como cultivos, produtos, funcionários e vendas.

## Funcionalidades Principais

  * **Gerenciamento de Cultivos:** Cadastro, atualização e consulta de cultivos, incluindo informações sobre tipo de planta, data de plantio, estágio de crescimento e histórico de cuidados.
  * **Controle de Estoque:** Gerenciamento de produtos, incluindo estoque, custos, preços de venda e fornecedores.
  * **Gerenciamento de Funcionários:** Cadastro, atualização e consulta de funcionários, com informações sobre cargos, salários e horários.
  * **Gerenciamento de Fornecedores:** Cadastro, atualização e consulta de fornecedores, com informações de contato e histórico de compras.
  * **Controle de Vendas:** Registro de vendas, incluindo informações sobre produtos vendidos, quantidades, valores e clientes.
  * **Relatórios e Análises:** Geração de relatórios sobre produção, vendas, custos e lucros, auxiliando na tomada de decisões.

## Tecnologias Utilizadas

  * Java
  * Spring Boot
  * Spring Data JPA
  * Banco de dados (ex: MySQL, PostgreSQL)
  * Maven ou Gradle (para gerenciamento de dependências)

## Estrutura do Projeto

A estrutura do projeto segue as convenções do Spring Boot:

```
└── src
    └── main
        └── java
            └── com
                └── faculdade
                    └── faculdade
                        └── controllers
                            └── AdministradorController.java

```

  * **Controllers:** Classes responsáveis por receber as requisições HTTP e interagir com os serviços (`AdministradorController.java`).
  * **Entities:** Classes que representam as entidades do domínio da aplicação, como Cultivo, Produto, Funcionario, etc. (`Cultivo.java`, `Produto.java`, `Funcionario.java`, etc.).
  * **Repositories:** Interfaces que fornecem métodos para acesso aos dados no banco de dados (`CultivoRepository.java`, `ProdutoRepository.java`, `FuncionarioRepository.java`, etc.).
  * **Services:** Classes que implementam a lógica de negócio da aplicação.

## Como Executar a API

1.  Clone o repositório do projeto.
2.  Configure as informações de conexão com o banco de dados no arquivo `application.properties`.
3.  Execute a aplicação Spring Boot.

## Endpoints da API

A API disponibiliza os seguintes endpoints:

**Cultivos:**

  * `GET /cultivos`: Lista todos os cultivos.
  * `GET /cultivos/{id}`: Retorna o cultivo com o ID especificado.
  * `POST /cultivos`: Cria um novo cultivo.
  * `PUT /cultivos/{id}`: Atualiza o cultivo com o ID especificado.
  * `DELETE /cultivos/{id}`: Remove o cultivo com o ID especificado.

**Produtos:**

  * `GET /produtos`: Lista todos os produtos.
  * `GET /produtos/{id}`: Retorna o produto com o ID especificado.
  * `POST /produtos`: Cria um novo produto.
  * `PUT /produtos/{id}`: Atualiza o produto com o ID especificado.
  * `DELETE /produtos/{id}`: Remove o produto com o ID especificado.

**Funcionários:**

  * `GET /funcionarios`: Lista todos os funcionários.
  * `GET /funcionarios/{id}`: Retorna o funcionário com o ID especificado.
  * `POST /funcionarios`: Cria um novo funcionário.
  * `PUT /funcionarios/{id}`: Atualiza o funcionário com o ID especificado.
  * `DELETE /funcionarios/{id}`: Remove o funcionário com o ID especificado.

**Fornecedores:**

  * `GET /fornecedores`: Lista todos os fornecedores.
  * `GET /fornecedores/{id}`: Retorna o fornecedor com o ID especificado.
  * `POST /fornecedores`: Cria um novo fornecedor.
  * `PUT /fornecedores/{id}`: Atualiza o fornecedor com o ID especificado.
  * `DELETE /fornecedores/{id}`: Remove o fornecedor com o ID especificado.

**Vendas:**

  * `GET /vendas`: Lista todas as vendas.
  * `GET /vendas/{id}`: Retorna a venda com o ID especificado.
  * `POST /vendas`: Cria uma nova venda.
  * `PUT /vendas/{id}`: Atualiza a venda com o ID especificado.
  * `DELETE /vendas/{id}`: Remove a venda com o ID especificado.

## Documentação da API

A documentação detalhada da API, incluindo a descrição de cada endpoint, parâmetros e exemplos de requisições, pode ser gerada utilizando ferramentas como o Swagger.

## Considerações Finais

Esta API oferece uma solução completa para o gerenciamento de uma fazenda urbana, automatizando processos e fornecendo informações relevantes para a tomada de decisões. O projeto pode ser facilmente expandido e customizado de acordo com as necessidades específicas de cada fazenda.

## Contribuindo

Sinta-se à vontade para contribuir com o projeto\!
