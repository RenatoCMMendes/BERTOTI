# Renato Costa De Moura Mendes 

## Introdução

Estudante e desenvolvedor backend com foco em desenvolvimento utilizando tecnologias modernas como Spring Boot, MySQL, e ferramentas de versionamento como Git. Tenho interesse em soluções escaláveis, práticas de clean code e desenvolvimento orientado a testes. Ao longo da minha trajetória, venho aplicando boas práticas de desenvolvimento colaborativo e integração contínua.

## Contatos
* [GitHub](https://github.com/RenatoCMMendes)
* [LinkedIn](https://www.linkedin.com/in/renato-mendes-61a6481a4/)

## Meus Principais Conhecimentos

- Java com Spring Boot (CRUD, validações, consumo e criação de APIs)
- MySQL (modelagem, queries, integrações com JPA)
- Git/GitHub (uso em equipe, branchs, PRs, versionamento e organização)
- Controle de fluxo com lógica condicional e tratamento de exceções
- Integração entre backend e frontend com foco em APIs RESTful

## Meus Projetos

### Em 2024-2 – Projeto Porygon2

**Empresa parceira:** GSW

O projeto Porygon2 teve como objetivo principal desenvolver uma aplicação de cadastro, consulta e gerenciamento de portais de notícias, com foco em controle de conteúdo, filtros por datas e associação de tags. O sistema permite o cadastro de portais, a inserção de notícias e a aplicação de filtros personalizados com foco na experiência do usuário e qualidade dos dados.

[GitHub do projeto](https://github.com/PorygonAPI/Porygon2)

#### Tecnologias Utilizadas

- Java + Spring Boot – Backend da aplicação, incluindo validações, lógica de negócio e endpoints REST.
- MySQL – Banco de dados utilizado para persistência dos dados dos portais e notícias.
- Thymeleaf – Motor de templates para renderização de páginas no frontend.
- HTML, CSS e JS – Camada visual da aplicação.
- GitHub – Controle de versionamento e colaboração em equipe.
- JPA (Hibernate) – Mapeamento objeto-relacional e integração com MySQL.

#### Contribuições Pessoais

- **Desativação de portais:** implementei o fluxo completo para desativar portais no sistema. Isso envolveu a adição de um campo de status no banco de dados para indicar a desativação lógica, evitando a exclusão física de dados. No backend, adaptei os endpoints para respeitarem esse status e atualizei os métodos de listagem para exibirem apenas portais ativos. No frontend (Vue.js), adaptei o formulário de edição e a tabela de visualização para refletir o novo estado.

- **Verificação de duplicidade:** desenvolvi uma lógica robusta no backend para impedir a inserção de notícias com título e conteúdo duplicados, utilizando consultas ao banco antes da persistência. No frontend, adicionei feedback visual ao usuário com mensagens de erro em tempo real durante o preenchimento do formulário, garantindo integridade dos dados e boa experiência de uso.

- **Validação de intervalo de datas:** implementei no backend um validador de intervalo de datas que impedia a seleção de datas inconsistentes (ex: início posterior ao fim), retornando erros claros. Essa lógica foi integrada ao frontend, onde adicionei controles visuais (como `date pickers` e validação reativa) para evitar erros antes mesmo do envio do formulário.

- **Filtros por data:** adicionei suporte completo para filtragem de registros com base em intervalos de datas. No backend, construí queries dinâmicas e flexíveis com JPQL e Criteria API para suportar diferentes combinações de filtros. No frontend, implementei o componente de filtro e controle de estado da interface para acionar requisições à API.

- **Vinculação e remoção de tags:** atuei na criação da funcionalidade de vinculação e desvinculação de tags no momento do cadastro de novos portais. No backend, modelei o relacionamento entre tabelas `Portal` e `Tag` (Many-to-Many), ajustando os DTOs e os mapeamentos JPA. No frontend, implementei o seletor múltiplo de tags com comportamento dinâmico, utilizando Vue.js e controle de estado local.

#### Hard Skills

- Spring Boot – Implementação de lógica de negócio, filtros, e validações complexas com autonomia.
- MySQL – Escrita e análise de queries SQL com domínio da modelagem relacional.
- HTML/Thymeleaf – Alteração e criação de páginas dinâmicas conectadas à lógica backend.
- Git – Uso eficiente de versionamento, commits semânticos, criação e merge de branches.
- Validações com Bean Validation (JSR 380) – Aplicadas com sucesso nas regras de negócio.

#### Soft Skills

- **Proatividade:** identifiquei e solucionei problemas como duplicidade e intervalos de data sem necessidade de direcionamento externo.
- **Trabalho em equipe:** contribui ativamente na organização das tarefas em sprints, entregando dentro dos prazos e ajustando de acordo com as decisões em grupo.
- **Comunicação:** participei das reuniões semanais e atualizações de progresso, explicando com clareza minhas decisões técnicas.
- **Atenção aos detalhes:** garanti consistência entre backend e frontend, validando dados em ambas as pontas e cobrindo possíveis inconsistências do usuário.
