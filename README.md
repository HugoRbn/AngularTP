# Backend

Le backend ce trouve dans le dossier hugor. Je l'ai réalisé avec spring. Pour ce qui est de la BDD j'ai utilisé SQL et pour le système de migration j'ai utilisé Flyway.
Pour lancer le backend, il s'uffit d'aller sur IntelliJ et de lancer le backend.

Depuis cet api on trouvera un service REST. Mais seul le save et le list nous serons utile dans le cadre de ce TP.

# Frontend 

Le frontend se trouve dans le dossier musculation. à l'intérieur on y trouvera l'architecture globale d'un projet Angular. Il faudra s'interesser au composant home ou est-ce que j'affiche une liste à l'aide d'un composant AngularMaterial.
Également il faudra regarder les composants user-list et userform.

### UserForm

Depuis ce composant on va se charger de créer des personnes en faisant appel à l'API Java. Une fois la personne créé, on va automatiquement être redirigé vers la vue userlist qui s'occupe d'afficher la liste des utilisateurs existant.

### UserList

Depuis ce composant on va afficher les utilisateurs déjà existant, en faisant un appel à l'API Java. 
