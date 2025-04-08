<div align="center"> <h1>🎉 Offre Promotion Service 🎉</h1> <p> <strong>Une application microservice Spring Boot pour gérer des offres promotionnelles avec des fonctionnalités modernes et sécurisées !</strong> </p> <!-- Badges pour ajouter des couleurs --> <img src="https://img.shields.io/badge/Spring%20Boot-3.2.5-brightgreen.svg" alt="Spring Boot"> <img src="https://img.shields.io/badge/Docker-Compose-blue.svg" alt="Docker Compose"> <img src="https://img.shields.io/badge/Keycloak-Security-orange.svg" alt="Keycloak"> <img src="https://img.shields.io/badge/MySQL-Database-blue.svg" alt="MySQL"> </div>
🌟 À propos du projet
Offre Promotion Service est une application microservice développée avec Spring Boot dans le cadre d'un projet de gestion des offres promotionnelles. Ce projet met en œuvre une API REST complète pour gérer des offres, avec des fonctionnalités avancées telles que la sécurisation via Keycloak, la génération de PDF, la création de QR codes, et l'envoi d'e-mails automatisés. L'application est entièrement dockerisée avec Docker Compose, garantissant un déploiement fluide et cohérent.
Ce projet est une démonstration de mes compétences en développement backend, en intégration d'APIs, et en gestion de microservices sécurisés et conteneurisés. 🚀
🎯 Fonctionnalités réalisées
1. Gestion des offres (CRUD) 📋
  . Création d'une API REST pour gérer les offres promotionnelles :
     1- Ajouter une offre : Création d'une nouvelle offre avec des détails comme le nom, la description, les dates de début et de fin, et le pourcentage de remise.
     2- Récupérer une offre : Possibilité de consulter les détails d'une offre (à implémenter si nécessaire).
     3- Mettre à jour une offre : Modification des informations d'une offre existante (à implémenter si nécessaire).
     4- Supprimer une offre : Suppression d'une offre (à implémenter si nécessaire).
  . Les données sont stockées dans une base de données MySQL, gérée via Spring Data JPA.
2. Sécurisation avec Keycloak 🔒
  . Intégration de Keycloak pour l'authentification et l'autorisation :
     1- Sécurisation des endpoints avec des tokens JWT.
     2- Configuration d'un realm, d'un client, et d'utilisateurs dans Keycloak.
     3- Test des endpoints sécurisés via Postman en utilisant des tokens générés par Keycloak.
3. Génération de PDF 📄
   . Génération automatique de documents PDF pour chaque offre :
     1- Le PDF inclut les détails de l'offre (nom, description, dates, pourcentage de remise).
     2- Utilisation d'une bibliothèque comme iText pour créer les PDF.
4. Génération de QR codes 📲
   . Création de QR codes pour chaque offre :
     1- Le QR code contient un lien vers les détails de l'offre (par exemple, http://localhost:8093/offre_promotion/offer/{id}).
     2- Utilisation de la bibliothèque ZXing pour générer les QR codes.
     3- Les QR codes peuvent être intégrés dans les PDF ou utilisés séparément.
5. Envoi d'e-mails automatisés 📧
   . Envoi d'e-mails automatiques lorsqu'une nouvelle offre est ajoutée :
     1- L'e-mail contient les détails de l'offre (nom, description, dates, remise).
     2- Configuration de l'envoi d'e-mails via Gmail avec Spring Mail.
     3- Gestion des erreurs d'envoi avec des logs détaillés.
6. Dockerisation avec Docker Compose 🐳
   . Conteneurisation complète de l'application à l'aide de Docker et Docker Compose :
     1- Création d'un fichier docker-compose.yml pour orchestrer les services suivants :
     2- L'application Spring Boot (offre-promotion-service).
     3- Une base de données MySQL pour stocker les offres.
     4- Un serveur Keycloak pour l'authentification.
  . Simplification du déploiement et de l'exécution dans un environnement conteneurisé.
🛠️ Technologies utilisées
Spring Boot : Framework principal pour le développement de l'API REST.
Spring Data JPA : Gestion de la persistance des données avec une base de données MySQL.
Spring Mail : Envoi d'e-mails automatisés via Gmail.
Keycloak : Authentification et autorisation basées sur des tokens JWT.
ZXing : Génération de QR codes.
iText : Génération de PDF (selon votre implémentation).
Docker et Docker Compose : Conteneurisation et orchestration des services.
Postman : Test des endpoints sécurisés avec des tokens JWT.
🚀 Mon travail en résumé
Ce projet est une vitrine de mes compétences en développement backend et en gestion de microservices. Voici ce que j'ai accompli :

Développement d'une API REST sécurisée : J'ai créé une API complète pour gérer les offres promotionnelles, avec des opérations CRUD et une sécurisation via Keycloak.
Intégration de fonctionnalités avancées : J'ai implémenté la génération de PDF, de QR codes, et l'envoi d'e-mails automatisés, rendant l'application plus interactive et pratique.
Conteneurisation : J'ai dockerisé l'application avec Docker Compose, incluant tous les services nécessaires (application, base de données, Keycloak), pour un déploiement simplifié.
Tests et validation : J'ai testé les endpoints sécurisés avec Postman en utilisant des tokens JWT générés par Keycloak, garantissant la robustesse de l'application.
Ce projet m'a permis de maîtriser des concepts clés comme le développement backend, la sécurisation des APIs, et la conteneurisation, tout en suivant les bonnes pratiques de développement logiciel. 🌟
🖥️ Commandes utiles
Lancer les conteneurs avec Docker Compose
### 🟢 Lancer les conteneurs avec Docker Compose
```bash
docker-compose up -d --build
