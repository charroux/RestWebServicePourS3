# RestWebServicePourS3

1/ Installation

Java (JDK recommandée)

Eclipse JEE Developper : uniquement décompresser

Tomcat (version 7 binary) : uniquement décompresser

Gradle (utilisé pour builder le projet) : version binary :

  -  décompresser
  -  positionner variable environnement path : y ajouter le chemin vers le dossier bin de Gradle


2/ Utilisation de cette application

Télécharger le zip de ce projet ici (de github)

Décompresser

Builder : commande : gradle build

Conertir projet en projet Eclipse : gradle eclipse

Importer le projet sous Eclipse : menu File -> Import -> Existing project into workspace


3/ L'application de location de voiture 

- obtenir la liste des voitures à louer
- obtenir les informations sur une voiture
- louer une voiture
- ramener une voiture

Structure de données JSON d'une voiture :
{"pladeImmatriculation","11AA22"}

- Obtenir la liste des voitures à louer (tableau JSon) :

  HTTP GET sur l'URI ? site.../car
  
- obtenir les informations sur une voiture :

  HTTP GET sur l'URI ? site.../car/11AA22
  
- louer une voiture

  HTTP PUT sur l'URI ? site.../car/11AA22?louer=true
  
- ramener une voiture

  HTTP PUT sur l'URI ? site.../car/11AA22?louer=false
