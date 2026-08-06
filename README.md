# Spring Boot + LocalStack + Terraform AWS Integration

A complete local AWS integration example using **Spring Boot 3.4.6**, **Java 21**, **LocalStack**, **Terraform**, **SNS**, and **SQS**.

This project demonstrates how to develop and test AWS event-driven architectures **without an AWS account**, using LocalStack as an AWS emulator and Terraform for infrastructure provisioning.

---

## Architecture

```text
┌───────────────┐
│ REST API      │
│ Spring Boot   │
└──────┬────────┘
       │ Publish
       ▼
┌───────────────┐
│ SNS Topic     │
│ LocalStack    │
└──────┬────────┘
       │ Fan-out
       ▼
┌───────────────┐
│ SQS Queue     │
│ LocalStack    │
└──────┬────────┘
       │ Consume
       ▼
┌───────────────┐
│ Spring SQS    │
│ Listener      │
└───────────────┘
```

---

## Technologies

- **Java 21**
- **Spring Boot 3.4.6**
- **Spring Data JPA**
- **Spring Web**
- **AWSpring Cloud 3.3.0**
- **Amazon SNS**
- **Amazon SQS**
- **H2 Database**
- **LocalStack**
- **Terraform**
- **Docker & Docker Compose**
- **Lombok**

---

## Project Goals

- Run AWS services locally using LocalStack
- Provision infrastructure with Terraform
- Publish messages to SNS
- Deliver messages to SQS
- Consume messages with Spring Boot
- Develop event-driven systems locally before deploying to AWS

---

## Prerequisites

- Java 21
- Maven 3.9+
- Docker
- Docker Compose
- Terraform 1.5+

---

## Start LocalStack

```bash
docker compose up -d
```

Verify LocalStack is running:

```bash
docker ps
```

---

## Provision AWS Resources

Navigate to the Terraform directory:

```bash
cd terraform
```

Initialize Terraform:

```bash
terraform init
```

Apply the infrastructure:

```bash
terraform apply -auto-approve
```

This creates:

- SNS Topic
- SQS Queue
- SNS → SQS subscription

---

## Run the Application

From the project root:

```bash
./mvnw spring-boot:run
```

The application starts on:

```text
http://localhost:8080
```

---

## Publish a Message

Example request:

```bash
curl -X POST http://localhost:8080/api/messages \
  -H "Content-Type: application/json" \
  -d '{"message":"Hello LocalStack"}'
```

---

## Consume Messages

The Spring Boot SQS listener automatically receives messages from the queue.

Example log:

```text
Received message: Hello LocalStack
```

---

## Project Structure

```text
spring-localstack-aws-integration
├── docker-compose.yml
├── terraform/
│   ├── main.tf
│   ├── sns.tf
│   ├── sqs.tf
│   └── outputs.tf
├── src/main/java/
│   ├── controller/
│   ├── service/
│   ├── listener/
│   ├── config/
│   └── entity/
├── src/main/resources/
│   └── application.yml
└── pom.xml
```

---

## LocalStack Configuration

Example configuration:

```yaml
spring:
  cloud:
    aws:
      region:
        static: us-east-1
      credentials:
        access-key: test
        secret-key: test
      endpoint: http://localhost:4566
```

---

## Terraform + LocalStack

Example provider configuration:

```hcl
provider "aws" {
  region                      = "us-east-1"
  access_key                  = "test"
  secret_key                  = "test"
  skip_credentials_validation = true
  skip_metadata_api_check     = true
  skip_requesting_account_id  = true

  endpoints {
    sns = "http://localhost:4566"
    sqs = "http://localhost:4566"
  }
}
```

---

## Why This Project Matters

This setup is useful for:

- Microservices development
- Event-driven architectures
- Integration testing
- CI/CD pipelines
- Offline AWS development
- Learning SNS/SQS without cloud costs

---

## Future Improvements

- PostgreSQL support
- Testcontainers integration
- DLQ (Dead Letter Queue)
- FIFO queues
- Message filtering
- OpenTelemetry tracing
- Dockerized Spring Boot app
- GitHub Actions CI

---

## Author

**Lázaro Noel Guerra Medina**

Senior Backend & AI Engineer

- Java
- Spring Boot
- AWS
- Microservices
- Event-Driven Systems
- AI Integrations
