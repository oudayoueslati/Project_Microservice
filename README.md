<div align="center"> <h1>🎉 Offre Promotion Service 🎉</h1> <p> <strong>Une application microservice Spring Boot pour gérer des offres promotionnelles avec des fonctionnalités modernes et sécurisées !</strong> </p> <!-- Badges pour ajouter des couleurs --> <img src="https://img.shields.io/badge/Spring%20Boot-3.2.5-brightgreen.svg" alt="Spring Boot"> <img src="https://img.shields.io/badge/Docker-Compose-blue.svg" alt="Docker Compose"> <img src="https://img.shields.io/badge/Keycloak-Security-orange.svg" alt="Keycloak"> <img src="https://img.shields.io/badge/MySQL-Database-blue.svg" alt="MySQL"> <img src="https://img.shields.io/badge/Quotable-API-yellow.svg" alt="Quotable API"> </div>
🌟 À propos du projet
Offre Promotion Service est une application microservice développée avec Spring Boot dans le cadre d'un projet de gestion des offres promotionnelles. Ce projet met en œuvre une API REST complète pour gérer des offres, avec des fonctionnalités avancées telles que la sécurisation via Keycloak, la génération de PDF, la création de QR codes, l'envoi d'e-mails automatisés, et l'intégration d'une API externe pour ajouter des citations inspirantes. L'application est entièrement dockerisée avec Docker Compose, garantissant un déploiement fluide et cohérent.

Ce projet est une démonstration de mes compétences en développement backend, en intégration d'APIs, et en gestion de microservices sécurisés et conteneurisés. 🚀

🎯 Fonctionnalités réalisées
1. Gestion des offres (CRUD) 📋
Création d'une API REST pour gérer les offres promotionnelles :
Ajouter une offre : Création d'une nouvelle offre avec des détails comme le nom, la description, les dates de début et de fin, et le pourcentage de remise.
Récupérer une offre : Possibilité de consulter les détails d'une offre (à implémenter si nécessaire).
Mettre à jour une offre : Modification des informations d'une offre existante (à implémenter si nécessaire).
Supprimer une offre : Suppression d'une offre (à implémenter si nécessaire).
Les données sont stockées dans une base de données MySQL, gérée via Spring Data JPA.
2. Sécurisation avec Keycloak 🔒
Intégration de Keycloak pour l'authentification et l'autorisation :
Sécurisation des endpoints avec des tokens JWT.
Configuration d'un realm, d'un client, et d'utilisateurs dans Keycloak.
Test des endpoints sécurisés via Postman en utilisant des tokens générés par Keycloak.
3. Génération de PDF 📄
Génération automatique de documents PDF pour chaque offre :
Le PDF inclut les détails de l'offre (nom, description, dates, pourcentage de remise).
Utilisation d'une bibliothèque comme iText ou Apache PDFBox pour créer les PDF.
4. Génération de QR codes 📲
Création de QR codes pour chaque offre :
Le QR code contient un lien vers les détails de l'offre (par exemple, http://localhost:8093/offre_promotion/offer/{id}).
Utilisation de la bibliothèque ZXing pour générer les QR codes.
Les QR codes peuvent être intégrés dans les PDF ou utilisés séparément.
5. Envoi d'e-mails automatisés 📧
Envoi d'e-mails automatiques lorsqu'une nouvelle offre est ajoutée :
L'e-mail contient les détails de l'offre (nom, description, dates, remise).
Configuration de l'envoi d'e-mails via Gmail avec Spring Mail.
Gestion des erreurs d'envoi avec des logs détaillés.
6. Dockerisation avec Docker Compose 🐳
Conteneurisation complète de l'application à l'aide de Docker et Docker Compose :
Création d'un fichier docker-compose.yml pour orchestrer les services suivants :
L'application Spring Boot (offre-promotion-service).
Une base de données MySQL pour stocker les offres.
Un serveur Keycloak pour l'authentification.
Simplification du déploiement et de l'exécution dans un environnement conteneurisé.
7. Intégration d'une API externe (Quotable) 💬
Ajout d'une fonctionnalité pour associer une citation inspirante à chaque offre :
Utilisation de l'API publique Quotable (https://api.quotable.io/) pour récupérer des citations aléatoires.
Intégration de la citation dans les détails de l'offre, stockée dans la base de données.
Inclusion de la citation dans l'e-mail envoyé pour chaque nouvelle offre, ajoutant une touche motivante.
🛠️ Technologies utilisées
Spring Boot : Framework principal pour le développement de l'API REST.
Spring Data JPA : Gestion de la persistance des données avec une base de données MySQL.
Spring Mail : Envoi d'e-mails automatisés via Gmail.
Keycloak : Authentification et autorisation basées sur des tokens JWT.
ZXing : Génération de QR codes.
iText/Apache PDFBox : Génération de PDF (selon votre implémentation).
Docker et Docker Compose : Conteneurisation et orchestration des services.
Quotable API : Récupération de citations inspirantes.
Postman : Test des endpoints sécurisés avec des tokens JWT.
🚀 Mon travail en résumé
Ce projet est une vitrine de mes compétences en développement backend et en gestion de microservices. Voici ce que j'ai accompli :

Développement d'une API REST sécurisée : J'ai créé une API complète pour gérer les offres promotionnelles, avec des opérations CRUD et une sécurisation via Keycloak.
Intégration de fonctionnalités avancées : J'ai implémenté la génération de PDF, de QR codes, et l'envoi d'e-mails automatisés, rendant l'application plus interactive et pratique.
Conteneurisation : J'ai dockerisé l'application avec Docker Compose, incluant tous les services nécessaires (application, base de données, Keycloak), pour un déploiement simplifié.
Enrichissement avec une API externe : J'ai intégré l'API Quotable pour ajouter des citations inspirantes à chaque offre, améliorant l'expérience utilisateur.
Tests et validation : J'ai testé les endpoints sécurisés avec Postman en utilisant des tokens JWT générés par Keycloak, garantissant la robustesse de l'application.
Ce projet m'a permis de maîtriser des concepts clés comme le développement backend, la sécurisation des APIs, la conteneurisation, et l'intégration d'APIs externes, tout en suivant les bonnes pratiques de développement logiciel. 🌟

🖥️ Commandes utiles (facultatif)
Voici quelques commandes pour exécuter le projet si vous souhaitez le tester :

Lancer les conteneurs avec Docker Compose :
bash

Réduire

Envelopper

Copier
docker-compose up -d --build
Cela démarre l'application, la base de données MySQL, et Keycloak.
Consulter les logs de l'application :
bash

Réduire

Envelopper

Copier
docker logs offre-promotion-service --tail 300
Arrêter les conteneurs :
bash

Réduire

Envelopper

Copier
docker-compose down
📌 Remarques
Ce projet est une démonstration de mes compétences et peut être étendu avec d'autres fonctionnalités, comme l'ajout d'autres endpoints CRUD ou l'intégration d'autres APIs.
Les citations ajoutées via l'API Quotable sont en anglais, mais il est possible d'adapter le projet pour inclure des citations dans d'autres langues.
<div align="center"> <h3>✨ Merci d'avoir exploré mon projet ! ✨</h3> <p>Ce travail reflète ma passion pour le développement backend et les microservices.</p> </div>
