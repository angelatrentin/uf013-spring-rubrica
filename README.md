# Spring Rubrica

Applicazione Spring per la gestione di una rubrica di contatti tramite database MySQL su container Docker

## Dependencies
- Spring Web (sviluppo webapp intercetta le richieste aspettandosi una pagina web)
- Spring Dev Tools (opzionale, gestisce il riavvio rapido dell'applicazione)
- ThymeLeaf (templating HTML per pagine dinamiche)
- Spring Data JPA (tecnologia di gestione di DataBase)
- Driver MySQL (connettore al DBMS)
- Validator (valiazione dei form)
- Lombok (boilerplate code, ovvero codice prolisso e trascurabile che l'applicazione necessita, ma che il programmatore non ha necessità di scrivere)


Per aggiungere nuove dependencies usare l'opzione `Spring Initialirz: Add starters...`

## Avvio applicazione

1. Creazione del contaier per il database specificato in `docker-compose.yaml`

```bash
docker compose up mysql-db [-d]
```

2. Verificare il corretto avvio del container
```bash
docker compose ps
```

3. Terminare l'esecuzione del container
```bash
docker compose down
```

