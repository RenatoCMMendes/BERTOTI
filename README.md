# BERTOTI - Engenharia de Software

## Trecho do livro "Software Engineering at Google"

"We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth.

Within Google we sometimes say, 'Software engineering is programming integrated over time.' Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming."

### O que é Engenharia de Software?

Engenharia de software difere da programação ao considerar trade-offs relacionados à escalabilidade e ao tempo antes mesmo de iniciar a codificação. Isso permite antecipar desvios e decidir se vale a pena enfrentá-los ou ajustar a rota do projeto no menor tempo possível.

---

## Atividade 2

### 1. Trade-offs

#### Instalar o sistema operacional em um servidor Windows vs Linux

- **Windows**: Interface gráfica facilita a aprendizagem, mas pode comprometer a estabilidade.
- **Linux**: Estabilidade 24/7 crucial para serviços críticos, mesmo sem interface gráfica.

### 2. Trade-offs

#### Programar em linguagem de alto nível vs baixo nível

- **Alto nível**: Maleabilidade e menos regras rígidas, ideal para iniciantes.
- **Baixo nível**: Velocidade de execução da aplicação, adequado para performance crítica.

### 3. Trade-offs

#### Escolher uma linguagem baseado em tempo de projeto vs escalabilidade

- **Tempo de projeto**: Linguagens de desenvolvimento rápido, mas limitadas em escalabilidade.
- **Escalabilidade**: Linguagens que suportam crescimento robusto, mesmo com prazos mais longos.

---

## Atividade 3

### Estilos de Arquitetura de Software

#### Layered Architecture Style

Exemplo: Microsoft Word ou Excel
- Separação clara entre interface de usuário, lógica de aplicação e armazenamento de dados.
- Benefícios: Organização, gerenciamento de complexidade.
- Trade-offs: Performance vs complexidade inicial.

#### Pipeline Architecture Style

Exemplo: Adobe Photoshop
- Processamento de dados em etapas sequenciais.
- Vantagens: Modularidade, escalabilidade.
- Desafios: Latência, orquestração complexa.

#### Microkernel Architecture Style

Exemplo: L4 Microkernel Family
- Modularidade e segurança, ideal para sistemas críticos.
- Vantagens: Robustez, adequado para sistemas embutidos e tempo real.
- Desafios: Performance, complexidade de desenvolvimento.

#### Service-Based Architecture Style

Exemplo: SAP (ERP, CRM, SCM)
- Modularidade, escalabilidade e integração entre módulos.
- Vantagens: Flexibilidade, evolução contínua.
- Desafios: Complexidade de gestão, segurança.

#### Event-Driven Architecture Style

Exemplo: PayPal (processamento de transações)
- Reatividade, escalabilidade e desacoplamento.
- Vantagens: Processamento em tempo real, interatividade.
- Desafios: Complexidade de gerenciamento, consistência de dados.

#### Microservices Architecture

Exemplo: Spotify (streaming de música)
- Escalabilidade, resiliência e entrega contínua.
- Vantagens: Rapidez de inovação, alta disponibilidade.
- Desafios: Complexidade de gerenciamento, consistência de dados entre serviços.

---

## Atividade 4

### Sistema Escolhido: Sistema de Pet Shop

#### Arquitetura: Arquitetura Baseada em Microserviços

#### Vantagens:

- **Desacoplamento**: Componentes independentes que respondem a eventos sem dependências diretas.
- **Escalabilidade**: Capacidade de escalar componentes conforme a demanda.
- **Reatividade**: Resposta rápida a eventos em tempo real.

#### Desvantagens:

- **Complexidade de Gestão de Eventos**: Monitoramento e depuração complexos do fluxo de eventos.
- **Consistência Eventual**: Dados podem não ser imediatamente consistentes entre componentes.

#### Banco de Dados NoSQL para Dados Não-Estruturados

#### Vantagens:

- **Escalabilidade Horizontal**: Distribuição de carga entre múltiplos servidores.
- **Resiliência**: Manutenção da operação em caso de falhas.

#### Desvantagens:

- **Complexidade de Configuração**: Gerenciamento e configuração mais complexos.
- **Custo**: Aumento de custos operacionais.

---

## Atividade 5

![Diagrama de Classe](https://github.com/RenatoCMMendes/BERTOTI/blob/83d2aa337641d85ede610c80e43ebe726b616b3c/img/petshop.jpeg)

---

## Atividade 6

Os códigos estão disponíveis no repositório.

---

## Atividade 7

Os códigos estão disponíveis no repositório.

---

## Atividade 8

![Diagrama de Caso de Uso](https://github.com/RenatoCMMendes/BERTOTI/blob/83d2aa337641d85ede610c80e43ebe726b616b3c/img/Diagramadecasodeuso.jpeg)

---