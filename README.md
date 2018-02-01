# [b3_java_diplome_interfaces](https://spoonless.github.io/epsi-b3-java/interface.html#id2)
## Diplôme et examens (suite)

# Reprenez l’implémentation du système de gestion des diplômes des chapitres précédents.

## Faites évoluer la classe Examen afin d’ajouter un code pour un examen. 
## Par exemple, un contrôle peut avoir le code « JAVA-LANG001 » et un projet « PHP-PRJ ».

* Ajoutez la méthode getExamens dans la classe Diplome. 
* Cette méthode doit retourner un tableau des examens du diplôme trié selon un critère fourni en paramètre.

 *Modifiez votre programme pour afficher successivement la liste des examens d’un diplôme triée suivant :

- le code des examens
- la note des examens
- la date des examens

### Astuce

- Pour trier un tableau en Java, vous devez utiliser la méthode Arrays.sort(Object[], Comparator). 

- Cette méthode prend en premier paramètre le tableau à trier et en deuxième paramètre une implémentation de l’interface  générique Comparator.

- C’est l’implémentation de cette interface qui va être en charge de comparer les éléments deux à deux lors du tri.
