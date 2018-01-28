# [b3_java_diplome_exceptions](https://sponless.github.io/epsi-b3-java/les_exceptions.html#exercice)

* Reprenez l’implémentation du système de gestion des diplômes des chapitres précédents.

* L’objectif est d’ajouter des contrôles sous la forme d’exceptions pour vérifier les cas suivants :


  -  On ne peut pas positionner une note inférieure à 0 et supérieure à 20 pour une instance de Examen
  -  On ne peut pas construire un Qcm avec un nombre négatif ou nul de questions
  -  Le nombre de réponses correctes à un Qcm est compris entre zéro et le nombre de questions
  -  Les notes orale et écrite d’un Projet sont comprises entre 0 et 10.
  -  Dans la classe Diplome, ajoutez une méthode delivrer qui doit jeter une exception si la note moyenne de tous les examens est inférieure à 10.
  -  Proposez une hiérarchie applicative de vos exceptions.
