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

---

## Em 2023-2 – Projeto Falcon (1º Semestre)

**Empresa parceira:** Projeto acadêmico da FATEC

O projeto Falcon teve como objetivo introduzir os alunos ao desenvolvimento de software, versionamento e organização de projetos. A solução construída consistiu em um sistema simples, mas essencial para praticar lógica de programação, estruturação de diretórios, colaboração e uso correto do GitHub.

[GitHub do projeto](https://github.com/lucasjonathangomes/Falcon)

### Tecnologias Utilizadas

- HTML, CSS e JavaScript – Construção da interface e interações básicas.
- Git/GitHub – Organização do repositório, branches e versionamento.
- Metodologias ágeis (conceitos iniciais) – Distribuição de tarefas e checkpoints entre o grupo.

### Contribuições Pessoais

- Estruturei a organização inicial do repositório com pastas, documentação e padrões.
- Implementei funções centrais do sistema aplicando lógica condicional, modularização e validações.
- Realizei revisões de código do grupo, assegurando clareza e boas práticas de clean code.
- Gerenciei branches e pull requests, garantindo histórico limpo e organizado.

### Hard Skills

- Lógica de programação – domínio de condicionais, funções e modularização.
- Git – uso de branches, merges e resolução de conflitos.
- Documentação – criação de guias e padronização do projeto. 

### Soft Skills

- Comunicação para alinhamento entre os membros.
- Organização na estruturação do projeto e separação de entregas.
- Trabalho em equipe na análise, discussão e validação de código.

---

## Em 2024-1 – Projeto Porygon (2º Semestre)

**Empresa parceira:** Projeto acadêmico da FATEC

O projeto Porygon introduziu o uso de Java com Spring Boot e MySQL, aprofundando conhecimentos sobre APIs REST, arquitetura em camadas e modelagem de dados. O sistema consistia no cadastro e gerenciamento de funcionários e setores, além de páginas dinâmicas com Thymeleaf.

[GitHub do projeto](https://github.com/PorygonAPI/Porygon)

### Tecnologias Utilizadas

- Java + Spring Boot – Criação de endpoints, regras de negócio e validações.
- MySQL – Modelagem relacional, queries e tabelas interligadas.
- JPA/Hibernate – Mapeamento objeto-relacional das entidades.
- Thymeleaf – Renderização dinâmica de páginas HTML conectadas ao backend.
- HTML, CSS, JS – Construção da camada visual.
- GitHub Projects – Organização das tarefas e sprints.

### Contribuições Pessoais

- Modelei entidades e relacionamentos JPA, garantindo consistência e integridade.
- Desenvolvi endpoints CRUD completos para Funcionários e Setores.
- Implementei validações com Bean Validation para evitar dados inconsistentes.
- Criei e aprimorei telas com Thymeleaf, conectadas aos métodos do controller.
- Auxiliei na integração backend–frontend, revisando dados, DTOs e fluxo de formulários.
- Atuei na revisão de branches e suporte técnico da equipe durante o desenvolvimento.

### Hard Skills

- Spring Boot – Domínio de controllers, services e validações.
- MySQL – Modelagem, queries e integração com JPA.
- Thymeleaf – Renderização de páginas dinâmicas conectadas ao backend. 

### Soft Skills

- Proatividade ao resolver inconsistências de dados e propor melhorias.
- Trabalho em equipe com forte comunicação e colaboração nas tarefas.
- Atenção aos detalhes na modelagem de entidades e fluxo de dados.

---

## Em 2024-2 – Projeto Porygon2 (3º Semestre)

**Empresa parceira:** GSW

O projeto Porygon2 teve como objetivo principal desenvolver uma aplicação de cadastro, consulta e gerenciamento de portais de notícias, com foco em controle de conteúdo, filtros por datas e associação de tags. O sistema permite o cadastro de portais, a inserção de notícias e a aplicação de filtros personalizados com foco na experiência do usuário e qualidade dos dados.

[GitHub do projeto](https://github.com/PorygonAPI/Porygon2)

### Tecnologias Utilizadas

- Java + Spring Boot – Backend da aplicação, incluindo validações, lógica de negócio e endpoints REST.
- MySQL – Banco de dados utilizado para persistência dos dados dos portais e notícias.
- Thymeleaf – Motor de templates para renderização de páginas no frontend.
- HTML, CSS e JS – Camada visual da aplicação.
- GitHub – Controle de versionamento e colaboração em equipe.
- JPA (Hibernate) – Mapeamento objeto-relacional e integração com MySQL.

### Contribuições Pessoais

- Desativação de portais: implementei o fluxo completo para desativar portais no sistema. Isso envolveu a adição de um campo de status no banco de dados para indicar a desativação lógica, evitando a exclusão física de dados. No backend, adaptei os endpoints para respeitarem esse status e atualizei os métodos de listagem para exibirem apenas portais ativos. No frontend (Vue.js), adaptei o formulário de edição e a tabela de visualização para refletir o novo estado.

- Verificação de duplicidade: desenvolvi uma lógica robusta no backend para impedir a inserção de notícias com título e conteúdo duplicados, utilizando consultas ao banco antes da persistência. No frontend, adicionei feedback visual ao usuário com mensagens de erro em tempo real durante o preenchimento do formulário, garantindo integridade dos dados e boa experiência de uso.

- Validação de intervalo de datas: implementei no backend um validador de intervalo de datas que impedia a seleção de datas inconsistentes (ex: início posterior ao fim), retornando erros claros. Essa lógica foi integrada ao frontend, onde adicionei controles visuais (como date pickers e validação reativa) para evitar erros antes mesmo do envio do formulário.

- Filtros por data: adicionei suporte completo para filtragem de registros com base em intervalos de datas. No backend, construí queries dinâmicas e flexíveis com JPQL e Criteria API para suportar diferentes combinações de filtros. No frontend, implementei o componente de filtro e controle de estado da interface para acionar requisições à API.

- Vinculação e remoção de tags: atuei na criação da funcionalidade de vinculação e desvinculação de tags no momento do cadastro de novos portais. No backend, modelei o relacionamento entre tabelas Portal e Tag (Many-to-Many), ajustando os DTOs e os mapeamentos JPA. No frontend, implementei o seletor múltiplo de tags com comportamento dinâmico, utilizando Vue.js e controle de estado local.

### Hard Skills

- Spring Boot – Implementação de lógica de negócio, filtros, e validações complexas com autonomia.
- MySQL – Escrita e análise de queries SQL com domínio da modelagem relacional.
- HTML/Thymeleaf – Alteração e criação de páginas dinâmicas conectadas à lógica backend.
- Git – Uso eficiente de versionamento, commits semânticos, criação e merge de branches.
- Validações com Bean Validation (JSR 380) – Aplicadas com sucesso nas regras de negócio. 

### Soft Skills

- Proatividade: identifiquei e solucionei problemas como duplicidade e intervalos de data sem necessidade de direcionamento externo.
- Trabalho em equipe: contribui ativamente na organização das tarefas em sprints, entregando dentro dos prazos e ajustando de acordo com as decisões em grupo.
- Comunicação: participei das reuniões semanais e atualizações de progresso, explicando com clareza minhas decisões técnicas.
- Atenção aos detalhes: garanti consistência entre backend e frontend, validando dados em ambas as pontas e cobrindo possíveis inconsistências do usuário.  

---

## Em 2025-1 – Projeto Porygon3 (4º Semestre)

**Empresa parceira:** Visiona

O projeto Porygon3 expandiu o sistema desenvolvido anteriormente, adicionando dashboards, mapas interativos, melhoria de desempenho e arquitetura mais robusta. A solução evoluiu para um sistema mais maduro e completo, com módulos avançados e integração profunda entre frontend e backend.

[GitHub do projeto](https://github.com/PorygonAPI/Porygon3)

### Tecnologias Utilizadas

- Java + Spring Boot – Ampliação da arquitetura backend, criação de novos endpoints e regras mais complexas.
- MySQL / JPA – Otimização de consultas, índices e modelagem mais eficiente.
- Vue.js – Interface moderna, reativa e modular.
- Axios – Comunicação HTTP entre frontend e backend.
- Leaflet – Visualização de mapas e dados geoespaciais.
- GitHub Flow – Processo de versionamento e organização da equipe. 

### Contribuições Pessoais

- Desenvolvi filtros dinâmicos avançados no backend utilizando Criteria API e consultas personalizadas.
- Implementei componentes Vue.js totalmente integrados com a API para exibição de dados, listas, formulários e navegação.
- Modelei e otimizei partes do banco de dados, reduzindo tempo de resposta e melhorando desempenho.
- Realizei integração completa entre frontend e backend usando Axios, garantindo consistência entre DTOs e objetos retornados.
- Participei da refatoração de módulos existentes, aplicando padrões de projeto e boas práticas de organização de código.
- Colaborei na implementação de mapas com Leaflet, incluindo markers, camadas, popups e integração com dados reais.

### Hard Skills

- Vue.js – criação de componentes, gerenciamento de estado e integração com API.
- Spring Boot – endpoints robustos, lógica avançada e organização em camadas.
- Integração frontend–backend – domínio de REST, DTOs, validações e respostas padronizadas.
- Leaflet – manipulação de mapas e dados geoespaciais.

### Soft Skills

- Liderança técnica informal – auxiliando colegas e revisando implementações.
- Resolução de problemas complexos – análise e correção de bugs críticos.
- Comunicação técnica – explicação de decisões arquiteturais e padrões usados.
- Colaboração – trabalho ativo nas sprints e revisões de PRs.
