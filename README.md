# Dojo

## Intuito
 Tem por intuito a diversão, desafiar o programador com novos problemas, novas linguagens, enfim, buscar novas soluções saindo da zona de conforto.

## Formatos
 1. Kata - Uma dupla apresenta uma solução pre desenvolvida e não há rotação do teclado com a plateia.
 2. Randori - Há uma máquina e participação de todos, a cada 5 minutos o piloto sai para a platéia, o co-piloto assume e alguem da platéia assume a posição do co-piloto.
 3. Kake - Há várias duplas trabalhando simultâneamente, a cada turno as duplas são trocadas.

## Papéis
- **Piloto:** é o participante que está no computador, tem o poder de decisão maior;
- **Copiloto:** tem o objetivo de ajudar o Piloto a pensar, devendo dar opiniões e sugestões relacionados à solução e o próximo passo a se tomar;
- **Plateia:** também têm o direito de ajudar a dupla pilotando o Dojo, devendo ficar em silêncio enquanto os testes desenvolvidos não passam.

## Valores
 1. Respeito
 2. Cooperação
 3. Coragem
 4. Participação
 5. Simplicidade

## Tempos sugeridos
- 10~20 minutos para elaboração da solução
- 5 minutos por dupla
  - Após, o Piloto vai para a plateia, o Copiloto assume como Piloto e alguém da plateia assume como Copiloto
- Ao final, 5~10 minutos para retrospectiva

## Sempre Realizar Retrospectiva
 1. O que aprendemos? (feedbacks e agradecimentos)
 2. O que podemos melhorar?
 3. O que devemos continuar fazendo.

## Alimentação
 O mais importante, lembre-se sempre de levar quitutes e petiscos para os participantes, para manter todos alimentados e felizes :D
 Sugestões:
 1. Amendoim
 2. Pão de queijo
 3. Paçoquinha
 4. Docinhos
 5. Bolo
 6. Refri

## As três leis do TDD

Link: http://butunclebob.com/ArticleS.UncleBob.TheThreeRulesOfTdd

1. Você deve escrever um teste falhando antes de escrever qualquer código de produção (You must write a failing test before you write any production code).
2. Você não deve escrever mais de um teste que é suficiente para falhar, ou falhar para compilar (You must not write more of a test than is sufficient to fail, or fail to compile).
3. Você não deve escrever mais do que o suficiente de código de produção além do necessário para fazer o teste falho passar (You must not write more production code than is sufficient to make the currently failing test pass).

## Ciclo TDD

Link: http://blog.cleancoder.com/uncle-bob/2014/12/17/TheCyclesOfTDD.html

1. Crie um teste unitário que falhe (Create a unit tests that fails).
2. Escreva código de produção que faça o teste passar (Write production code that makes that test pass).
3. Refatore seu código de produção com os testes passando (Clean up the mess you just made).

## Git

Tutorial recomendado: https://www.atlassian.com/git/tutorials/syncing/git-remote

Comandos que usaremos:

1. `git status`
2. `git add <arquivos>`
3. `git commit -m "mensagem"`
4. `git push origin master`

Resolução de conflitos

5. `git pull --rebase origin master`
6. `git add <arquivo>`
7. `git rebase --continue`
8. `git rebase --abort`


