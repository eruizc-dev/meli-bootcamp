### Módulo 4 - Java

Instalar *jdk11** y *Maven*

```
sudo pacman -S jdk11-openjdk maven
```

 1. Crear proyecto con *Maven*

    mvn archetype:generate

 2. Compilar proyecto con *Maven*

    mvn package

 3. Ejecutar un proyecto compilado (expandir los * y tab)

    java -cp target/*.java <tab>

Makefile de ejemplo

```makefile
all: run

build:
	mvn package

run:
	java -cp ./target/ejercicio1-1.0-SNAPSHOT.jar ejercicio1.App
```

### Gitignore ([credits](https://github.com/github/gitignore/blob/master/Java.gitignore))

```Gitignore
# Compiled class file
*.class

# Log file
*.log

# BlueJ files
*.ctxt

# Mobile Tools for Java (J2ME)
.mtj.tmp/

# Package Files #
*.jar
*.war
*.nar
*.ear
*.zip
*.tar.gz
*.rar

# virtual machine crash logs, see http://www.java.com/en/download/help/error_hotspot.xml
hs_err_pid*
```
