# ======= Visibilités en JAVA==========

En Java, les modificateurs de visibilité permettent de contrôler l’accès aux attributs et aux méthodes d’une classe.

## private
La visibilité `private` rend les attributs et méthodes accessibles **uniquement à l’intérieur de la classe** où ils sont déclarés.

- Non accessible depuis une autre classe
- Non accessible par héritage

---

## default (package-private)
Lorsqu’aucun mot-clé n’est précisé, la visibilité est dite **par défaut**.

Les attributs et méthodes sont accessibles **uniquement aux classes du même package**.

- Accessible dans le même package
- Non accessible depuis un autre package

---

## protected
La visibilité `protected` permet un accès :

- aux classes du même package
- aux classes filles (héritage), même dans un autre package

C’est une visibilité intermédiaire entre `default` et `public`.

---

## <h1 style="color=#0A84FF">public</h1>
La visibilité `public` rend les attributs et méthodes accessibles **partout**.

- Accessible dans toutes les classes
- Accessible dans tous les packages

---

## <h1 style="color=#0A84FF">Astuce</h1>
- `private` → accès limité à la classe
- `default` → accès au package
- `protected` → accès package + héritage
- `public` → accès global

# ======== Heritage en JAVA =========

L'heritage est un concept qui permet à une classe dite "fille" de tirer profit d'une autre classe dite "mère"

dans ces conditions là la classe fille peut acceder aux attributs et aux methodes de la classe mère.

## ===EXEMPLE===

## package ej;

## public class Bloc {
##    protected int longueur;
##    protected int largeur;
##    protected int hauteur;
## }

//**nouvelle classe mur qui herite de Bloc**

## package ej;

## public class Mur extends Bloc {
##    private boolean porteur;
## }

## ==== FIN EXEMPLE ====

## REMARRQUE: À noter que la classe Mur utilise le mot-clé extends. On dit qu’elle étend la classe Bloc ou hérite de cette classe. Autrement dit, elle en devient une extension ou bien une spécialisation. En étendant la classe Bloc, Mur accède désormais à ses attributs. Et cela ne vous aura pas échappé : la visibilité de longueur, largeur et hauteur est ni public, ni private mais protected. La visibilité protected rend accessible les attributs et méthodes aux classes filles en plus de la classe en elle-même. C’est donc un peu plus permissif que private mais pas autant que public.**

<a href="https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html">documentation</a>


## Abstraction

Ce concept peut s’appliquer au niveau d’une classe ou d’une méthode. Dans les deux cas c’est directement lié à l’héritage.

**=========au niveau de la classe==========**

Au niveau de la classe, une classe abstraite ne peut pas être instanciée. Cependant une classe abstraite est faite pour être héritée ! Il existe de nombreuses situations où l’on veut bloquer l’instanciation. Par exemple, imaginez 3 classes : Animal, Chien et Chat. Bien évidemment Chien et Chat sont deux classes filles de la classe Animal. Dans ce contexte, un Animal peut-il exister sans être un Chien ou un Chat ? Absolument pas, c’est un concept abstrait qui sert à regrouper deux éléments concrets, Chien et Chat.

## <h1 style="color:#0A84FF">====INVERSION DE DÉPENDANCE====</h1>

## Problématique de couplage

Commençons par définir ce qu’est le couplage. Prenons un exemple, dans une maison un évier ne fonctionne pas s’il n’est pas raccordé à l’arrivée d’eau. On peut dire que l’évier utilise l’arrivée d’eau ou bien qu’il dépend de l’arrivée d’eau.

De la même façon, une classe peut utiliser une autre classe et elle dépendra donc de cette classe. Sans cette dernière, elle ne fonctionnerait pas. On dit alors que ces deux classes sont couplées car l’une a besoin de l’autre, ou encore car l’une dépend de l’autre.

<p style="color:#0A84FF">PROBLÉMATIQUE ?</p>

si la classe qui est utilisée change alors cela pourrait avoir un impact sur la classe qui l’utilise.

<p style="color:#0A84FF">SOLUTION ?</p>

Pour éviter cela l’idée est donc de réduire le couplage, car moins il y a de dépendances entre nos objets, mieux on se porte. Et s’il est évidemment impossible de supprimer toutes dépendances, on peut diminuer leur impact.

## Généricité

La généricité nous permet d’éviter la répétition de code car cela freine la maintenabilité d’un code. Elle a une notation spécifique `<T>`.
`<T>` est apposé après le nom de la classe et permet d’indiquer un type générique. Tant que l’objet n’est pas instancié, on ne sait pas encore quel type sera utilisé.

## D'autres lettres à utilisées

par convention on utilise souvent **K, T, U et V**.