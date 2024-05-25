# BERTOTI
Engenharia de Software

Trecho do livro software engineering at Google

"We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering 
project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we
need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as
software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and
growth.
Within Google we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software
engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might
need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of
time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming.";

- O que é Engenharia de Software ?
A engenharia de software difere da progamação onde antes de começar a criar o codigo é preciso se realizar os trade-offs com relação a escabilidade e tempo para que
perceba-se no menor tempo possivel os possiveis desavios a serem enfretado e se realmente vale enfrentar ou mudar a rota do projeto.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
# Atividade 2

1 Trade off's

Instalar o sistema operacionar em um servidor windows x linux

- Por um lado o Windows oferece uma interface grafica que promove uma menor curva de aprendizagem para quem irá utilizar, só que ao olhar pelo lado da estabilidade daquele servidor o Linux oferecer uma estabiliadade de praticamente 24/7 que para alguns serviços é crucial para o software.

2 Trade off's

Programar em uma linguagem de alto nivel x baixo nivel 

- Para os programadores iniciantes a linguagem alto nivel promove uma melhor maleabilidade não terndo tantas regras rigidas, mas por outro lado as linguages de baixo nivel promovel uma velocidade para a aplicação.

3 Trade off's

Escolher uma linguagem por tempo de projeto x escalabilidade

- Ao se iniciar um projeto deve se escolher a lingaguem a ser utilizado caso a urgencia do projeto seja o tempo existem liguagens de puxa e errasta que entregam projetos em semanas mas para progetos que irá ter uma escalabilidade grandeosa essas lingagens não irão suprir a necessidade preferindo trocar por outra que demore mais tempo para entrega do projeto e que sustento o tamanho do projeto.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
# Atividade 3

Layered Architecture Style
Aplicativos como o Microsoft Word ou Excel seguem princípios de arquitetura em camadas, separando a interface do usuário, a lógica de aplicação e o armazenamento de dados. A arquitetura em camadas é uma escolha popular em muitas aplicações devido à sua capacidade de organizar e gerenciar complexidade através da separação de preocupações. No entanto, os desenvolvedores devem estar cientes dos trade-offs em termos de performance e complexidade inicial ao decidir adotar esse estilo arquitetural. É importante avaliar se os benefícios de manutenção e escalabilidade superam os custos adicionais de desenvolvimento para o contexto específico do projeto.

Pipeline Architecture Style
Adobe Photoshop: Utiliza uma arquitetura de pipeline para aplicar filtros e efeitos às imagens em uma série de etapas sequenciais. A arquitetura de pipeline é poderosa para sistemas que necessitam processar dados em várias etapas sequenciais, oferecendo vantagens em termos de modularidade, escalabilidade e manutenção. No entanto, a adoção dessa arquitetura envolve trade-offs significativos, incluindo a latência introduzida pela comunicação entre etapas, a complexidade de orquestração e os desafios de depuração. A decisão de utilizar uma arquitetura de pipeline deve considerar a natureza do processamento de dados necessário e a capacidade da equipe de desenvolvimento para gerenciar as complexidades associadas.

Microkernel Architecture Style
L4 Microkernel Family: Um conjunto de microkernels utilizados em pesquisa para explorar a segurança e eficiência dos sistemas operacionais. Derivações do L4 são utilizadas em diversos contextos de segurança. A arquitetura de microkernel oferece uma modularidade e robustez significativas, tornando-a adequada para sistemas que requerem alta segurança e estabilidade, como sistemas embutidos e aplicações em tempo real. No entanto, os desenvolvedores devem considerar os trade-offs em termos de performance e complexidade de desenvolvimento ao optar por essa arquitetura. A decisão de usar um microkernel deve ser baseada na necessidade de modularidade, segurança e a capacidade de gerenciar a comunicação entre componentes, comparada com os custos de overhead e a complexidade adicional de desenvolvimento.

Service-Based Architecture Style
O SAP utiliza uma arquitetura baseada em serviços para seus módulos ERP, CRM, SCM, etc., permitindo integração e interoperabilidade entre diferentes módulos. A arquitetura baseada em serviços oferece uma modularidade significativa, escalabilidade e flexibilidade, tornando-a adequada para sistemas empresariais complexos e aplicações que necessitam de uma evolução contínua. No entanto, a adoção dessa arquitetura envolve trade-offs em termos de complexidade de gerenciamento, overhead de comunicação e desafios de segurança. A decisão de utilizar uma arquitetura baseada em serviços deve considerar a capacidade da equipe de desenvolvimento para lidar com esses desafios e a infraestrutura disponível para suportar a comunicação e integração dos serviços.

Event-Driven Architecture Style
PayPal: Emprega uma arquitetura orientada a eventos para lidar com milhões de transações financeiras por segundo, garantindo que cada transação seja processada de maneira eficiente e segura. A arquitetura orientada a eventos oferece vantagens significativas em termos de desacoplamento, escalabilidade e reatividade, tornando-a ideal para aplicações que exigem alta interatividade e processamento em tempo real. No entanto, essa arquitetura também apresenta desafios em termos de complexidade de gerenciamento, consistência de dados, latência e segurança. A decisão de adotar uma arquitetura orientada a eventos deve considerar a capacidade da equipe de desenvolvimento para lidar com esses desafios e a natureza específica dos requisitos da aplicação.

Microservices Architecture
Spotify utiliza microserviços para suas funcionalidades de streaming de música, listas de reprodução, pesquisa, e recomendações, permitindo uma entrega contínua de novas funcionalidades e escalabilidade eficiente. A arquitetura de microserviços oferece benefícios significativos em termos de escalabilidade, resiliência e flexibilidade, tornando-a ideal para aplicações grandes e complexas que exigem alta disponibilidade e rapidez de inovação. No entanto, a adoção dessa arquitetura vem com desafios consideráveis, incluindo a complexidade de gerenciamento, comunicação entre serviços e consistência de dados. A decisão de adotar uma arquitetura de microserviços deve considerar a capacidade da equipe de desenvolvimento para gerenciar essa complexidade e a natureza específica dos requisitos da aplicação

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
# Atividade 4

Sistema Escolhido: Sistema de Pet Shop
Arquitetura: Arquitetura Baseada em Microserviços
Vantagens:
Desacoplamento:
Descrição: Componentes do sistema podem funcionar de forma independente, respondendo a eventos sem dependências diretas entre si.

Benefício: Aumenta a flexibilidade do sistema, permitindo que novos serviços sejam adicionados sem alterar os existentes.
Escalabilidade:
Descrição: Os componentes podem ser escalados independentemente com base na quantidade de eventos processados.
Benefício: Permite escalar apenas os componentes que estão sob alta demanda, otimizando o uso de recursos.

Reatividade:
Descrição: O sistema pode reagir a eventos em tempo real, proporcionando uma experiência mais responsiva para o usuário.
Benefício: Melhora a experiência do usuário com respostas rápidas a ações como agendamento de consultas, atualizações de inventário e notificações.

Desvantagens:
Complexidade de Gestão de Eventos:

Descrição: Monitorar, rastrear e depurar o fluxo de eventos pode ser complexo.
Impacto: Requer ferramentas e práticas robustas de monitoramento e logging para garantir que eventos sejam processados corretamente.
Consistência Eventual:

Descrição: Em sistemas baseados em eventos, os dados podem não ser imediatamente consistentes em todos os componentes.
Impacto: Pode resultar em leituras temporariamente desatualizadas, o que pode ser problemático para operações críticas como o processamento de pagamentos.
Banco de Dados NoSQL para Dados Não-Estruturados

Escalabilidade Horizontal
Vantagens:
Distribuição de Carga:
Descrição: Permite a adição fácil de recursos, distribuindo a carga entre vários servidores.
Benefício: Melhora a capacidade de lidar com altos volumes de tráfego, especialmente durante picos de uso, como promoções ou campanhas sazonais.

Resiliência:
Descrição: Em caso de falha, a presença de múltiplos nós permite manter a operação sem grandes interrupções.
Benefício: Aumenta a disponibilidade e confiabilidade do sistema, minimizando o tempo de inatividade, crucial para um pet shop que opera tanto online quanto fisicamente.

Desvantagens:
Complexidade de Configuração:
Descrição: Configurar e gerenciar a escalabilidade horizontal pode ser mais complexo do que simplesmente aumentar os recursos de um servidor.
Impacto: Exige expertise em infraestrutura distribuída e ferramentas de gestão adequadas para monitorar e balancear a carga entre servidores.

Custo:
Descrição: Aumentar a infraestrutura horizontalmente pode resultar em custos mais elevados.
Impacto: Pode resultar em custos adicionais para hardware, software e recursos humanos, devido à necessidade de mais servidores e gerenciamento mais complexo.

Conclusão
A arquitetura escolhida para o sistema de pet shop, baseada em eventos, banco de dados NoSQL para dados não estruturados e escalabilidade horizontal, é altamente adequada para lidar com a diversidade de funcionalidades necessárias, como agendamento de serviços, gestão de inventário e vendas online. Essa arquitetura oferece flexibilidade, escalabilidade e reatividade, mas também apresenta desafios em termos de gestão de complexidade, garantia de consistência e custos operacionais. A escolha final deve considerar os requisitos específicos do sistema e as prioridades em termos de escalabilidade, consistência e facilidade de manutenção.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
# Atividade 5
![Diagrama](https://github.com/RenatoCMMendes/BERTOTI/blob/83d2aa337641d85ede610c80e43ebe726b616b3c/img/petshop.png)
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
# Atividade 6

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
# Atividade 7

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
