pipeline {
    agent any

    tools {
        maven 'Maven3'  // Use the exact Maven name you configured in Jenkins
    }

    stages {
        stage('Build') {
            steps {
                bat 'echo Building the project...'
                bat 'mvn clean install'
            }
        }
    }
}
