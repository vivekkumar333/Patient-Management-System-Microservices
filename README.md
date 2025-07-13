# PMS Patient Management System

A production-grade, microservices-based Patient Management System (PMS) built using Java 17, Spring Boot 3, RESTful APIs, Kafka, PostgreSQL, Angular 18, Docker, and Kubernetes.


## Project Overview

This PMS system manages patient registration, billing, and notifications using a decoupled, scalable microservices architecture:

Registers patients and stores patient details.

Charges registration fees via billing service using RESTful WebClient calls.


## Architecture
    



## Current Microservices

  ### 1️⃣ pms-patient-service

    Registers new patients and stores patient data.

    Calls pms-billing-service to charge patient registration using WebClient.

    Publishes Kafka patient events to pms-notification-service for notifications.

  ### 2️⃣ pms-billing-service

    Handles billing for patient registration.

    Receives WebClient POST calls from pms-patient-service.

    Future integration with Kafka for billing notifications.

  ### 3️⃣ pms-notification-service

    Consumes patient Kafka events from pms-patient-service.

    Sends email and mobile notifications upon patient registration.

    Future integration with billing service for payment notifications.


## Planned enhancements:

### gateway-service: 
    API gateway for routing and authentication.

### auth-service: 
    JWT-based authentication and authorization.

### angular-ui: 
    Frontend for registration, login, and dashboard.


## Tech Stack

    Backend: Java 17, Spring Boot 3

    Frontend: Angular 18 (planned)

    Database: PostgreSQL

    Message Broker: Apache Kafka

    Containerization: Docker

    Orchestration: Kubernetes

    Build Tool: Maven

    Version Control: Git


