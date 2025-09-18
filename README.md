# Spring lombok issue

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
