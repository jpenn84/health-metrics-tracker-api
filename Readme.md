# health-metrics-tracker-api

API for my Health Metrics Tracker app.

## Purpose
Health Stats is a simple CRUD app I'm writing to track my vitals and health-related metrics.
My original purpose for creating this app is to track my post-surgery vitals after my spinal fusion surgery.

## Milestones
1. CRUD for basic vitals
   1. Blood Pressure
   2. Pulse
   3. SpO₂
   4. Weight
2. Reporting
   1. Data or charts for a specific and variable time periods
3. Security & additional users
   1. Spring Boot Security
   2. Normal User (i.e., adult user)
   3. Health Proxy User (i.e., parent or guardian of a minor child)

## Environment Variables

`SPRING_DATASOURCE_URL` - Database URL

`SPRING_DATASOURCE_USERNAME` - Database Username

`SPRING_DATASOURCE_PASSWORD` - Database Password

`SPRING_JPA_SHOW-SQL` - Boolean to show JPA queries.
