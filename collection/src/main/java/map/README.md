# MAP

<p align="center">
<img src="../../../../assets/image/map-interface-hierarchy.png" alt="Map interface hierarchy Java"><br>
<a href="https://data-flair.training/blogs/collection-framework-in-java/">Hierarchy of Collection Framework in Java </a>
</p>

- A interface `Map` � usada para mapear dados na forma de chaves e valores.
- O `Map` do Java � um objeto que mapeia chaves para valores.
- Um `Map` n�o pode conter chaves duplicadas: cada chave pode mapear para no m�ximo um valor.
- A plataforma Java possui tr�s implementa��es gerais de `Map`: `HashMap`, `TreeMap` e `LinkedHashMap`.
- As opera��es b�sicas do `Map` s�o: put (inserir), get (obter), containsKey (verificar se cont�m uma chave), containsValue (verificar se cont�m um valor), size (obter o tamanho) e isEmpty (verificar se est� vazio).

> ##### *HashTable* � uma implementa��o antiga da interface Map no Java que � sincronizada e thread-safe, tornando-a adequada para uso em ambientes concorrentes. Ela n�o permite chaves ou valores nulos e os elementos n�o s�o mantidos em uma ordem espec�fica.

> ##### *LinkedHashMap*, por outro lado, � uma implementa��o da interface Map que preserva a ordem de inser��o dos elementos. Cada elemento possui refer�ncias ao pr�ximo e ao anterior, formando uma lista encadeada. Isso permite que os elementos sejam iterados na ordem em que foram inseridos. Al�m disso, o LinkedHashMap tamb�m permite chaves ou valores nulos.

> ##### *HashMap* � uma implementa��o da interface Map que n�o mant�m uma ordem espec�fica dos elementos. Ele armazena os elementos internamente usando uma fun��o de hash para melhorar a efici�ncia das opera��es de pesquisa e acesso. O HashMap tamb�m permite chaves ou valores nulos.

### Refer�ncias:

[1] "Collections in Java Tutorial." DigitalOcean Community. Dispon�vel em: https://www.digitalocean.com/community/tutorials/collections-in-java-tutorial.

[2] "Java� Platform, Standard Edition 17 API Specification - Class Map." Oracle. Dispon�vel em: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Map.html.

## Fixando os Conhecimentos

Exerc�cios:

1. Opera��es B�sicas com Map
3. Pesquisa em Map
4. Ordena��o nas Map

## Opera��es B�sicas com Map

### 1. Agenda de Contatos
<p>
Crie uma classe chamada "AgendaContatos" que utilize um Map para armazenar os contatos. Cada contato possui um nome como chave e um n�mero de telefone como valor. Implemente os seguintes m�todos:

- `adicionarContato(String nome, Integer telefone)`: Adiciona um contato � agenda, associando o nome do contato ao n�mero de telefone correspondente.
- `removerContato(String nome)`: Remove um contato da agenda, dado o nome do contato.
- `exibirContatos()`: Exibe todos os contatos da agenda, mostrando o nome e o n�mero de telefone de cada contato.
- `pesquisarPorNome(String nome)`: Pesquisa um contato pelo nome e retorna o n�mero de telefone correspondente.
</p>

### 2.  Dicion�rio
<p>
Crie uma classe chamada "Dicionario" que utilize um Map para armazenar palavras e suas respectivas defini��es. Implemente os seguintes m�todos:

- `adicionarPalavra(String palavra, String definicao)`: Adiciona uma palavra e sua defini��o ao dicion�rio, associando a palavra � sua defini��o correspondente.
- `removerPalavra(String palavra)`: Remove uma palavra do dicion�rio, dado o termo a ser removido.
- `exibirPalavras()`: Exibe todas as palavras e suas defini��es do dicion�rio, mostrando cada palavra seguida de sua respectiva defini��o.
- `pesquisarPorPalavra(String palavra)`: Pesquisa uma palavra no dicion�rio e retorna sua defini��o correspondente.
</p>

---

## Pesquisa em Map

### 1. Estoque de Produtos com Pre�o
<p>
Crie uma classe chamada "EstoqueProdutos" que utilize um Map para armazenar os produtos, suas quantidades em estoque e seus respectivos pre�os. Cada produto possui um c�digo como chave e um objeto Produto como valor, contendo nome, quantidade e pre�o. Implemente os seguintes m�todos:

- `adicionarProduto(long cod, String nome, int quantidade, double preco)`: Adiciona um produto ao estoque, juntamente com a quantidade dispon�vel e o pre�o.
- `exibirProdutos()`: Exibe todos os produtos, suas quantidades em estoque e pre�os.
- `calcularValorTotalEstoque()`: Calcula e retorna o valor total do estoque, considerando a quantidade e o pre�o de cada produto.
- `obterProdutoMaisCaro()`: Retorna o produto mais caro do estoque, ou seja, aquele com o maior pre�o.
- `obterProdutoMaisBarato()`: Retorna o produto mais barato do estoque, ou seja, aquele com o menor pre�o.
- `obterProdutoMaiorQuantidadeValorTotalNoEstoque()`: Retorna o produto que est� em maior quantidade no estoque, considerando o valor total de cada produto (quantidade * pre�o).
</p>

### 2. Contagem de Palavras
<p>
Crie uma classe chamada "ContagemPalavras" que utilize um Map para armazenar as palavras e a quantidade de vezes que cada palavra aparece em um texto. Implemente os seguintes m�todos:

- `adicionarPalavra(String palavra, Integer contagem)`: Adiciona uma palavra � contagem.
- `removerPalavra(String palavra)`: Remove uma palavra da contagem, se estiver presente.
- `exibirContagemPalavras()`: Exibe todas as palavras e suas respectivas contagens.
- `encontrarPalavraMaisFrequente()`: Encontra a palavra mais frequente no texto e retorna a palavra e sua contagem.
</p>

---

## Ordena��o nos Map

### 1. Agenda de Eventos

Crie uma classe chamada "AgendaEventos" que utilize um `Map` para armazenar as datas e seus respectivos Eventos. Cada evento � representado por um objeto da classe "Evento", que possui atributos como nome do evento e o nome da atra��o. Implemente os seguintes m�todos:

- `adicionarEvento(LocalDate data, String nome, String atracao)`: Adiciona um evento � agenda.
- `exibirAgenda()`: Exibe a agenda de eventos em ordem crescente de data.
- `obterProximoEvento()`: Retorna o pr�ximo evento que ocorrer�.

### 2. Livraria Online
<p>
Crie uma classe chamada "LivrariaOnline" que representa uma livraria online. Essa classe utiliza um Map para armazenar os livros dispon�veis na livraria, utilizando o link da obra na Amazon Marketplace como chave e um objeto da classe "Livro" como valor.

A classe "Livro" possui atributos como t�tulo, autor e pre�o. Atrav�s da classe "LivrariaOnline", implemente os seguintes m�todos:

- `adicionarLivro(Livro livro)`: Adiciona um livro � livraria, utilizando o ISBN como chave no Map.
- `removerLivro(String titulo)`: Remove um livro da livraria, dado o titulo do livro.
- `exibirLivrosOrdenadosPorPreco()`: Exibe os livros da livraria em ordem crescente de pre�o.
- `pesquisarLivrosPorAutor(String autor)`: Retorna uma lista de todos os livros escritos por um determinado autor.
- `obterLivroMaisCaro()`: Retorna o livro mais caro dispon�vel na livraria.
- `exibirLivroMaisBarato()`: Retorna o livro mais barato dispon�vel na livraria.
</p>

---
### D�vidas e Suporte
