# BankMicroservices

A Spring Boot microservices reference project for account, card, and loan capabilities. The repository demonstrates service decomposition, centralized configuration, service discovery, edge routing, asynchronous messaging, and containerized local execution.

## Architecture

- **accounts** — account APIs and persistence
- **cards** — card APIs and persistence
- **loans** — loan APIs and persistence
- **configserver** — centralized Spring Cloud configuration
- **eurekaserver** — service registration and discovery
- **gatewayserver** — API gateway and external entry point
- **message** — messaging component used by the platform
- **docker-compose** — local multi-service orchestration

Client requests enter through the gateway. The gateway resolves registered services through Eureka, while each service loads shared configuration from the config server. Business capabilities remain independently deployable and own their service-specific data and logic.

## Engineering focus

- Clear bounded services for accounts, cards, and loans
- Centralized configuration with environment-specific settings
- Runtime service discovery and gateway-based routing
- Docker Compose for repeatable local startup
- Spring Boot Actuator support for operational endpoints
- Asynchronous integration through the message component

## Technology

Java, Spring Boot, Spring Cloud, Spring Data JPA, Maven, Eureka, API Gateway, Docker, and Docker Compose.

## Run locally

1. Clone the repository.
2. Review configuration under each service and the ` docker-compose ` directory.
3. Build the services with Maven.
4. Start the stack using the Compose files in ` docker-compose `.
5. Route API requests through ` gatewayserver ` after the services register with Eureka.

> Configuration and exposed ports are defined in the repository files. Use those values rather than assumptions from older documentation.

## Repository purpose

This is a learning and portfolio project focused on practical microservices patterns. It intentionally favors explicit service boundaries and observable infrastructure components over a single monolithic application.

## Author

[Saurav Daruka](https://www.linkedin.com/in/sauravdaruka/)
