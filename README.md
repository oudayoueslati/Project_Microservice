
<div align="center">

# 🎉 Offre Promotion Service 🎉

**Une application microservice Spring Boot pour gérer des offres promotionnelles avec des fonctionnalités modernes et sécurisées.**

<img src="https://img.shields.io/badge/Spring%20Boot-3.2.5-brightgreen.svg" alt="Spring Boot">
<img src="https://img.shields.io/badge/Docker-Compose-blue.svg" alt="Docker Compose">
<img src="https://img.shields.io/badge/Keycloak-Security-orange.svg" alt="Keycloak">
<img src="https://img.shields.io/badge/MySQL-Database-blue.svg" alt="MySQL">

</div>

---

## 📌 À propos du projet

Ce projet est une API REST sécurisée développée avec **Spring Boot** dans un contexte microservices, permettant la gestion des offres promotionnelles.  
Les fonctionnalités incluent la sécurisation via **Keycloak**, la génération de **PDF**, de **QR Codes**, l’envoi d’**emails automatiques**, et le tout est **dockerisé** avec Docker Compose.

---

## ✅ Fonctionnalités réalisées

- 🔁 **CRUD complet** sur les offres promotionnelles (création, lecture, mise à jour, suppression)
- 🔐 **Authentification & autorisation** via **Keycloak** avec gestion des rôles
- 📧 **Envoi d’e-mails** automatiques après création d'une offre
- 📄 **Génération de fichiers PDF** contenant les détails d’une offre
- 📲 **Création de QR Codes** pour chaque offre
- 🐳 **Déploiement avec Docker Compose** (Spring Boot + MySQL + Keycloak)
- 🧪 **Tests API sécurisés avec Postman**

---

## ⚙️ Commandes utiles

### 1. Lancer les conteneurs avec Docker Compose 🟢

```bash
docker-compose up -d --build
```

> Cette commande démarre l'application, la base de données MySQL, et Keycloak en mode détaché (`-d`) tout en reconstruisant les images si nécessaire (`--build`).

---

### 2. Consulter les logs de l'application 🔍

```bash
docker logs offre-promotion-service --tail 300
```

> Cette commande affiche les **300 dernières lignes** des logs du conteneur `offre-promotion-service`.

---

### 3. Arrêter les conteneurs 🛑

```bash
docker-compose down
```

> Cette commande **arrête et supprime** les conteneurs, volumes et réseaux créés.

---

## 🎓 Ce que j’ai appris

- ✅ Structurer une API REST propre avec Spring Boot
- ✅ Gérer la **sécurité** avec **Keycloak** (OAuth2, JWT, rôles)
- ✅ Automatiser l’**envoi de mails** via SMTP
- ✅ Générer des **PDF** dynamiques en Java
- ✅ Intégrer un système de **QR Codes** pour l’identification rapide
- ✅ Conteneuriser l'ensemble avec **Docker Compose**
- ✅ Tester des endpoints protégés avec **Postman + Tokens Keycloak**

---

## 🚀 Améliorations futures

- ✨ Ajouter une interface utilisateur en **Angular** 
- 🔔 Ajouter des **notifications temps réel**
- 📊 Intégrer un outil de monitoring (Prometheus + Grafana)
- 🧪 Implémenter des **tests automatisés** (JUnit, Mockito)

---

<div align="center">

### 💡 Merci d’avoir consulté ce projet !  
Ce projet m’a permis de monter en compétence sur des **techniques modernes de développement backend sécurisé et déployable**.

</div>
