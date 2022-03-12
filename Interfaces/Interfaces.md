Tudo começou da pergunta: Conseguimos ver um mamífero? - nunca conseguimos ver um mamnifero

o que vemos é um cachorro, uma baleia que em suas características determinam-se  por mamíferos;

Então vamos ao entendimento abstrato e sua construção.

Para o seguinte diagrama de classe utilizei o https://lucid.app/

Outra opção é a IDE intelij





<div align="center"><img src="https://i.imgur.com/GjuasIj.png" title="source: imgur.com" width="65%"/></div>

> Classes abstratas representada pela cor azul
>
> Classes especificas em cinza 
>
> Métodos( ) em evidência 

Passo1: Criar as classes, como no exemplo a seguir:

<div align="center"><img src="https://i.imgur.com/zTSWdYC.png" title="source: imgur.com" width="65%"/></div>

Declarar a variável nome e criar os métodos *get* e *set*, como mostra a seguir:

<div align="center"><img src="https://i.imgur.com/twENDf6.png" title="source: imgur.com" width="65%"/></div>

Faremos o mesmo para as classes abstratas *Anfíbio* e *Mamífero*

<div align="center"><img src="https://i.imgur.com/eXwJo7x.png" title="source: imgur.com" width="65%"/></div>



Na classe Salamandra não temos atributo, já na Cachorro e Baleia o seguinte:

<div align="center"><img src="https://i.imgur.com/cwenoOI.png" title="source: imgur.com" width="65%"/></div>

próximo passo seria interligar as classes que até agora estão independentes, fazemos isso através do **extends**:

<div align="center"><img src="https://i.imgur.com/UwsLIj3.png" title="source: imgur.com" width="65%"/></div>

Uma classe não abstrata (no nosso exemplo Cachorro, Salamandra e Baleia)  que estende uma **classe abstrata** precisam também implementar os métodos dessa classe, no caso Salamandra estende Anfíbio e implementa os métodos rastejar e emitirSom :

<div align="center"><img src="https://i.imgur.com/Ocn4Qwp.png" title="source: imgur.com" width="65%"/></div>

O mesmo para classe Baleia e Cachorro:

<div align="center"><img src="https://i.imgur.com/nvGE5lE.png" title="source: imgur.com" width="65%"/></div>

Vamos voltar ao diagrama

<div align="center"><img src="https://i.imgur.com/GjuasIj.png" title="source: imgur.com" width="65%"/></div>

Diferente da classe animal que tem um atributo *nome* podemos verificar que as classes *Anfíbio* e *Mamífero*, que são **classes abstratas**,  não tem **nenhum atributo**, temos somente métodos abstratos dentro dessa classe também abstrata, assim podemos **transformar em uma interface** **.             

> Temos por definição que Interface é uma *classe abstrata que somente tem métodos abstratos*. Pois, para o Java, não conseguiríamos estender duas classes. 
>
> Interfaces **não** tem atributos;

EX: se  quiséssemos que a Baleia fosse nomeada como um mamífero e  um Anfíbio por solicitação do  projeto, não conseguiríamos estender as duas classes (Anfíbio, Mamífero) na classe Baleia através do *extends*(Mamifero,Anfibío). 

A interface vai definir qual **comportamento** que aquela classe precisa implementar, define a assinatura.

Vamos implementar uma nova classe chamada AnimalEstimação com metodos brincar( ) e levarVeterinario( ) :

 <div align="center"><img src="https://i.imgur.com/fOhkmsv.png" title="source: imgur.com" width="65%"/></div>

Não conseguiríamos colocar os métodos em mamífero porque por exemplo, não conseguiríamos utilizar o método levarVeterinario para a classe Baleia;

Para implementar os métodos brincar e levarVeterinario na classe Cachorro, não conseguimos estender a classe Animal e a classe Animal estimação, sem antes transformar a classe AnimalEstimação em uma interface. Como a seguir:

 <div align="center"><img src="https://i.imgur.com/D5dNtcz.png" title="source: imgur.com" width="65%"/></div>

* Por padrão todas assinaturas de um método de uma interface é publico e abstrato, por isso so deixamos o void;
* Podemos implementar várias interfaces ao mesmo tempo nas classes fixas Cachorro, Baleia e Salamandra;

Referências:

https://loiane.training/curso/java-basico

https://www.youtube.com/watch?v=qiGTRJlCnlA&t=216s

