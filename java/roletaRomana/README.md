# Roleta Romana

O historiador Flavius Josephus relatou como, no confilto Romano-Judaico em 67 D.C., os romanos tomaram a cidade de Jotapata, onde ele era o comandantes. Escapando, Josephus se encontrou preso em uma caverna com mais 40 companheiros. Os romanos descobriram o esconderijo e fizeram um convite para que ele se rendessem, mas seus companheiros se recusaram a permitir que ele fizesse isso. Ele ent�o sugeriu que todos fizessem um suic�dio coletivo, onde pela ordem decidida por todos, um por um seria morto pelo outro.

Todos ficaram em c�rculo e, come�ando em um determinado ponto, em sentido hor�rio, cada terceira pessoa seria morta. O �nico sobrevivente foi Sojephus, que se rendeu aos romanos. Isso nos leva a quest�o: Josephus j� sabia exatamente onde ficar para que fosse o �nico sobrevivente?

Para se preparar para uma situa��o como essa, escreva um programa que determine qual posi��o voc� deve ficar no c�rculo para poder sobreviver. Voc� dever� informar a quantidade de pessoas no c�rculo (n > 0), a posi��o da pessoa que ir� come�ar o suic�dio (1 <= i <= n) e o "passo", isto �, de quantas em quantas pessoas, dever� ser morta (k > 0)

n > 0 pessoas s�o organizada em um c�rculo, numeradas de 1 a n em sentido hor�rio;
Iniciando na pessoa i, conta-se no sentido hor�rio, at� que se chegue na pessoa de valor k (k > 0), que � rapidamente morta.
Continuamos a contar k pessoas no sentido hor�rio, a partir da pessoa a esquerda da que foi morta.
Esse processo � repetido indefinidamente, at� que apenas uma pessoa seja a sobrevivente.
Por exemplo quando n = 5, k = 2 e i = 1, a ordem de execu��es � 2, 5, 3, e 1. O sobrevivente � 4.

---

Fonte: http://dojopuzzles.com/problemas/exibe/roleta-romana/