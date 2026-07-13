# Package Tracker

A centralized package tracking platform that allows users to track shipments from multiple courier services in one place.

The goal of this project is to provide a unified tracking experience where users can monitor package status, delivery progress, and shipment history without visiting multiple courier websites.

## Problem Statement

Users often receive packages from different courier partners such as DTDC, Blue Dart, Delhivery, India Post, and others. Tracking each package separately across multiple platforms can be inconvenient.

Package Tracker aims to solve this problem by providing a single dashboard for tracking all deliveries.

## Features

- Track packages using tracking IDs
- View shipment status updates
- Track delivery history and timeline
- Search packages by tracking ID
- Manage multiple shipments in one place
- Real-time status updates (future enhancement)
- Notifications for delivery updates (future enhancement)

## Tech Stack

### Backend

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Maven

### Frontend (Planned)

- React.js
- Tailwind CSS

### Tools

- Git
- GitHub
- Postman
- VS Code
- Eclipse

## Architecture

```text
Client
   ↓
REST API (Spring Boot)
   ↓
Service Layer
   ↓
Repository Layer
   ↓
PostgreSQL Database
```

## Project Structure

```text
src/main/java/com/megha/packagetracker

├── controller
├── service
├── repository
├── entity
└── PackagetrackerApplication
```

## Learning Objectives

This project is being built to gain hands-on experience with:

- REST API Development
- Spring Boot
- Database Design
- JPA & Hibernate
- Backend Architecture
- Full Stack Application Development

## Future Enhancements

- User Authentication
- Courier API Integration
- Real-Time Tracking Updates
- Email Notifications
- Delivery Analytics Dashboard
- Admin Panel
- Mobile Responsive UI

## Status

🚧 Currently Under Development