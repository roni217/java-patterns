# Regex

Em ciência da computação, uma expressão regular (ou os estrangeirismos regex ou regexp, abreviação do inglês 
regular expression) provê uma forma concisa e flexível de identificar cadeias de caracteres de interesse, 
como caracteres particulares, palavras ou padrões de caracteres.
Expressões regulares são escritas numa linguagem formal que pode ser interpretada por um processador de expressão regular,
 um programa que serve um gerador de analisador sintático ou examina o texto e identifica as partes que casam com a especificação dada.
 
Uma expressão regular (ou, um padrão) descreve um conjunto de cadeias de caracteres, de forma concisa, sem precisar listar todos os elementos do conjunto.
Por exemplo, um conjunto contendo as cadeias "Handel", "Händel" e "Haendel" pode ser descrito pelo padrão H(ä|ae?)ndel. 

### Alternância (ou)
Uma barra vertical (|) separa alternativas. Por exemplo, psicadélico|psicodélico pode casar "psicadélico" ou "psicodélico".
 
### Agrupamento
Parênteses ((, )) são usados para definir o escopo e a precedência de operadores, entre outros usos. 
Por exemplo, psicadélico|psicodélico e psic(a|o)délico são equivalentes e ambas descrevem "psicadélico" e "psicodélico".

### Quantificação (ou repetição)

Um quantificador após um token (como um caractere) ou agrupamento especifica a quantidade de vezes que o elemento precedente pode ocorrer.
Os quantificadores mais comuns são o ponto de interrogação ?, o asterisco * e o sinal de adição +.

? indica que há zero ou uma ocorrência do elemento precedente. Por exemplo, ac?ção casa tanto "acção" quanto "ação".

* indica que há zero ou mais ocorrências do elemento precedente. Por exemplo, ab*c casa "ac", "abc", "abbc", "abbbc", e assim por diante.

+ indica que há uma ou mais ocorrências do elemento precedente. Por exemplo, ab+c casa "abc", "abbc", "abbbc", e assim por diante, mas não "ac".

Essas construções podem ser combinadas arbitrariamente para formar expressões complexas, assim como expressões aritméticas com números e operações de adição, subtração, multiplicação e divisão. De forma geral, há diversas expressões regulares para descrever um mesmo conjunto de cadeias de caracteres. A sintaxe exata da expressão regular e os operadores disponíveis variam entre as implementações.


 Fonte:
	https://pt.wikipedia.org/wiki/Express%C3%A3o_regular
	http://www.mkyong.com/tutorials/java-regular-expression-tutorials/ 