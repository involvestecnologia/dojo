# Dojo

## As três leis do TDD:

Link: http://butunclebob.com/ArticleS.UncleBob.TheThreeRulesOfTdd

1. Você deve escrever um teste falhando antes de escrever qualquer código de produção (You must write a failing test before you write any production code).
2. Você não deve escrever mais de um teste que é suficiente para falhar, ou falhar para compilar (You must not write more of a test than is sufficient to fail, or fail to compile).
3. Você não deve escrever mais do que o suficiente de código de produção além do necessário para fazer o teste falho passar (You must not write more production code than is sufficient to make the currently failing test pass).

As três regras do TDD:
Link: http://blog.cleancoder.com/uncle-bob/2014/12/17/TheCyclesOfTDD.html

1. Crie um teste unitário que falhe (Create a unit tests that fails).
2. Escreva código de produção que faça o teste passar (Write production code that makes that test pass).
3. Refatore seu código de produção com os testes passando (Clean up the mess you just made).

## Git

Tutorial recomendado: https://www.atlassian.com/git/tutorials/syncing/git-remote

Comandos que usaremos:

1. git status
2. git add <arquivos>
3. git commit -m "mensagem"
4. git push origin master

Resolução de conflitos

5. git pull --rebase origin master
6. git add <some-file>
7. git rebase --continue
8. git rebase --abort


