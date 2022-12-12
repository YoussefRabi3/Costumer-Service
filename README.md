# Costumer-Service
# Içi vous trouvez le compte rendu du web service Costumer-Service
## Tous d'abord le projets et crée par Start.spring.io c'est une deuxième methode pour crée les projets d'une façon plus rapide et plus efficace parce que si je reviens pour crée un nouveau projet je trouve les memes dependances 
![image](https://user-images.githubusercontent.com/86606579/207067543-f60f1386-8dc6-4b55-b246-b9ae25905484.png)
## l'insertion des enregistrements dans le base à l'aide de l'object CommandLineRunner
![image](https://user-images.githubusercontent.com/86606579/207061559-80c302e3-90f3-4efd-89eb-a3ce2ddb13fb.png)
## après l'execution de notre web service in ous affiche tous les clients qui si trouve dans notre base de donnée comme suit :
![image](https://user-images.githubusercontent.com/86606579/207061265-63dd41b9-e85a-4a11-a5dc-9735c5a60347.png)
## l'affichage de clients par id dans l'exmple on affiche le clients qui a l'ID = 3
![image](https://user-images.githubusercontent.com/86606579/207062472-1623bcd7-9a80-4b08-a642-6b7f600b1ee1.png)
la notation >management.endpoints.web.exposure.include=* permet de exposé tous les endpoints
![image](https://user-images.githubusercontent.com/86606579/207063868-fc5c72c0-227c-42ac-9355-1cd554f3cf98.png)
> voilà le resultat si vous ajouter la notation >management.endpoints.web.exposure.include=* comme vous voyez on a tous les objects qui sont chargé dans la mémoire par spring qui sont utilisé dans le miscro service :
![image](https://user-images.githubusercontent.com/86606579/207064996-c0c7199e-c8cc-4ab4-9fcd-362f754078f5.png)
>Donc içi dans l'autre execution on a les variable d'environements (le port,le service le path est le chemin ou ce trouve le jre utilisé)
![image](https://user-images.githubusercontent.com/86606579/207064441-96c9cf5c-015a-4d9d-b0ca-93edb2daf579.png)
Donc il ne faut pas toujours faire un * pour ne pas surcharger votre micro service par des fonctionnalité qui ne seront pas etre exploité 
  # La base de donnée H2-Console
  ![image](https://user-images.githubusercontent.com/86606579/207066481-07634a28-1a39-48c8-b176-9c387f1ce893.png)
  ## La liste des clients qu'on a dans la base de donnée costumer_db 
  ![image](https://user-images.githubusercontent.com/86606579/207066791-b10d04ea-ad86-4195-b05b-b1ea02400824.png)









