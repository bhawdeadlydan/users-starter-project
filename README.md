# Users List

Users list is a project made from play-scala generater seed project.
The purpose of this project is to demonstrate the usage of Play framework.

Since no special formatting is needed basic HTML and JS have been used here.
No API Security has been implemented.

## Endpoints
The current endpoints supported are:

- [Default route](https://users-starter-project.herokuapp.com/) show users list on web.
- [/api/users route](https://users-starter-project.herokuapp.com/api/users) to show the users API data.


## Deployment
This app is deployed to heroku at [here](https://users-starter-project.herokuapp.com/)


## Docker Image
This repo uses the [sbt native packager](https://www.scala-sbt.org/sbt-native-packager/formats/docker.html) for creation of docker images.

1. Generate docker image using.
    ```
    sbt docker:publishLocal
   ```
2. Tag and push the image
    ```
    docker tag users-repo-list:1.0-SNAPSHOT bhawdeadlydan/users-repo-list:1.0-SNAPSHOT
    docker push bhawdeadlydan/users-repo-list:1.0-SNAPSHOT
    ```
3. Run the application using: 
    ```
    docker run -p 9000:9000  bhawdeadlydan/users-repo-list:1.0-SNAPSHOT
    ```
