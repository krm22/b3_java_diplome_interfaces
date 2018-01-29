# [b3_java_diplome_abstraite](https://spoonless.github.io/epsi-b3-java/classe_abstraite.html#exercice)
## Diplôme et examens (suite)

* Reprenez l’implémentation du système de gestion des diplômes des chapitres précédents.

* L’objectif est d’ajouter des contrôles sous la forme d’exceptions pour vérifier les cas suivants :


  - Si nous analysons notre hiérarchie d’héritage, nous voyons que toutes les classes qui héritent de Examen héritent également de la méthode Examen.setNote. 

  -  Or les classes Qcm et Projet ont une façon particulière de positionner une note. Donc ces classes ne devraient pas posséder cette méthode.
  
  
  ## Astuce
  * Transformez la classe Examen en classe abstraite.
  * Créez un classe concrète Controle pour remplacer la classe Examen comme classe concrète.
