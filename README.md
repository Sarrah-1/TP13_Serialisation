# TP 13 : Sérialisation en Java

## Structure du dépôt

```
├── TPSerialization/
│   └── src/com/example/tp/
│       ├── Employee.java
│       ├── SerializationUtil.java
│       └── Main.java
├── TPExternalizable/
│   └── src/com/example/tp/
│       ├── ChatMessage.java
│       ├── ChatHistory.java
│       └── Main.java
└── images/
```

## Exercice 1 : Serializable (TPSerialization)

Sérialisation d'une liste d'employés dans un fichier binaire `employees.ser`, puis lecture du fichier pour restaurer les objets.

| Classe | Rôle |
|--------|------|
| `Employee` | Classe métier `Serializable` (id, name, salary, password) |
| `SerializationUtil` | Méthodes `serializeEmployees` et `deserializeEmployees` |
| `Main` | Crée les employés, les sérialise, les relit et les affiche |

Le champ `password` est déclaré `transient` : il n'est pas enregistré dans le fichier. Après la désérialisation, il vaut donc `null` (valeur par défaut d'un objet `String`).

## Exercice 2 : Externalizable (TPExternalizable)

Sauvegarde et chargement d'un historique de chat dans un fichier binaire `chat.ser`, avec un format contrôlé manuellement.

| Classe | Rôle |
|--------|------|
| `ChatMessage` | Implémente `Externalizable` avec `writeExternal` et `readExternal` |
| `ChatHistory` | Méthodes `save` et `load` pour une liste de messages |
| `Main` | Crée l'historique, le sauvegarde, le recharge et l'affiche |

Le champ `length` n'est pas enregistré : il est recalculé à partir du message lors de la lecture. Un numéro de version du format (`FORMAT_VERSION`) permet de détecter un fichier écrit avec un format différent.


## Captures d'écran

### Exercice 1 : Serializable

<img width="563" height="164" alt="image" src="https://github.com/user-attachments/assets/bef68bb7-cfd1-47c9-997e-c568f8bba44e" />

### Exercice 2 : Externalizable

<img width="593" height="161" alt="image" src="https://github.com/user-attachments/assets/0207e628-c090-4af1-a466-c6c30d364cda" />

## Auteur

OUADAY SARA
