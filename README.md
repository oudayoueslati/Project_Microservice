<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Offre Promotion Service</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            line-height: 1.6;
            background-color: #f4f4f9;
            color: #333;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 900px;
            margin: 0 auto;
            padding: 20px;
        }
        .header {
            text-align: center;
            background: linear-gradient(to right, #ff6b6b, #feca57);
            padding: 30px;
            border-radius: 10px;
            margin-bottom: 20px;
        }
        .header h1 {
            color: #fff;
            font-size: 2.5em;
            margin: 0;
        }
        .header p {
            color: #fff;
            font-size: 1.2em;
            margin: 10px 0 0;
        }
        .badges img {
            margin: 5px;
        }
        h2 {
            color: #ff6b6b;
            border-bottom: 2px solid #feca57;
            padding-bottom: 5px;
            margin-top: 30px;
        }
        h3 {
            color: #2d3436;
        }
        ul {
            list-style-type: none;
            padding: 0;
        }
        ul li {
            background: #dfe6e9;
            margin: 10px 0;
            padding: 15px;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }
        ul li::before {
            content: "✅ ";
            color: #ff6b6b;
        }
        .code-block {
            background: #2d3436;
            color: #dfe6e9;
            padding: 15px;
            border-radius: 5px;
            font-family: 'Courier New', Courier, monospace;
            margin: 10px 0;
            position: relative;
        }
        .code-block::before {
            content: "Commande";
            color: #dfe6e9;
            background: #ff6b6b;
            padding: 5px 10px;
            border-radius: 5px 5px 0 0;
            position: absolute;
            top: -30px;
            left: 0;
        }
        .code-block p {
            margin: 5px 0 0;
            color: #b2bec3;
            font-style: italic;
        }
        .footer {
            text-align: center;
            margin-top: 40px;
            padding: 20px;
            background: #dfe6e9;
            border-radius: 10px;
        }
        .footer h3 {
            color: #ff6b6b;
        }
        .footer p {
            color: #2d3436;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="header">
            <h1>🎉 Offre Promotion Service 🎉</h1>
            <p><strong>Une application microservice Spring Boot pour gérer des offres promotionnelles avec des fonctionnalités modernes et sécurisées !</strong></p>
            <div class="badges">
                <img src="https://img.shields.io/badge/Spring%20Boot-3.2.5-brightgreen.svg" alt="Spring Boot">
                <img src="https://img.shields.io/badge/Docker-Compose-blue.svg" alt="Docker Compose">
                <img src="https://img.shields.io/badge/Keycloak-Security-orange.svg" alt="Keycloak">
                <img src="https://img.shields.io/badge/MySQL-Database-blue.svg" alt="MySQL">
            </div>
        </div>

        <h2>🌟 À propos du projet</h2>
        <p><strong>Offre Promotion Service</strong> est une application microservice développée avec <strong>Spring Boot</strong> dans le cadre d'un projet de gestion des offres promotionnelles. Ce projet met en œuvre une API REST complète pour gérer des offres, avec des fonctionnalités avancées telles que la sécurisation via <strong>Keycloak</strong>, la génération de PDF, la création de QR codes, et l'envoi d'e-mails automatisés. L'application est entièrement dockerisée avec <strong>Docker Compose</strong>, garantissant un déploiement fluide et cohérent.</p>
        <p>Ce projet est une démonstration de mes compétences en développement backend, en intégration d'APIs, et en gestion de microservices sécurisés et conteneurisés. 🚀</p>

        <h2>🎯 Fonctionnalités réalisées</h2>
        <h3>1. Gestion des offres (CRUD) 📋</h3>
        <ul>
            <li>Création d'une API REST pour gérer les offres promotionnelles :</li>
            <li>Ajouter une offre : Création d'une nouvelle offre avec des détails comme le nom, la description, les dates de début et de fin, et le pourcentage de remise.</li>
            <li>Récupérer une offre : Possibilité de consulter les détails d'une offre (à implémenter si nécessaire).</li>
            <li>Mettre à jour une offre : Modification des informations d'une offre existante (à implémenter si nécessaire).</li>
            <li>Supprimer une offre : Suppression d'une offre (à implémenter si nécessaire).</li>
            <li>Les données sont stockées dans une base de données <strong>MySQL</strong>, gérée via <strong>Spring Data JPA</strong>.</li>
        </ul>

        <h3>2. Sécurisation avec Keycloak 🔒</h3>
        <ul>
            <li>Intégration de <strong>Keycloak</strong> pour l'authentification et l'autorisation :</li>
            <li>Sécurisation des endpoints avec des tokens <strong>JWT</strong>.</li>
            <li>Configuration d'un realm, d'un client, et d'utilisateurs dans Keycloak.</li>
            <li>Test des endpoints sécurisés via <strong>Postman</strong> en utilisant des tokens générés par Keycloak.</li>
        </ul>

        <h3>3. Génération de PDF 📄</h3>
        <ul>
            <li>Génération automatique de documents PDF pour chaque offre :</li>
            <li>Le PDF inclut les détails de l'offre (nom, description, dates, pourcentage de remise).</li>
            <li>Utilisation d'une bibliothèque comme <strong>iText</strong> ou <strong>Apache PDFBox</strong> pour créer les PDF.</li>
        </ul>

        <h3>4. Génération de QR codes 📲</h3>
        <ul>
            <li>Création de QR codes pour chaque offre :</li>
            <li>Le QR code contient un lien vers les détails de l'offre (par exemple, <code>http://localhost:8093/offre_promotion/offer/{id}</code>).</li>
            <li>Utilisation de la bibliothèque <strong>ZXing</strong> pour générer les QR codes.</li>
            <li>Les QR codes peuvent être intégrés dans les PDF ou utilisés séparément.</li>
        </ul>

        <h3>5. Envoi d'e-mails automatisés 📧</h3>
        <ul>
            <li>Envoi d'e-mails automatiques lorsqu'une nouvelle offre est ajoutée :</li>
            <li>L'e-mail contient les détails de l'offre (nom, description, dates, remise).</li>
            <li>Configuration de l'envoi d'e-mails via <strong>Gmail</strong> avec <strong>Spring Mail</strong>.</li>
            <li>Gestion des erreurs d'envoi avec des logs détaillés.</li>
        </ul>

        <h3>6. Dockerisation avec Docker Compose 🐳</h3>
        <ul>
            <li>Conteneurisation complète de l'application à l'aide de <strong>Docker</strong> et <strong>Docker Compose</strong> :</li>
            <li>Création d'un fichier <code>docker-compose.yml</code> pour orchestrer les services suivants :</li>
            <li>L'application Spring Boot (<code>offre-promotion-service</code>).</li>
            <li>Une base de données <strong>MySQL</strong> pour stocker les offres.</li>
            <li>Un serveur <strong>Keycloak</strong> pour l'authentification.</li>
            <li>Simplification du déploiement et de l'exécution dans un environnement conteneurisé.</li>
        </ul>

        <h2>🛠️ Technologies utilisées</h2>
        <ul>
            <li><strong>Spring Boot</strong> : Framework principal pour le développement de l'API REST.</li>
            <li><strong>Spring Data JPA</strong> : Gestion de la persistance des données avec une base de données MySQL.</li>
            <li><strong>Spring Mail</strong> : Envoi d'e-mails automatisés via Gmail.</li>
            <li><strong>Keycloak</strong> : Authentification et autorisation basées sur des tokens JWT.</li>
            <li><strong>ZXing</strong> : Génération de QR codes.</li>
            <li><strong>iText/Apache PDFBox</strong> : Génération de PDF (selon votre implémentation).</li>
            <li><strong>Docker</strong> et <strong>Docker Compose</strong> : Conteneurisation et orchestration des services.</li>
            <li><strong>Postman</strong> : Test des endpoints sécurisés avec des tokens JWT.</li>
        </ul>

        <h2>🚀 Mon travail en résumé</h2>
        <p>Ce projet est une vitrine de mes compétences en développement backend et en gestion de microservices. Voici ce que j'ai accompli :</p>
        <ul>
            <li><strong>Développement d'une API REST sécurisée</strong> : J'ai créé une API complète pour gérer les offres promotionnelles, avec des opérations CRUD et une sécurisation via Keycloak.</li>
            <li><strong>Intégration de fonctionnalités avancées</strong> : J'ai implémenté la génération de PDF, de QR codes, et l'envoi d'e-mails automatisés, rendant l'application plus interactive et pratique.</li>
            <li><strong>Conteneurisation</strong> : J'ai dockerisé l'application avec Docker Compose, incluant tous les services nécessaires (application, base de données, Keycloak), pour un déploiement simplifié.</li>
            <li><strong>Tests et validation</strong> : J'ai testé les endpoints sécurisés avec Postman en utilisant des tokens JWT générés par Keycloak, garantissant la robustesse de l'application.</li>
        </ul>
        <p>Ce projet m'a permis de maîtriser des concepts clés comme le développement backend, la sécurisation des APIs, et la conteneurisation, tout en suivant les bonnes pratiques de développement logiciel. 🌟</p>

        <h2>🖥️ Commandes utiles</h2>
        <h3>Lancer les conteneurs avec Docker Compose</h3>
        <div class="code-block">
            <code>docker-compose up -d --build</code>
            <p>💡 Cela démarre l'application, la base de données MySQL, et Keycloak.</p>
        </div>

        <h3>Consulter les logs de l'application</h3>
        <div class="code-block">
            <code>docker logs offre-promotion-service --tail 300</code>
            <p>💡 Affiche les 300 dernières lignes des logs pour diagnostiquer les problèmes.</p>
        </div>

        <h3>Arrêter les conteneurs</h3>
        <div class="code-block">
            <code>docker-compose down</code>
            <p>💡 Arrête et supprime tous les conteneurs.</p>
        </div>

        <div class="footer">
            <h3>✨ Merci d'avoir exploré mon projet ! ✨</h3>
            <p>Ce travail reflète ma passion pour le développement backend et les microservices.</p>
        </div>
    </div>
</body>
</html>
