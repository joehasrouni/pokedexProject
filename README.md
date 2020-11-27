After cloning this repository, if you have a Java environment on your machine, you can directly run the commands.


# Build the project

```
./gradlew build
```



# Run the application

```
./gradlew run
```

To run the application with command line arguments : if you input one argument the application will search from the API, if you entered the database file name in the second argument the application will gets its data from the local database.

```
./gradlew run --args="premierArgument secondArgument"
```


# Run the tests

```
./gradlew test
```

# Running on windows OS
you may have to run the application from Intellij IDE to get the desired output. (cannot etablish database connection from BASH)
you can use the terminal provided by Intellij.