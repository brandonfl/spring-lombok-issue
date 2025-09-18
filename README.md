# Spring lombok issue

## Used versions

- Spring Boot Starter 3.5.5
- Lombok 1.18.42
- Java 17

## Run

```bash
docker compose up --build --force-recreate
```

## Expected Behavior

On http://localhost:8080/

```json
{
  "test": {
    "is_user_available": true
  }
}
```

## Current Behavior

On http://localhost:8080/

```json
{
  "test": {
    "userAvailable": true,
    "is_user_available": true
  }
}
```
