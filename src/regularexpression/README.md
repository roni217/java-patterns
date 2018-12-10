# Regex

Em ci�ncia da computa��o, uma express�o regular (ou os estrangeirismos regex ou regexp, abrevia��o do ingl�s 
regular expression) prov� uma forma concisa e flex�vel de identificar cadeias de caracteres de interesse, 
como caracteres particulares, palavras ou padr�es de caracteres.
Express�es regulares s�o escritas numa linguagem formal que pode ser interpretada por um processador de express�o regular,
 um programa que serve um gerador de analisador sint�tico ou examina o texto e identifica as partes que casam com a especifica��o dada.
 
Uma express�o regular (ou, um padr�o) descreve um conjunto de cadeias de caracteres, de forma concisa, sem precisar listar todos os elementos do conjunto.
Por exemplo, um conjunto contendo as cadeias "Handel", "H�ndel" e "Haendel" pode ser descrito pelo padr�o H(�|ae?)ndel. 

### Altern�ncia (ou)
Uma barra vertical (|) separa alternativas. Por exemplo, psicad�lico|psicod�lico pode casar "psicad�lico" ou "psicod�lico".
 
### Agrupamento
Par�nteses ((, )) s�o usados para definir o escopo e a preced�ncia de operadores, entre outros usos. 
Por exemplo, psicad�lico|psicod�lico e psic(a|o)d�lico s�o equivalentes e ambas descrevem "psicad�lico" e "psicod�lico".

### Quantifica��o (ou repeti��o)

Um quantificador ap�s um token (como um caractere) ou agrupamento especifica a quantidade de vezes que o elemento precedente pode ocorrer.
Os quantificadores mais comuns s�o o ponto de interroga��o ?, o asterisco * e o sinal de adi��o +.

? indica que h� zero ou uma ocorr�ncia do elemento precedente. Por exemplo, ac?��o casa tanto "ac��o" quanto "a��o".

* indica que h� zero ou mais ocorr�ncias do elemento precedente. Por exemplo, ab*c casa "ac", "abc", "abbc", "abbbc", e assim por diante.

+ indica que h� uma ou mais ocorr�ncias do elemento precedente. Por exemplo, ab+c casa "abc", "abbc", "abbbc", e assim por diante, mas n�o "ac".

Essas constru��es podem ser combinadas arbitrariamente para formar express�es complexas, assim como express�es aritm�ticas com n�meros e opera��es de adi��o, subtra��o, multiplica��o e divis�o. De forma geral, h� diversas express�es regulares para descrever um mesmo conjunto de cadeias de caracteres. A sintaxe exata da express�o regular e os operadores dispon�veis variam entre as implementa��es.


 Fonte:
	https://pt.wikipedia.org/wiki/Express%C3%A3o_regular
	http://www.mkyong.com/tutorials/java-regular-expression-tutorials/ 